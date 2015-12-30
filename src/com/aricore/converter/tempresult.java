package com.aricore.converter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class tempresult extends Activity {
	private static final float NULL = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tempresult);
		
		float temp0 = 0, temp1 = 0, temp2 = 0;
		
		TextView unit0 = (TextView) findViewById(R.id.val0);
		TextView unit1 = (TextView) findViewById(R.id.val1);
		TextView unit2 = (TextView) findViewById(R.id.val2);
		
		TextView dataunit = (TextView) findViewById(R.id.givenunit);
		dataunit.setText(getIntent().getExtras().getString("tempunit").toString());
		TextView dataval = (TextView) findViewById(R.id.givenval);
		dataval.setText(String.valueOf(getIntent().getExtras().getFloat("tempval")));
		
		String giventemp = getIntent().getExtras().getString("tempunit").toString().toLowerCase();
		
		//kelvin
		if(giventemp.equals("kelvin")){
			temp0 = getIntent().getExtras().getFloat("tempval");
			temp1 = (float) (-272.15 + temp0);
			temp2 = temp1*(9/5)+32;
		}
		//Celsius
		else if(giventemp.equals("celsius")){
			temp1 = getIntent().getExtras().getFloat("tempval");
			temp0 = (float) (272.15 + temp1);
			temp2 = temp1*(9/5)+32;
		}
		//Fahrenheit
		else if(giventemp.equals("fahrenheit")){
			temp2 = getIntent().getExtras().getFloat("tempval");
			temp1 = (float) ((temp2-32)*(0.555));
			temp0 = (float) (temp1 + 272.15);
		}
		else{
			temp0 = temp1 = temp2 = NULL;
		}
		
		//Final Value Entry
		
		unit0.setText(String.valueOf(temp0));
		unit1.setText(String.valueOf(temp1));
		unit2.setText(String.valueOf(temp2));
	}

}
