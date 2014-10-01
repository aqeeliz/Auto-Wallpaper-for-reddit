package com.autowallpaper;

import android.app.Application;

public class MainApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
				
		Settings.setupSettings(this);
	}

}
