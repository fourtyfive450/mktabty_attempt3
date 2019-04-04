package com.example.mktabty_attempt3.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mktabty_attempt3.R;

public class Login extends AppCompatActivity {
    EditText editText1,editText2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button b = findViewById(R.id.button3);
        TextView t = findViewById(R.id.textView);
//        editText1 =findViewById(R.id.editText);
        editText2 = findViewById(R.id.pass_reg_et);
        b1=findViewById(R.id.button3);
        b2=findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, Home.class);
                startActivity(i);
            }
        });
        Typeface face = Typeface.createFromAsset(getAssets(),"font1.otf");
        Typeface face1 = Typeface.createFromAsset(getAssets(),"font2.otf");

        t.setTypeface(face);
        b1.setTypeface(face);
        b2.setTypeface(face1);
//        editText2.setTypeface(face);
    }
}
