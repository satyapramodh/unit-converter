package com.aricore.converter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class lenresult extends Activity {
	private static final float NULL = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lenresult);
		float len0 = 0,len1 = 0,len2 = 0,len3 = 0,len4 = 0,len5 = 0,len6 = 0;
		
		TextView unit0 = (TextView) findViewById(R.id.val0);
		TextView unit1 = (TextView) findViewById(R.id.val1);
		TextView unit2 = (TextView) findViewById(R.id.val2);
		TextView unit3 = (TextView) findViewById(R.id.val3);
		TextView unit4 = (TextView) findViewById(R.id.val4);
		TextView unit5 = (TextView) findViewById(R.id.val5);
		TextView unit6 = (TextView) findViewById(R.id.val6);
		
		TextView dataunit = (TextView) findViewById(R.id.givenlen);
		dataunit.setText(getIntent().getExtras().getString("lengthunit").toString());
		TextView dataval = (TextView) findViewById(R.id.givenval);
		dataval.setText(String.valueOf(getIntent().getExtras().getFloat("lengthval")));
		
		String givenlength = getIntent().getExtras().getString("lengthunit").toString().toLowerCase();
		
		//Centimeter
		if(givenlength.equals("centimeter")){			
			len0 = getIntent().getExtras().getFloat("lengthval");
			len1 = (float) (0.01*len0);
			len2 = (float) (0.001*len1);
			len3 = (float) (3.2808*len1);
			len4 = (float) (39.37*len1);
			len5 = (float) (0.0006213*len1);
			len6 = (float) (1.0936*len1);	
		}
		//Meter
		else if(givenlength.equals("meter")){			
			len1 = getIntent().getExtras().getFloat("lengthval");
			len0 = (float) (100*len1);
			len2 = (float) (0.00001*len0);
			len3 = (float) (3.2808*len1);
			len4 = (float) (39.37*len1);
			len5 = (float) (0.0006213*len1);
			len6 = (float) (1.0936*len1);	
		}
		//Kilometer
		else if(givenlength.equals("kilometer")){			
			len2 = getIntent().getExtras().getFloat("lengthval");
			len1 = (float) (1000*len2);
			len0 = (float) (100*len1);
			len3 = (float) (3.2808*len1);
			len4 = (float) (39.37*len1);
			len5 = (float) (0.0006213*len1);
			len6 = (float) (1.0936*len1);	
		}
		//Foot
		else if(givenlength.equals("foot")){			
			len3 = getIntent().getExtras().getFloat("lengthval");
			len1 = (float) (3.280*len3);
			len0 = (float) (100*len1);
			len2 = (float) (1000*len1);
			len4 = (float) (39.37*len1);
			len5 = (float) (0.0006213*len1);
			len6 = (float) (1.0936*len1);	
		}
		//Inch
		else if(givenlength.equals("inch")){			
			len4 = getIntent().getExtras().getFloat("lengthval");
			len1 = (float) (0.0254*len4);
			len2 = (float) (1000*len1);
			len3 = (float) (3.2808*len1);
			len0 = (float) (100*len1);
			len5 = (float) (0.0006213*len1);
			len6 = (float) (1.0936*len1);	
		}
		//Mile
		else if(givenlength.equals("mile")){			
			len5 = getIntent().getExtras().getFloat("lengthval");
			len1 = (float) (1609.52*len5);
			len2 = (float) (0.001*len1);
			len3 = (float) (3.2808*len1);
			len4 = (float) (39.37*len1);
			len0 = (float) (100*len1);
			len6 = (float) (1.0936*len1);	
		}
		//yard
		else if(givenlength.equals("yard")){			
			len6 = getIntent().getExtras().getFloat("lengthval");
			len1 = (float) (0.9144*len6);
			len2 = (float) (1000*len1);
			len3 = (float) (3.2808*len1);
			len4 = (float) (39.37*len1);
			len5 = (float) (0.0006213*len1);
			len0 = (float) (100*len1);	
		}
		else{
			len1 = len2 = len3 = len4 = len5 = len6 = len0 = NULL;
		}
		
		//Final Value Entry
		
		unit0.setText(String.valueOf(len0));
		unit1.setText(String.valueOf(len1));
		unit2.setText(String.valueOf(len2));
		unit3.setText(String.valueOf(len3));
		unit4.setText(String.valueOf(len4));
		unit5.setText(String.valueOf(len5));
		unit6.setText(String.valueOf(len6));
	
	} 
}
