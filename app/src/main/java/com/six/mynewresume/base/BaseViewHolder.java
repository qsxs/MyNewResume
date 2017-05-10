package com.six.mynewresume.base;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * base
 * Created by Padaye on 2017/5/10.
 */

public class BaseViewHolder  extends RecyclerView.ViewHolder {
    private View convertView;
    private SparseArray<View> views = new SparseArray<>();

    public BaseViewHolder(View itemView) {
        super(itemView);
        convertView= itemView;
    }

    public <T extends View> T getView(int viewId) {
        View view = this.views.get(viewId);
        if(view == null) {
            view = this.convertView.findViewById(viewId);
            this.views.put(viewId, view);
        }

        return (T)view;
    }
}
