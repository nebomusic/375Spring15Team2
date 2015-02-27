package com.example.spacecow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;

public class Beginner extends Activity {
	
	private AnimationView animationView;
	//Sensor Manager for Accelerometer 
	private SensorManager sensorManager;
	
	@Override
	protected void onCreate(Bundle bundle){
		super.onCreate(bundle);
		setContentView(R.layout.activity_beginner);
		animationView = (AnimationView)findViewById(R.id.animationView);
		enableAccelerometerListening();
	}
	private void enableAccelerometerListening() {
    //initialize the sensor manager
	sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
	sensorManager.registerListener(sensorEventListener, 
			sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), 
			SensorManager.SENSOR_DELAY_NORMAL);
	
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		setContentView(R.layout.activity_beginner);
	}
	
	//handles button
	//go back to main activity
	
public void handleClick(View v) {
	Intent intent = new Intent(this, MainActivity.class);
	startActivity(intent);
}

private SensorEventListener sensorEventListener = 
new SensorEventListener() {
@Override
public void onAccuracyChanged(Sensor arg0, int arg1) {
//TODO Auto-generated method stub
//Not Used

}

@Override
public void onSensorChanged(SensorEvent event) {
//gather the xyz from accel
float x = event.values[0];
float y = event.values[1];
float z = event.values[2];

//pass the values to AnimationView object
animationView.setAX(x);
animationView.setAY(y);
animationView.setAZ(z);
}
};// end sensor event listener

}//end Activity One
