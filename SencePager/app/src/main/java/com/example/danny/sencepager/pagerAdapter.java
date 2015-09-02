package com.example.danny.sencepager;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * Created by LME09 on 2015/9/2.
 */
public class pagerAdapter extends PagerAdapter {
    List<View> viewLists;

    public pagerAdapter(List<View> lists){
        viewLists =lists;
    }

    @Override
    public int getCount() {
        return viewLists.size();
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }

    @Override
    public void destroyItem(View view, int position, Object object) {
        //super.destroyItem(container, position, object);
        ((ViewPager) view).removeView(viewLists.get(position));
    }

    @Override
    public Object instantiateItem(View view, int position) {
        //return super.instantiateItem(container, position);
        ((ViewPager) view).addView(viewLists.get(position),0);
        return viewLists.get(position);
    }
}
