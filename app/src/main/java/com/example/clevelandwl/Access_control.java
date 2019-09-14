package com.example.clevelandwl;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Access_control extends AppCompatActivity implements View.OnClickListener {
    String pass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accesscontrol);



        Button test = findViewById( R.id.a1submit );
        Button b1 = findViewById( R.id.button);
        Button b2 = findViewById( R.id.button2);
        Button b3 = findViewById( R.id.button3);
        Button b4 = findViewById( R.id.button4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        test.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Boolean result = false;

        switch (view.getId()) {
            case R.id.button:
                pass = pass + "1";
                break;
            case R.id.button2:
                pass = pass + "2";
                break;
            case R.id.button3:
                pass = pass + "3";
                break;
            case R.id.button4:
                pass = pass + "4";
                break;
            case R.id.a1submit:
                if (pass.equals("1234")) {
                    result = true;
                }
                Intent intent = new Intent();
                intent.putExtra("result", result);
                setResult(RESULT_OK, intent);
                finish();
                break;
        }
    }}

