package com.js.askeleton;

import com.js.android.MyActivity;
import com.js.android.TouchEventGenerator;
import com.js.basic.Point;
import com.js.basic.UserEventSource;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class SkeletonActivity extends MyActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View view = prepareView();
		setContentView(view);
	}

	private View prepareView() {

		View view = new View(this);
		view.setBackgroundColor(Color.GREEN);

		mTouchEventGenerator = new TouchEventGenerator();
		mTouchEventGenerator.setView(new UserEventSource() {
			@Override
			public Point viewToWorld(Point viewPt) {
				return new Point(viewPt);
			}
		}, view);
		return view;
	}

	private TouchEventGenerator mTouchEventGenerator;
}
