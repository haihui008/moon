package com.cool.reboot;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.io.*;

public class MainActivity extends Activity 
{
	Button s1;
	Button r1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		s1 =(Button) findViewById(R.id.s1);
		s1.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1){
					try
					{
						/*Runtime.getRuntime().exec("su -c \"/system/bin/shutdown\"");*/
						Runtime.getRuntime().exec("su -c reboot -p");
					}
					catch (IOException e)
					{    e.printStackTrace();   }




				}
			});
		r1 =(Button) findViewById(R.id.r1);
		r1.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1){
					try
					{
						Runtime.getRuntime().exec("su -c reboot");
					}
					catch (IOException e)
					{    e.printStackTrace();   }




				}
			});
	}}

