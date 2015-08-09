package com.example.danny.sencepager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Danny on 2015/8/9.
 */
public class bottomItem extends Fragment {
    public View onCreate(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        return inflater.inflate(R.layout.bottomcontent,container,false);
    }
}
