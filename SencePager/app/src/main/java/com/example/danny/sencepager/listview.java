package com.example.danny.sencepager;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.view.menu.MenuView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class listview extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        setListAdapter(new  TextImageAdapter(this));
    }
    private class TextImageAdapter extends BaseAdapter{
        //这个Adapter就是来把数据和图片逐行填充到每一个list里边
        private Context mContext;
        public TextImageAdapter(Context context){
            this.mContext=context;
        }

        @Override
        public int getCount() {
            return texts.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null){
                convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item,null);

                ItemViewCache viewCache = new ItemViewCache();
                viewCache.mImageView = (ImageView)convertView.findViewById(R.id.image);
                viewCache.mTextView = (TextView)convertView.findViewById(R.id.text);

                convertView.setTag(viewCache);
            }
            ItemViewCache cache = (ItemViewCache)convertView.getTag();
                cache.mTextView.setText(texts[position]);
                cache.mImageView.setImageResource(images[position]);
                return convertView;
            }

    }
    public static class ItemViewCache{
        public TextView mTextView;
        public ImageView mImageView;
    }


    //定义两个数组分别来放置String的值和image的位置
    private String[] texts = new String[]{"警戒","彩灯","闹钟"};
    private int[]  images = new int[]{R.mipmap.list_mute,R.mipmap.list_light,R.mipmap.list_ala};


    private String s;


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //可以通过ListID来判断，每一个list的ID来进行判断
        //也可以通过list的文本来进行跳转判断是不是等于该listview的String来进行判断
        //Function 1

        if(id==0){
            String str=texts[position];
            Intent intent =new Intent();
            intent.setClass(listview.this, AlarmClockSetting.class);
            intent.putExtra("Alarm",str);
            startActivity(intent);
        }
        //Function 2
        /*
        if (texts[position] =="警戒"){
            Intent intent =new Intent();
            intent.setClass(listview.this,AlarmClockSetting.class);
            startActivity(intent);
            }
            */
        if(id==1){
            String str=texts[position];
            Intent intent =new Intent();
            intent.setClass(listview.this, AlarmClockSetting.class);
            intent.putExtra("Alarm",str);
            startActivity(intent);
        }
        if(id==2){
            String str=texts[position];
            Intent intent =new Intent();
            intent.setClass(listview.this, AlarmClockSetting.class);
            intent.putExtra("Alarm",str);
            startActivity(intent);
        }
        Toast.makeText(listview.this, "您点击了"+texts[position]+id, Toast.LENGTH_SHORT).show();
    }







}

