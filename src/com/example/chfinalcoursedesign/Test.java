package com.example.chfinalcoursedesign;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;

public class Test extends Activity {
	private int index = 0;// ��ǰ��ʾͼ�������
	private int[] images = new int[] { R.drawable.h1, R.drawable.h2, R.drawable.h3, R.drawable.h4 };
	private String[] texts = new String[] { "����һ��", "����һ��", "����һ��", "�������" };

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		final TextView text = (TextView) findViewById(R.id.text);
		final TextView textnum = (TextView) findViewById(R.id.textnum);
		// ��ȡͼ���л�������
		final ImageSwitcher imageSwitch1 = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
		imageSwitch1.setFactory(new ViewFactory() {
			public View makeView() {
				return new ImageView(Test.this);
			}
		});
		// ��ʼ����ʾ��һ��ͼƬ
		imageSwitch1.setImageResource(images[index]);
		final SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar1);
		seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {// ��Ӽ�����
			public void onStopTrackingTouch(SeekBar arg0) {
				// ֹͣ����ʱҪִ�еĴ���
			}

			public void onStartTrackingTouch(SeekBar arg0) {
				// ��ʼ����ʱҪִ�еĴ���
			}

			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// λ�øı�ʱҪִ�еĴ���
				index = (int) (arg1 * 0.04);
				text.setText(texts[index]);
				textnum.setText(index + 1 + "/4");
				imageSwitch1.setImageResource(images[index]);
			}
		});
	}
}
