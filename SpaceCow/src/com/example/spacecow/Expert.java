package com.example.spacecow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Expert extends Activity{

	@Override
	protected void onCreate(Bundle bundle){
		super.onCreate(bundle);
		setContentView(R.layout.activity_expert);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		setContentView(R.layout.activity_expert);
	}
	
	//handles button
	//go back to home
	public void handleClick(View v){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
}//end activity two
