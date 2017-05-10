package com.six.mynewresume;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.six.mynewresume.base.BaseActivity;
import com.six.mynewresume.model.Entry;
import com.six.mynewresume.ui.adapter.MainEntryListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private RecyclerView list;
    private RecyclerView.Adapter adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void assignViews() {
        super.assignViews();
        list = (RecyclerView) findViewById(R.id.entry_list);

    }

    @Override
    protected void onViewReady() {
        super.onViewReady();
        setToolBar(R.string.app_name, false);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        list.setLayoutManager(new GridLayoutManager(this, 3));
        adapter = new MainEntryListAdapter(getData());
        list.setAdapter(adapter);
    }

    private List<Entry> getData(){
        List<Entry> data = new ArrayList<>();
        data.add(new Entry(R.drawable.abouteducation,"ceshi"));
        data.add(new Entry(R.drawable.aboutme,"ceshi2"));
        data.add(new Entry(R.drawable.awards,"ceshi3"));
        data.add(new Entry(R.drawable.callme,"ceshi3"));
        data.add(new Entry(R.drawable.certificate,"ceshi3"));
        data.add(new Entry(R.drawable.myobject,"ceshi3"));
        data.add(new Entry(R.drawable.abouteducation,"ceshi"));
        data.add(new Entry(R.drawable.aboutme,"ceshi2"));
        data.add(new Entry(R.drawable.awards,"ceshi3"));
        data.add(new Entry(R.drawable.callme,"ceshi3"));
        data.add(new Entry(R.drawable.certificate,"ceshi3"));
        data.add(new Entry(R.drawable.myobject,"ceshi3"));
        return data;
    }
}
