package com.example.mycpuls;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button button_open;
    private Button button_close;
    private MyGps myGps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myGps = new MyGps();
        initView();

    }

    private void initView() {
        button_open = (Button) findViewById(R.id.button_open);
        button_close = (Button) findViewById(R.id.button_close);

        button_open.setOnClickListener(this);
        button_close.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_open:
                myGps.stringFromJNI(95,1);
                break;
            case R.id.button_close:
                myGps.stringFromJNI(95,0);
                break;
        }
    }
}
