package com.example.android.inputui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView Display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String result = getIntent().getStringExtra("data");
        Display = (TextView)findViewById(R.id.display);
        setResult(result);
    }

    private void setResult(String out){
        Display.setText(out);
    }

}
