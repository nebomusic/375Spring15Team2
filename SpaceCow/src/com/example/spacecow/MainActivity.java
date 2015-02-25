package com.example.spacecow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {
		//Fields for animation view
		private AnimationView animationView;
		
		//Sensor Manager for Accelerometer 
		private SensorManager sensorManager;
	
//Function to switch intents
public void handleClick(View v) {
//which clicked
	switch(v.getId()) {
	case R.id.imageButtonOne:
		//new intent
		Intent intentOne = new Intent(this, Beginner.class);
		//start intent
		startActivity(intentOne);
		break;
	case R.id.imageButtonTwo:
		//create new intent
		Intent intentTwo = new Intent(this, Expert.class);
		startActivity(intentTwo);
		break;
		}//end switch
	}//end handle click
   @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   
        //intialize animation view
     animationView = (AnimationView)findViewById(R.id.animationView);
    
   
       //enable listener
    enableAccelerometerListening();
  
   
    //initialize the sensor manager
	sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
	sensorManager.registerListener(sensorEventListener, 
			sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), 
			SensorManager.SENSOR_DELAY_NORMAL);
    
    }
    
    
    private void enableAccelerometerListening() {
	// TODO Auto-generated method stub
    		
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
	@Override
    protected void onResume() {
    	super.onResume();
    	setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}//end class
