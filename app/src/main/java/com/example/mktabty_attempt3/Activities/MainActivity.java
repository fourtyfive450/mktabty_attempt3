package com.example.mktabty_attempt3.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mktabty_attempt3.BackIDs;
import com.example.mktabty_attempt3.R;
import com.example.mktabty_attempt3.BackIDs;


public class MainActivity extends AppCompatActivity {
    Button login,regi_bu;
    TextView skipRisg,regis_using;
    ImageView fb,google,twiter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Flag","Main b4"+BackIDs.Flag);
        Log.e("Flag","Main After"+BackIDs.Flag);
        login= (Button) findViewById(R.id.button);
        regi_bu= (Button) findViewById(R.id.button2);
        skipRisg= (TextView) findViewById(R.id.textView2);
        regis_using =(TextView) findViewById(R.id.textView5);
        fb=(ImageView) findViewById(R.id.imageView6);
        twiter=(ImageView) findViewById(R.id.imageView4);
        google=(ImageView) findViewById(R.id.imageView5);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://google.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        twiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://twitter.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.facebook.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
            }
        });
        regi_bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, registration.class);
                startActivity(i);
            }
        });
        Typeface face = Typeface.createFromAsset(getAssets(),"font1.otf");
        Typeface face1 = Typeface.createFromAsset(getAssets(),"font2.otf");

        login.setTypeface(face);
        regi_bu.setTypeface(face);
        skipRisg.setTypeface(face1);
        skipRisg.setTypeface(face);
        regis_using.setTypeface(face);
    }
}
