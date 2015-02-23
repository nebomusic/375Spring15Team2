package com.example.spacecow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public class AnimationView extends View {

	public AnimationView(Context context, AttributeSet attrs) {
		super(context, attrs);
		//TODO Auto-generated constructor stub
		
		//create some actors
		private Actor cow;
		
		//initialize cow
		cow = new Actor(context, 300, 300, Color.RED, 50);
		cow.setCostume(R.drawable.cow);
	}//end on create
	
	//on Draw
	public void onDraw(Canvas c) {
		//actors move
		//actors draw
		cow.draw(c);
		
		//call runnable for animation
		h.postDelayed(r, RATE);
		
	}//end on draw
}//end class Animation View
