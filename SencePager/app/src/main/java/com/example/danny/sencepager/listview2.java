package com.example.danny.sencepager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class listview2 extends ActionBarActivity {
    private static final String[] strs = new String[] {
        "first", "second", "third", "fourth", "fifth"};
    private ListView lv;
    //定义一个String数组用来显示ListView的内容/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview2);

        lv = (ListView) findViewById(R.id.listview22);//得到ListView对象的引用 /*为ListView设置Adapter来绑定数据*/
        lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_checked, strs));
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

    }

}