package cn.m15.xys;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class IconList extends ListActivity {
    private String[] mListTitle = { "Icon1", "Icon2", "Icon3", "Icon4","Icon5"};
    private String[] mListStr = { "IconDetail", "IconDetail2", "IconDetail3", "IconDetail4","IconDetail5" };
    ListView mListView = null;
    ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	mListView = getListView();
      
	int lengh = mListTitle.length;
	for(int i =0; i < lengh; i++) {
	    Map<String,Object> item = new HashMap<String,Object>();
	    item.put("image", R.drawable.jay);
	    item.put("title", mListTitle[i]);
	    item.put("text", mListStr[i]);
	    mData.add(item); 
	}
	SimpleAdapter adapter = new SimpleAdapter(this,mData,R.layout.iconlist,
		new String[]{"image","title","text"},new int[]{R.id.image,R.id.title,R.id.text});
        setListAdapter(adapter);
	mListView.setOnItemClickListener(new OnItemClickListener() {
	    @Override
	    public void onItemClick(AdapterView<?> adapterView, View view, int position,
		    long id) {
		Toast.makeText(IconList.this,"Icon" + mListTitle[position] + "IconToast"+mListStr[position], Toast.LENGTH_LONG).show();
	    }
	});
	super.onCreate(savedInstanceState);
    }
}
