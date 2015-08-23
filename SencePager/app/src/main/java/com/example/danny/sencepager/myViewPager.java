package com.example.danny.sencepager;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class myViewPager extends Activity {

    private ViewPager mPager;
    private List<View> listViews;
    private ImageView cursor;
    private int offset = 0;
    private int currIndex = 0;
    private int bmpW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_view_pager);

    }
    /*
    private void InitTextView(){
        TextView t1 = (TextView) findViewById(R.id.Pager1);
        TextView t2 = (TextView) findViewById(R.id.Pager2);
        TextView t3 = (TextView) findViewById(R.id.Pager3);

        t1.setOnClickListener(new MyOnClickListener(0));
    }
    public class MyOnClickListener implements View.OnClickListener{
        private  int index =0;

        public  MyOnClickListener(int i){
            index = i;
        }
        @Override
        public  void onClick(View v){
            mPager.setCurrentItem(index);
        }
    }

/
    private  void InitViewPager(){
        mPager = (ViewPager) findViewById(R.id.vPager);
        listViews = new ArrayList<View>();
        LayoutInflater mInflater = getLayoutInflater();
        listViews.add(mInflater.inflate(R.layout.layout1,null));
        listViews.add(mInflater.inflate(R.layout.layout2,null));
        listViews.add(mInflater.inflate(R.layout.layout3,null));
        mPager.setAdapter(new MyPagerAdapter(listViews));
        mPager.setCurrentItem(0);
        mPager.setOnPageChangeListener(new MyOnPageChangeListener());

    }
    public class MyPagerAdapter extends PagerAdapter{
        public  List<View> mListViews;

        public MyPagerAdapter(List<View> mListViews){
            this.mListViews = mListViews;
        }
        @Override
        public  void destoryItem(View arg0,int arg1,Objects arg2){
            ((ViewPager) arg0).removeView(mListViews.get(arg1));

        }
        @Override
        public  void finishUpdate(View arg0){

        }
        @Override
        public int getCount(){
            return mListViews.size();
        }
        @Override
        public  Object instantiateItem(View arg0,int arg1){
            ((ViewPager)arg0).addView(mListViews.get(arg1),0);
            return mListViews.get(arg1);
        }
        @Override
        public  boolean isViewFromObject(View arg0,Object arg1){
            return arg0 ==(arg1);
        }
        @Override
        public  void restoreState(Parcelable arg0,ClassLoader arg1){

        }
        @Override
        public  Parcelable saveState(){
            return null;
        }
        @Override
        public void startUpdate(View arg0){

        }
    }



*/
}
