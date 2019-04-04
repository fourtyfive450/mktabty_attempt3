package com.example.mktabty_attempt3.Activities;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.mktabty_attempt3.R;

public class registration extends AppCompatActivity {
    Button regis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        regis = findViewById(R.id.button6);
        Typeface face = Typeface.createFromAsset(getAssets(),"font1.otf");
        regis.setTypeface(face);

    }
}
