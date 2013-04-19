package com.example.splashpage;

import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;

public class MyTimerTask extends TimerTask {
	private Activity currentActivity;
	
	public void setActivity(Activity act) {
		currentActivity = act;
	}

	public void run() {
		currentActivity.startActivity(new Intent(currentActivity.getBaseContext(), MainActivity.class));
	}

}
