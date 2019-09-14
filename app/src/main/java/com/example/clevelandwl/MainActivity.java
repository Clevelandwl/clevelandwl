package com.example.clevelandwl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button unlock;
    TextView ok;
    private final int CONFIG_REQUEST = 1234;
    private Boolean lock = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unlock = findViewById(R.id.a1unlock);
        unlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickUnlock();
            }
        });
    }


    public void clickUnlock (){
                Intent pad = new Intent(MainActivity.this, Access_control.class );
                startActivityForResult(pad,CONFIG_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        ok = findViewById(R.id.a1status);
        if (requestCode == CONFIG_REQUEST) {
            if (resultCode == RESULT_OK) {
                lock =  data.getExtras().getBoolean("result");
                if (lock) {
                    ok.setText(R.string.statusC);
                }
                else{
                    ok.setText(R.string.status);

                }
            }
        }
    }
}
