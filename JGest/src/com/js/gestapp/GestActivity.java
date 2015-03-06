package com.js.gestapp;

import com.js.android.MyActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class GestActivity extends MyActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		View view = new View(this);
		view.setBackgroundColor(Color.GREEN);

		setContentView(view);
	}

}
