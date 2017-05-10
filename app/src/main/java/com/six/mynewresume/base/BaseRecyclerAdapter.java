package com.six.mynewresume.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Padaye on 2017/5/10.
 */

public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    private List<T> mData;
    private Context mContext;
    private int itemViewLayoutRes;

    public BaseRecyclerAdapter(int resId, List<T> data){
        this.mData = data;
        this.itemViewLayoutRes =resId;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext= parent.getContext();
        return new BaseViewHolder(LayoutInflater.from(mContext).inflate(itemViewLayoutRes,null,false));
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        fillData(holder,mData.get(position),position);
    }

    protected abstract void fillData(BaseViewHolder holder, T t, int position);

    @Override
    public int getItemCount() {
        if (mData == null) {
            return 0;
        }
        return mData.size();
    }
}
