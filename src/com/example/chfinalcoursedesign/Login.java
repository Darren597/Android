package com.example.chfinalcoursedesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		final Button buttonup = (Button) findViewById(R.id.button1);// 获取按钮
		final EditText name = (EditText) findViewById(R.id.editname);// 获取用户名编辑器
		final EditText pas = (EditText) findViewById(R.id.editpas);
		buttonup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// 判断用户名和暗号是否为空或长度为0
				if (name.getText().toString() == null || name.getText().toString().length() == 0
						|| pas.getText().toString() == null || pas.getText().toString().length() == 0) {
					Intent nologin = new Intent(Login.this, Falselog.class);
					startActivity(nologin);
				} else {
					Bundle bun = new Bundle();// 创建Bubble
					bun.putCharSequence("name", name.getText().toString());// 保存用户名信息
					bun.putCharSequence("pas", pas.getText().toString());// 保存暗号密码信息
					// 创建Intent并切换到名为Falselog的Acticity
					Intent login = new Intent(Login.this, Loginto.class);
					login.putExtras(bun);// 向Intent中放入一个携带数据的value
					startActivity(login);// 启动新的Activity
				}
			}
		});
	}
}
