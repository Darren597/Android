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
		final Button buttonup = (Button) findViewById(R.id.button1);// ��ȡ��ť
		final EditText name = (EditText) findViewById(R.id.editname);// ��ȡ�û����༭��
		final EditText pas = (EditText) findViewById(R.id.editpas);
		buttonup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// �ж��û����Ͱ����Ƿ�Ϊ�ջ򳤶�Ϊ0
				if (name.getText().toString() == null || name.getText().toString().length() == 0
						|| pas.getText().toString() == null || pas.getText().toString().length() == 0) {
					Intent nologin = new Intent(Login.this, Falselog.class);
					startActivity(nologin);
				} else {
					Bundle bun = new Bundle();// ����Bubble
					bun.putCharSequence("name", name.getText().toString());// �����û�����Ϣ
					bun.putCharSequence("pas", pas.getText().toString());// ���氵��������Ϣ
					// ����Intent���л�����ΪFalselog��Acticity
					Intent login = new Intent(Login.this, Loginto.class);
					login.putExtras(bun);// ��Intent�з���һ��Я�����ݵ�value
					startActivity(login);// �����µ�Activity
				}
			}
		});
	}
}
