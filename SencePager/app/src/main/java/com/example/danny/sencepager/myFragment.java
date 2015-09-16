package com.example.danny.sencepager;

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
public class myFragment extends Fragment {

    private ImageButton mImageButton;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){

        View view=inflater.inflate(R.layout.fragmen_tittle,container,false);
        mImageButton = (ImageButton)view.findViewById(R.id.buttonImage) ;
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"I am an ImageButton in TittleFragment!",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
