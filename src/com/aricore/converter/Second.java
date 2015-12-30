package com.aricore.converter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		Button blen = (Button) findViewById(R.id.button1);
		Button btemp = (Button) findViewById(R.id.button2);
		Button bmon = (Button) findViewById(R.id.button3);
		
		blen.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Second.this, Length.class));
			}
		});
		
		btemp.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Second.this, Temp.class));
			}
		});

		bmon.setOnClickListener(new OnClickListener() {
	
			public void onClick(View v) {
		// TODO Auto-generated method stub
		startActivity(new Intent(Second.this, Money.class));
	}
});
	
	}

}
