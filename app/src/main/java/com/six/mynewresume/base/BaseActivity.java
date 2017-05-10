package com.six.mynewresume.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.six.mynewresume.R;

/**
 * Created by Padaye on 2017/5/10.
 */

public class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    protected Toolbar toolbar;
    protected Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext = this;
        assignViews();
        onViewReady();
    }

    /**
     * view分配之后的逻辑主要在这处理
     */
    protected void onViewReady() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    /**
     * 分配各种view
     */
    protected void assignViews() {
    }

    protected int getLayoutId() {
        return R.layout.activity_base;
    }

    @Override
    public void onClick(View v) {

    }

    /**
     * 设置toolbar
     *
     * @param title toolbar标题资源id
     *              默认显示返回键，可以重写 doBack()定义返回键点击事件
     */
    protected void setToolBar(int title) {
        setToolBar(getString(title), true);
    }

    /**
     * 设置toolbar
     *
     * @param title toolbar标题
     *              默认显示返回键，可以重写 doBack()定义返回键点击事件
     */
    protected void setToolBar(CharSequence title) {
        setToolBar(title, true);
    }

    /**
     * 设置toolbar
     *
     * @param title    toolbar标题资源id
     * @param showBack 是否显示返回键，可以重写 doBack()定义返回键点击事件
     */
    protected void setToolBar(int title, boolean showBack) {
        setToolBar(getString(title), showBack);
    }

    /**
     * 设置toolbar
     *
     * @param title    toolbar标题
     * @param showBack 是否显示返回键，可以重写 doBack()定义返回键点击事件
     */
    protected void setToolBar(CharSequence title, boolean showBack) {
        if (toolbar != null) {
            toolbar.setTitle(title);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(showBack);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!doBack()) {
                        finish();
                    }
                }
            });
        }

    }

    /**
     * toolbar左上角返回点击事件
     *
     * @return false 会执行完后finish当前activity
     */
    protected boolean doBack() {
        return false;
    }
}
