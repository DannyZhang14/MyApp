package com.example.danny.sencepager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private  Button mButton1;
    private  Button mButton2;
    private  Button mButton3;
    private  Button mButton4;
    private  Button mButton5;
    private  Button mButton6;
    private  TextView tvName;
    private  TextView tvAge;
    private  ImageButton mImageButton;
    private  String name;
    private  String   age;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageButton = (ImageButton)findViewById(R.id.buttonImage);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mButton1 = (Button)findViewById(R.id.button1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 new AlertDialog.Builder(MainActivity.this).setTitle("系统提示").setMessage("确认退出ViewPager？")
                         .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                         @Override

                         public void onClick(DialogInterface dialog, int which) {
                              finish();
                         }
                         })
                         .setNegativeButton("返回",new DialogInterface.OnClickListener() {
                         @Override

                        public void onClick(DialogInterface dialog, int which) {//响应事件

                            // TODO Auto-generated method stub

                            Log.i("alertdialog", " 请保存数据！");

                        }

                    }).show();



//                System.exit(1);
            }
        });
        mButton3 = (Button) findViewById(R.id.button3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,myViewPager.class);
                startActivity(intent);
            }
        });

        mButton4 =(Button) findViewById(R.id.button4);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,getString(R.string.version),Toast.LENGTH_LONG).show();
            }
        });

        mButton5 =(Button) findViewById(R.id.button5);

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                tvAge =(TextView) findViewById(R.id.age);
                age = tvAge.getText().toString();
                tvName =(TextView) findViewById(R.id.name);
                name=tvName.getText().toString();
                //如果没有输入年龄那么就弹出一个对话框来提示用户应输入年龄，此时页面并不跳转。
                if (age ==null){
                    Toast.makeText(MainActivity.this,"请输入年龄",Toast.LENGTH_LONG).show();

                }
                    else {
                    //第一个参数是传递到下一个页面所需要的的值，第二个参数是在这一个activity中的值
                    i.putExtra("a", age);
                    i.putExtra("b", name);
                    i.setClass(MainActivity.this, showinfo.class);
                    startActivity(i);
                    }
            }
        });

        mButton6 = (Button) findViewById(R.id.button6);
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent();
                i.setClass(MainActivity.this,listview.class);
                startActivity(i);
            }
        });
    }
}
