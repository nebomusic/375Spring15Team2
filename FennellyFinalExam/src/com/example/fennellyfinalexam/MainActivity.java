package com.example.fennellyfinalexam;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
//fields
	
	Button buttonDollars;
	Button buttonYen;
	Button buttonPounds;
	EditText editDollars;
	EditText editYen;
	EditText editPounds;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Bind to XML
				buttonDollars = (Button)findViewById(R.id.buttonDollars);
				buttonYen = (Button)findViewById(R.id.buttonYen);
				buttonPounds = (Button)findViewById(R.id.buttonPounds);
				editDollars = (EditText)findViewById(R.id.editDollars);
				editYen = (EditText)findViewById(R.id.editYen);
				editPounds = (EditText)findViewById(R.id.editPounds);	
		


	
	
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return false;
		
		
	}
	
	
	public void handleClick(View v) {
		//boolean object-> which button was checked
		 EditText editDollars = (EditText)findViewById(R.id.editDollars);
		 double dollars= Double.parseDouble(String.valueOf(editDollars.getText()));
		 
		 EditText editYen = (EditText)findViewById(R.id.editYen);
		 double yen = Double.parseDouble(String.valueOf(editYen.getText()));
		 
		 EditText editPounds = (EditText)findViewById(R.id.editPounds);
		 double pounds = Double.parseDouble(String.valueOf(editPounds.getText()));
	
	}	
	
private String dollarsToYen(double yen) {
	double result = yen * 97.35;
	return String.valueOf(result);
}
private String dollarsToPounds(double pounds) {
	 double result = pounds *.62;
	return String.valueOf(result);
}
	
		}//end class
