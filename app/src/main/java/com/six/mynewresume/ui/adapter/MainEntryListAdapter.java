package com.six.mynewresume.ui.adapter;

import android.widget.ImageView;
import android.widget.TextView;

import com.six.mynewresume.R;
import com.six.mynewresume.base.BaseRecyclerAdapter;
import com.six.mynewresume.base.BaseViewHolder;
import com.six.mynewresume.model.Entry;

import java.util.List;

/**
 * 主页入口列表适配器
 * Created by Padaye on 2017/5/10.
 */

public class MainEntryListAdapter extends BaseRecyclerAdapter<Entry> {

    public MainEntryListAdapter(List<Entry> data) {
        super(R.layout.item_entry_list, data);
    }

    @Override
    protected void fillData(BaseViewHolder holder, Entry entry, int position) {
        ImageView icon = holder.getView(R.id.entry_icon);
        TextView title = holder.getView(R.id.entry_title);
        icon.setImageResource(entry.getIconResId());
        title.setText(entry.getTitle());
    }
}
