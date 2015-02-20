package com.example.spacecow;

import android.graphics.Paint;
import android.graphics.Point;
import android.app.Activity;

public class Actor {

	//Fields for Actors
	private Point p; //for location
	private int c; //color
	private int s; //size
	private int dx; //x speed
	private int dy; //y speed
	private Paint paint; //paint object 
	
	
	//Constructor
	public Actor(int x, int y, int col, int size) {
		
		//initialize values
		p = new Point(x, y); //set x,y position
		c = col; //set color
		s = size;
		paint = new Paint();
		paint.setColor(c);
		dx = 20;
		dy = 10;
		
		//functions
		
		//accessors
		public int getX() {
			return p.x;
		}
		
		public int getY() {
			return p.y;
		}
		
		public Paint getPaint() {
			return paint;
		}
		
		public int getSize() {
			return s;
		}
	//modifiers 
		public void setColor(int col) {
			c = col;
			paint.setColor(c);
		}	
			public void goTo(int x, int y) {
				p.x=x;
				p.y=y;
			}
		public void setDX(int speed) {
			dx=speed;
		}
		
		public void setDY(int speed) {
			dy = speed;
		}
		public void changeDX(float a) {
			dx += a;
		}
		
		
		
	}//end constructor
}//end class
