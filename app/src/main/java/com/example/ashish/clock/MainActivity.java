package com.example.ashish.clock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {
    AnalogClock analog;
    DigitalClock digit;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analog =(AnalogClock)findViewById(R.id.analog);
        digit =(DigitalClock)findViewById(R.id.digit);
        btn =(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (digit.getVisibility() == DigitalClock.GONE){
                    digit.setVisibility(DigitalClock.VISIBLE);
                    analog.setVisibility(AnalogClock.GONE);
                }else {
                    digit.setVisibility(DigitalClock.GONE);
                    analog.setVisibility(AnalogClock.VISIBLE);
                }
            }
        });
    }
}
