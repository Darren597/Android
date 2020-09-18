package com.example.chfinalcoursedesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Loginto extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logto);
		Intent intent = getIntent();
		Bundle bun = intent.getExtras();

		final TextView name = (TextView) findViewById(R.id.nametext);
		name.setText(bun.getString("name"));
		final TextView pas = (TextView) findViewById(R.id.pastext);
		pas.setText(bun.getString("pas"));

		final Button buttonup = (Button) findViewById(R.id.button1);

		buttonup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent nologin = new Intent(Loginto.this, Test.class);
				startActivity(nologin);
			}
		});
	}
}
