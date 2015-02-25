package com.example.spacecow;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.app.Activity;
import android.content.Context;

public class Actor {

	//Fields for Actors
	private Point p; //for location
	private int c; //color
	private int s; //size
	private int dx; //x speed
	private int dy; //y speed
	private Paint paint; //paint object 
	
	//context
	private Context aContext;
	
	//integer for drawable resource
	private int costume;
	
	//stores for graphic costume
	private BitmapDrawable graphic;
	
	//Constructor
	public Actor(Context context, int x, int y, int col, int size) {
		
		//initialize values
		p = new Point(x, y); //set x,y position
		c = col; //set color
		s = size;
		paint = new Paint();
		paint.setColor(c);
		dx = 20;
		dy = 10;
		
		//set the context
		aContext = context;
	}//end constructor	
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
		
		public void changeDY(float a) {
			dy += a;
		}
		
		public void move() {
			p.x += dx;
			p.y += dy;
		}
		//setters
		
		public void setCostume(int cost) {
			costume = cost;
			graphic = (BitmapDrawable)aContext.getResources().getDrawable(costume);
		}
	
		public Bitmap getBitmap() {
			return graphic.getBitmap();
		}
		
		public void draw(Canvas c) {
			c.drawBitmap(getBitmap(), p.x, p.y, paint);
		}
}//end class
