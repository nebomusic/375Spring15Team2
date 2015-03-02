package com.example.fennellyfinalexam;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	
	//handle click
	public void handleCick (View v) {
	
		
	}
			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		//Bind to XML
		buttonDollars = (Button)findViewById(R.id.buttonDollars);
		buttonYen = (Button)findViewById(R.id.buttonYen);
		buttonPounds = (Button)findViewById(R.id.buttonPounds);
		editDollars = (EditText)findViewById(R.id.editDollars);
		editYen = (EditText)findViewById(R.id.editYen);
		editPounds = (EditText)findViewById(R.id.editPounds);	
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		 switch(v.getId()) {
		 case R.id.buttonDollars:
			 if(clicked) {
				 String cel= fahrenheitToCelsius(currency);
				 text2.setText(cel);
			 }
		 case R.id.buttonDollars:
			 if(clicked) {
				 String fah= celsiusToFahrenheit(currency);
				 text2.setText(fah);
			 }
			 break;
		 }
		 
	}

	private String dollarsToYen(double currency) {
		double yen = currency * 97.35;
		return String.valueOf(currency);
	}
	private String dollarsToPounds(double currency) {
		double pounds = currency * .62;
		return String.valueOf(currency);
	}

		
			 
	
	
}
//end class
