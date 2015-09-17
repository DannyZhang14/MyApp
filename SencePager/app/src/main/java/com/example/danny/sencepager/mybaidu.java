package com.example.danny.sencepager;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mybaidu extends Activity {
    private Button mButton;
    private TextView editText;
    private String mUrlAddress;
    private String test="tesdddddddddddddddddddddddddddddddddddt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baiduyixia);




        //点击事件的方法
        mButton = (Button) findViewById(R.id.search);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText = (TextView) findViewById(R.id.addresscontent);
                mUrlAddress=editText.getText().toString();
                Intent intent = new Intent();
                intent.setClass(mybaidu.this,mywebview.class);
                intent.putExtra("searchurl", mUrlAddress);

                startActivity(intent);
                Log.i("test",test);
                Log.i("tag",mUrlAddress);


            }
        });

    }
}
