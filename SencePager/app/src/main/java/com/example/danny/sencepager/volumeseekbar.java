package com.example.danny.sencepager;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;

public class volumeseekbar extends Activity implements SeekBar.OnSeekBarChangeListener{

    private TextView mdefaulttextview;
    private TextView mselftextview;
    private SeekBar  mSystem;
    private SeekBar  mSelf;

    @Override
    protected void onResume() {
        SharedPreferences sharedPreferences = getSharedPreferences("SystemSeekbar",Activity.MODE_PRIVATE);
        String systemvalue = sharedPreferences.getString("systemvolumvalue", "0");
        int i=Integer.parseInt(systemvalue);
        mdefaulttextview.setText(getResources().getText(R.string.system_seekbar_text) + systemvalue);
        mSystem.setProgress(i);

        String selfvalue =sharedPreferences.getString("selfvolumvalue","0");
        mselftextview.setText(getResources().getText(R.string.self_seekbar_text)+selfvalue);
        int i2=Integer.parseInt(selfvalue);
        mSelf.setProgress(i2);
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volumeseekbar);
        mdefaulttextview = (TextView) findViewById(R.id.defaulttextview);
        mSystem = (SeekBar) findViewById(R.id.systemdef);
        mSystem.setOnSeekBarChangeListener(this);

        mselftextview  = (TextView) findViewById(R.id.selftextview);
        mSelf = (SeekBar) findViewById(R.id.self);
        mSelf.setOnSeekBarChangeListener(this);

    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//实例化SharedPreference的一个对象，新建一个叫SystemSeekBar的XML文件，数据就是写在这个XML文件里边
        SharedPreferences sharedPreferences =  getSharedPreferences("SystemSeekbar",Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();

        switch (seekBar.getId()){

            case R.id.systemdef :{
                final  String systemvalue;
                systemvalue=String.valueOf(seekBar.getProgress());
                mdefaulttextview.setText(getResources().getText(R.string.system_seekbar_text)+":"+String.valueOf(seekBar.getProgress()));
                editor.putString("systemvolumvalue",systemvalue);
                editor.commit();
                break;
             }
            case R.id.self:{
                String selfvalue;
                selfvalue=String.valueOf(seekBar.getProgress());
                mselftextview.setText(getResources().getText(R.string.self_seekbar_text) + ":" + String.valueOf(seekBar.getProgress()));
                editor.putString("selfvolumvalue", selfvalue);
                editor.commit();
                break;
            }
            default:
                break;
        }
 }

}
