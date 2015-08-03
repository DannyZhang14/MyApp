package com.dannyzhang.activeandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.activeandroid.ActiveAndroid;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActiveAndroid.initialize(this.getApplication());


        Gateway gateway = new Gateway();
        gateway.Occ = "DannyOcc";
        gateway.Switch = "DannySwitch";
        gateway.windowSensor = "DannyWS";
        gateway.save();

        //数据库写入值
        Gateway gateway1 = new Gateway();
        gateway1.Occ = "DannyOcc1";
        gateway1.Switch = "DannySwitch1";
        gateway1.windowSensor ="DannyWS";
        gateway1.save();


        Item item = new Item();
        item.name = "Danny";
        item.save();//保存数据库
    }


}
