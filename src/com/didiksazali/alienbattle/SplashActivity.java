package com.didiksazali.alienbattle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.MotionEvent;

public class SplashActivity extends Activity {
	protected boolean _aktif = true;
	protected int splash_ = 5000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		Thread splashTread = new Thread() {
			@Override
			public void run() {
				try {
					int delay_ = 0;
					while (_aktif && (delay_ < splash_)) {
						sleep(100);
						if (_aktif) {
							delay_ += 100;
						}
					}
				} catch (InterruptedException e) {
				} finally {
					finish();
					Intent panggil_class = new Intent(SplashActivity.this, DFTemplateActivity.class);
					startActivityForResult(panggil_class, 0);
				}
			}
		};
		splashTread.start();
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			_aktif = false;
		}
		return true;
	}
	@Override
	public void onBackPressed() {
		finish();
		System.exit(0);
	}

}