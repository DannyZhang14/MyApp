package com.example.danny.sencepager;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ShareReference extends ActionBarActivity {
    private Button writeButton1;
    private Button readButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sharereference);

        writeButton1 = (Button) findViewById(R.id.writedata);
        writeButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences mySharePreference = getSharedPreferences("test", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = mySharePreference.edit();
                editor.putString("name", "Danny");
                editor.putInt("age", 23);
                editor.commit();
                Toast.makeText(ShareReference.this,"写入数据成功",Toast.LENGTH_LONG).show();
            }
        });

        readButton = (Button) findViewById(R.id.readdata);
        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mySharePreference = getSharedPreferences("test",Activity.MODE_PRIVATE);
                String name = mySharePreference.getString("name", "test1");
                int age = mySharePreference.getInt("age",0);
                Toast.makeText(ShareReference.this,"读取数据如下"+name+age,Toast.LENGTH_LONG).show();

            }
        });
    }







}
