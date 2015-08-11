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

public class Main2Activity extends Activity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mButton = (Button) findViewById(R.id.buttonlink);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("http://www.baidu.com");
                Intent intent = new Intent();
               // intent.setAction("android.intent.action.View");
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(uri);
                startActivity(intent);
//                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
//                it.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
//                startActivity(it);

            }
        });

    }
}
