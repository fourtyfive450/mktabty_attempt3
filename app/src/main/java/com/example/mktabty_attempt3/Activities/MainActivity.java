package com.example.mktabty_attempt3.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.mktabty_attempt3.BackIDs;
import com.example.mktabty_attempt3.R;
import com.example.mktabty_attempt3.BackIDs;


public class MainActivity extends AppCompatActivity {
    Button login,regi_bu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Flag","Main b4"+BackIDs.Flag);
        BackIDs.Flag=true;
        Log.e("Flag","Main After"+BackIDs.Flag);
        login= (Button) findViewById(R.id.button);
        regi_bu= (Button) findViewById(R.id.button2);
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

    }
}
