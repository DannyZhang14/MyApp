package com.example.danny.sencepager;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class AlarmClockSetting extends ActionBarActivity {
    private Button mButton;
    private String getData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarmclocksetting_layout);
        Intent intent =getIntent();
        getData = intent.getStringExtra("Alarm");
        mButton=(Button)findViewById(R.id.alarm);
        mButton.setText(getData);

    }


}
