package com.example.danny.sencepager;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    /*
}
    private ListView<View>  listViews;
    private TextView   t1,t2,t3;
    private  ImageView cursor;
    private  int offset = 0;
    private  int bmpW;
    private  int currIndex = 0;

    public  void InitTextView(){
        t1 = (TextView)findViewById(R.id.text1);
        t2 = (TextView)findViewById(R.id.text2);
        t3 =(TextView) findViewById(R.id.text3);
        t1.setOnClickListener(new MyOnClickListener(0));
    }
       */
    private  Button mButton;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.button3);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
               // intent.setAction("android.intent.action.View");
               // Uri address =Uri.parse("www.baidu.com");
                //intent.setData(address);

                startActivity(intent);
            }
        });
    }
}
