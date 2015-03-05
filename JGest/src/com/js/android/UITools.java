package com.js.android;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;

import static com.js.basic.Tools.*;

public final class UITools {

	public static final boolean SET_DEBUG_COLORS = false && DEBUG_ONLY_FEATURES;

	private static int debugColors[] = {
			//
			// check out http://www.colorpicker.com/
			//
			0x10, 0x10, 0xe0, // dark blue
			0x37, 0x87, 0x3E, // dark green
			0x73, 0x5E, 0x22, // brown
			0xC7, 0x32, 0x00, // dark red
			0x8C, 0x26, 0xBF, // purple
			0x82, 0xB6, 0xBA, // blue/gray
			0xA3, 0x62, 0x84, // plum
			0xC7, 0x92, 0x00, // burnt orange
	};

	public static int debugColor() {
		return debugColor(sDebugColorIndex++);
	}

	public static int debugColor(int index) {
		index = myMod(index, debugColors.length / 3) * 3;
		return Color.argb(255, debugColors[index], debugColors[index + 1],
				debugColors[index + 2]);
	}

	public static void applyDebugColors(View view) {
		if (SET_DEBUG_COLORS)
			view.setBackgroundColor(debugColor());
	}

	/**
	 * Construct a LinearLayout
	 * 
	 * @param context
	 * @param vertical
	 *            true if it is to have a vertical orientation
	 */
	public static LinearLayout linearLayout(Context context, boolean vertical) {
		LinearLayout view = new LinearLayout(context);
		view.setOrientation(vertical ? LinearLayout.VERTICAL
				: LinearLayout.HORIZONTAL);
		UITools.applyDebugColors(view);
		return view;
	}

	/**
	 * Construct LayoutParams for child views of a LinearLayout container with a
	 * particular orientation
	 * 
	 * @param forHorizontalLayout
	 *            if true, constructs params for a containing LinearLayout with
	 *            horizontal orientation: width wraps content, height matches
	 *            container's. If false, width matches container's, height wraps
	 *            content
	 */
	public static LinearLayout.LayoutParams layoutParams(
			boolean forHorizontalLayout) {
		LinearLayout.LayoutParams params;
		if (forHorizontalLayout)
			params = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.MATCH_PARENT);
		else
			params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.WRAP_CONTENT);
		return params;
	}

	/**
	 * Construct LayoutParams for child views of a LinearLayout container
	 * 
	 * @param container
	 * @return LayoutParams appropriate to the container's orientation
	 */
	public static LinearLayout.LayoutParams layoutParams(LinearLayout container) {
		return layoutParams(container.getOrientation() == LinearLayout.HORIZONTAL);
	}

	private static int sDebugColorIndex;
}
