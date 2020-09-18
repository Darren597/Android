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
	private int index = 0;// 当前显示图像的索引
	private int[] images = new int[] { R.drawable.h1, R.drawable.h2, R.drawable.h3, R.drawable.h4 };
	private String[] texts = new String[] { "二零一七", "二零一八", "二零一九", "二零二零" };

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		final TextView text = (TextView) findViewById(R.id.text);
		final TextView textnum = (TextView) findViewById(R.id.textnum);
		// 获取图像切换器对象
		final ImageSwitcher imageSwitch1 = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
		imageSwitch1.setFactory(new ViewFactory() {
			public View makeView() {
				return new ImageView(Test.this);
			}
		});
		// 初始化显示第一张图片
		imageSwitch1.setImageResource(images[index]);
		final SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar1);
		seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {// 添加监听器
			public void onStopTrackingTouch(SeekBar arg0) {
				// 停止滑动时要执行的代码
			}

			public void onStartTrackingTouch(SeekBar arg0) {
				// 开始滑动时要执行的代码
			}

			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// 位置改变时要执行的代码
				index = (int) (arg1 * 0.04);
				text.setText(texts[index]);
				textnum.setText(index + 1 + "/4");
				imageSwitch1.setImageResource(images[index]);
			}
		});
	}
}
