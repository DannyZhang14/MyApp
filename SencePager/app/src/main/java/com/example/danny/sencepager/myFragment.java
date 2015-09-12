package com.example.danny.sencepager;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Danny on 2015/8/8.
 */
public class myFragment extends Fragment  {

    private ImageButton mImageButton;





    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){

        View view=inflater.inflate(R.layout.fragmen_tittle,container,false);
        mImageButton = (ImageButton)view.findViewById(R.id.buttonImage) ;
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //System.exit(0);     整个程序的杀死重新进入主界面
               // this.finalize();
               getActivity().finish();//是在Fragment里边使用finish的方法，一定要getActivity，不然不能知道是那个activity的finish的方法

            }
        });
        return view;
    }

}
