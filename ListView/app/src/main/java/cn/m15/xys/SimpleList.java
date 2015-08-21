package cn.m15.xys;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class SimpleList extends ListActivity {
    private String[] mListStr = {"SimpleList1","SimpleList2","SimpleList3","SimpleList4","SimpleList5"};
    ListView mListView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	mListView = getListView();
	setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mListStr));
	mListView.setOnItemClickListener(new OnItemClickListener() {
	    @Override
	    public void onItemClick(AdapterView<?> adapterView, View view, int position,
		    long id) {
		Toast.makeText(SimpleList.this,"SimpleList" + mListStr[position], Toast.LENGTH_LONG).show();
	    }
	});

	super.onCreate(savedInstanceState);
    }
}
