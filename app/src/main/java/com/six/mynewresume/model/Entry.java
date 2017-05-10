package com.six.mynewresume.model;

/**
 * Created by Padaye on 2017/5/10.
 */

public class Entry {
    private int iconResId;
    private CharSequence title;

    public Entry(int iconResId, CharSequence title) {
        this.iconResId = iconResId;
        this.title = title;
    }

    public int getIconResId() {
        return iconResId;
    }

    public void setIconResId(int iconResId) {
        this.iconResId = iconResId;
    }

    public CharSequence getTitle() {
        return title;
    }

    public void setTitle(CharSequence title) {
        this.title = title;
    }
}
