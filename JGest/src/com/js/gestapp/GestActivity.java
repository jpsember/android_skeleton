package com.js.gestapp;

import com.js.android.MyActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class GestActivity extends MyActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(buildContentView());
	}

	/**
	 * Subclasses should override this to set the activity's content view. The
	 * default implementation constructs a GLSurfaceView with an OurGLRenderer
	 */
	protected View buildContentView() {
		View v = new GraphicsTestView2(this);
		return v;
	}

	private static class GraphicsTestView2 extends View {

		public GraphicsTestView2(Context context) {
			super(context);
			setBackgroundColor(Color.GREEN);
		}

	}

}
