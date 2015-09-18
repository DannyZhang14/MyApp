package com.example.danny.sencepager;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class baiduyixia extends Activity {
    private Button mButton;
    private EditText editText;
    private String mUrlAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baiduyixia);
        editText = (EditText) findViewById(R.id.addresscontent);
        mUrlAddress=editText.getText().toString();


        //点击事件的方法
        mButton = (Button) findViewById(R.id.search);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("myUrlAddress",mUrlAddress);
                intent.setClass(baiduyixia.this,mywebview.class);
                startActivity(intent);


            }
        });

    }
}
