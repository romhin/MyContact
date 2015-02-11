package com.mycompany.myapp;

import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;

public class Detail  extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail1);
		Intent intent = getIntent();
		String message = intent.getStringExtra("111");
		TextView contactDetail = (TextView) findViewById(R.id.edit);
		contactDetail.setText(message);
}
	
}
