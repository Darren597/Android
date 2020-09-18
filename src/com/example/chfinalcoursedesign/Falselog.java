package com.example.chfinalcoursedesign;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Falselog extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.falsexml);
		final Button buttonup = (Button) findViewById(R.id.button1);
		buttonup.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
	}
}
