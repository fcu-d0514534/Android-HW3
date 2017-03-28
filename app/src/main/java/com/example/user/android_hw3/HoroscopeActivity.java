package com.example.user.android_hw3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HoroscopeActivity extends AppCompatActivity {

    public static final String HOR_KEY="HOR_KEY";

    private Button bt2;
    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope);


        bt2=(Button)findViewById(R.id.bt2);
        et2=(EditText)findViewById(R.id.et2);


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra(HOR_KEY,et2.getText().toString());
                setResult(MainActivity.SET_NAME,intent);
                finish();
            }
        });

    }
}
