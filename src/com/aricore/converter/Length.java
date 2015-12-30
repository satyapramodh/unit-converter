package com.aricore.converter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;


public class Length extends Activity {
	
	static final String[] lengthelements = new String[] {
			"Centimeter","Meter","Kilometer","Foot","Inch","Mile","Yard"	
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.length);
		
		final AutoCompleteTextView len = (AutoCompleteTextView) findViewById(R.id.autocomplete_length);
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, lengthelements);
	    len.setAdapter(adapter);
	    
	    final EditText val = (EditText) findViewById(R.id.editText1);
	    Button b = (Button) findViewById(R.id.button1);
	    b.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent data = new Intent(Length.this, lenresult.class);
				data.putExtra("lengthunit", len.getText().toString());
				data.putExtra("lengthval", Float.valueOf(val.getText().toString()));
				startActivity(data);
			}
		});
	}
}
