package com.example.spacecow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class AnimationView extends View {

	public AnimationView(Context context, AttributeSet attrs) {
		super(context, attrs);
		//TODO Auto-generated constructor stub
		//create some actors
		private Actor cow;
		//initialize cow
		cow = new Actor(context, 300, 300, Color.RED, 50)
		cow.setCostume(R.drawable.cow);
	}//end on create
}//end class Animation View
