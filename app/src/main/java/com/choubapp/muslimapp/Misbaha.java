package com.choubapp.muslimapp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Misbaha extends AppCompatActivity {
    TextView showcounter;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences prefs = getSharedPreferences(MainActivity.THEME_KEY,0);
        int thm=AboutUs.getCurrentTheme(prefs);
        AboutUs.setCurrentTheme(this, thm);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misbaha);
    }
    public void reset(View v){
        showcounter=findViewById(R.id.counter_text);
        showcounter.setText("0");
    }
    public void counter (View v){
        showcounter=findViewById(R.id.counter_text);
        count= 1 + Integer.parseInt((String) showcounter.getText()) ;
        showcounter.setText(""+count);
    }
}
