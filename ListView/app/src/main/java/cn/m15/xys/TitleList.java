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

public class TitleList extends ListActivity {
    private String[] mListTitle = { "文字列表1", "文字列表2", "文字列表3", "文字列表4","文字列表5"};
    private String[] mListStr = { "文字Toast1", "文字Toast2", "问题Toast3", "文字Toast4","文字Toast5" };
    ListView mListView = null;
    ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	mListView = getListView();
      
	int lengh = mListTitle.length;
	for(int i =0; i < lengh; i++) {
	    Map<String,Object> item = new HashMap<String,Object>();
	    item.put("title", mListTitle[i]);
	    item.put("text", mListStr[i]);
	    mData.add(item); 
	}
	SimpleAdapter adapter = new SimpleAdapter(this,mData,android.R.layout.simple_list_item_2,
		new String[]{"title","text"},new int[]{android.R.id.text1,android.R.id.text2});
        setListAdapter(adapter);
	mListView.setOnItemClickListener(new OnItemClickListener() {
	    @Override
	    public void onItemClick(AdapterView<?> adapterView, View view, int position,
		    long id) {
		Toast.makeText(TitleList.this,"文字" + mListTitle[position] + "Toast"+mListStr[position], Toast.LENGTH_LONG).show();
	    }
	});
	super.onCreate(savedInstanceState);
    }
}
