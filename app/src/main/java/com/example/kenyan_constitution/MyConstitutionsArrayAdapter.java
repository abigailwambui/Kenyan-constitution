package com.example.kenyan_constitution;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyConstitutionsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mLaws;
    private String[] mContent;

    public MyConstitutionsArrayAdapter (Context mContext, int resource, String[] mLaws, String[] mContent) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mLaws = mLaws;
        this.mContent = mContent;
    }

    @Override
    public Object getItem(int position) {
        String laws = mLaws[position];
        String content = mContent[position];
        return String.format(laws, content);
    }
}
