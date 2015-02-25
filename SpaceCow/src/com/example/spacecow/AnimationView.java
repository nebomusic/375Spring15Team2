package com.example.spacecow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class AnimationView extends View {
	//Field for animation view
	private AnimationView animationView;
	
	//create some actors
			private Actor cow;
			
	//Sensor manager for accelerometer
	private SensorManager sensorManager;
			
			
	//values for accel data
			private float ax = 0;
			private float ay = 0;
			private float az = 0;
	
	//create the handler for animation
	private Handler h;
	private int RATE = 30;// about 30 frames per second

	public AnimationView(Context context, AttributeSet attrs) {
		super(context, attrs);
		//TODO Auto-generated constructor stub
		
		//function to grab touch event data
	
		//initialize cow
		cow = new Actor(context, 300, 300, Color.BLUE, 50);
		cow.setCostume(R.drawable.cow);
	
	}//end on create
		
	public boolean onTouchEvent(MotionEvent event) {
		int action = event.getActionMasked(); //get type of action
		int actionIdex = event.getActionIndex();//index of action
		
		//set Position of cow to touch data
		cow.goTo((int)event.getX(), (int)event.getY());
					
		return true;
		
	
	}//on Touch
	public void onDraw(Canvas c) {
		//actors draw
		cow.draw(c);
		
		//Read Accel data and move
		cow.changeDX(ax * -1); //read x
		cow.changeDY(ay);		//read y
		cow.move();
		
		//actors draw themselves
		cow.draw(c);
		
		
		
		//call the Runnable
		h.postDelayed(r, RATE);
		
	}//end on draw
	private Runnable r = new Runnable() {
		
		@Override
		public void run() {
		// TODO Auto-generated constructor stub
			invalidate();
		}
		

};//end constructor
	//modifier fields for acceleration data on x,y, and z
	public void setAX(float x) {
		ax = x;
	}

	public void setAY(float y) {
		ay = y;
	}
	
	public void setAZ(float z) {
		az = z;
	}
	
			
}//end class Animation View
