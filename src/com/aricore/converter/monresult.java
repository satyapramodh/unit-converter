package com.aricore.converter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class monresult extends Activity {

		private static final float NULL = 0;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.monresult);
		
			float mon0 = 0, mon1 = 0, mon2 = 0, mon3 = 0;
			
			TextView unit0 = (TextView) findViewById(R.id.val0);
			TextView unit1 = (TextView) findViewById(R.id.val1);
			TextView unit2 = (TextView) findViewById(R.id.val2);
			TextView unit3 = (TextView) findViewById(R.id.val3);
			
			TextView dataunit = (TextView) findViewById(R.id.givenunit);
			dataunit.setText(getIntent().getExtras().getString("moneyunit").toString());
			TextView dataval = (TextView) findViewById(R.id.givenval);
			dataval.setText(String.valueOf(getIntent().getExtras().getFloat("moneyval")));
			
			String givenmoney = getIntent().getExtras().getString("moneyunit").toString().toLowerCase();
			
			//Rupee
			if(givenmoney.equals("rupee")){
				mon0 = getIntent().getExtras().getFloat("moneyval");
				mon1 = (float) (0.0196*mon0);
				mon2 = (float) (0.0148*mon0);
				mon3 = (float) (0.123*mon0);
			}
			//Dollar
			else if(givenmoney.equals("dollar")){
				mon1 = getIntent().getExtras().getFloat("moneyval");
				mon0 = (float) (51*mon1);
				mon2 = (float) (0.0148*mon0);
				mon3 = (float) (0.123*mon0);
			}
			//Euro
			else if(givenmoney.equals("euro")){
				mon2 = getIntent().getExtras().getFloat("moneyval");
				mon0 = (float) (67.43*mon2);
				mon1 = (float) (0.0196*mon0);
				mon3 = (float) (0.123*mon0);
			}
			//Yuan
			else if(givenmoney.equals("yuan")){
				mon3 = getIntent().getExtras().getFloat("moneyval");
				mon0 = (float) (8.13*mon3);
				mon2 = (float) (0.0148*mon0);
				mon1 = (float) (0.0196*mon0);
			}
			else{
				mon0 = mon1= mon2 = mon3 = NULL;
			}
			
			
			//Final Value Entry
			
			unit0.setText(String.valueOf(mon0));
			unit1.setText(String.valueOf(mon1));
			unit2.setText(String.valueOf(mon2));
			unit3.setText(String.valueOf(mon3));
			
		}
}
