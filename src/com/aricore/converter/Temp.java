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

public class Temp extends Activity {
	
	static final String[] tempelements = new String[] {
		"Kelvin","Celsius","Fahrenheit",
};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.temp);
		
		final AutoCompleteTextView temp = (AutoCompleteTextView) findViewById(R.id.autocomplete_temp);
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, tempelements);
	    temp.setAdapter(adapter);
	    
	    final EditText val = (EditText) findViewById(R.id.editText1);
	    Button b = (Button) findViewById(R.id.button1);
	    
	    b.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent data = new Intent(Temp.this, tempresult.class);
				data.putExtra("tempunit", temp.getText().toString());
				data.putExtra("tempval", Float.valueOf(val.getText().toString()));
				startActivity(data);
			}
		});
	
	}

}
