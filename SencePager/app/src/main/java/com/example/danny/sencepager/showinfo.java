package com.example.danny.sencepager;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class showinfo extends ActionBarActivity {
    private TextView tvName2;
    private TextView tvAge2;
    private String name;
    private String age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showinfo);
        tvName2 = (TextView)findViewById(R.id.showname);
        tvAge2 =(TextView)findViewById(R.id.showage);


        Intent i =getIntent();
        name =i.getStringExtra("b");
        age =i.getStringExtra("a");
        tvName2.setText(name);
        tvAge2.setText(age);
        //如果年龄是为空的则设置年龄显示为X
        if (age == null){
            tvAge2.setText("X");
        }
    }


}
