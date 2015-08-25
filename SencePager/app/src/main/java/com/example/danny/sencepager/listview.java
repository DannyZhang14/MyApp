package com.example.danny.sencepager;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

public class listview extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,COUNTRIES));
    }
        private static final String[] COUNTRIES = new String[]{"China","Russia","English","America","France"};
    }

