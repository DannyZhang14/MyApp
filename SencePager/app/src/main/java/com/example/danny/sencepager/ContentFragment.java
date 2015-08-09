package com.example.danny.sencepager;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Danny on 2015/8/9.
 */
public class ContentFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle saveInstanceState){
        return inflater.inflate(R.layout.fragment_content,container,false);
    }
}
