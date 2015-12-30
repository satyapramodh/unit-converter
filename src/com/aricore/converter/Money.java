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

public class Money extends Activity {
	static final String[] moneyelements = new String[] {
		"Rupee","Dollar","Yuan","Euro"
};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.money);
		
		final AutoCompleteTextView mon = (AutoCompleteTextView) findViewById(R.id.autocomplete_money);
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, moneyelements);
	    mon.setAdapter(adapter);
	    
	    final EditText val = (EditText) findViewById(R.id.editText1);
	    Button b = (Button) findViewById(R.id.button1);
	    
	    b.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent data = new Intent(Money.this, monresult.class);
				data.putExtra("moneyunit", mon.getText().toString());
				data.putExtra("moneyval", Float.valueOf(val.getText().toString()));
				startActivity(data);
			}
		});
	}

}
