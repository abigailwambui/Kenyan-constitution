package com.example.kenyan_constitution;

import android.content.Context;

public class MyConstitutionsArrayAdapter {
    private Context mContext;
    private String[] mLaws;
    private String[] mContent;

    public MyConstitutionsArrayAdapter (Context mContext, int resource, String[] mLaws, String[] mContent) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mLaws = mLaws;
        this.mContent = mContent;
    }
}
