package com.lovineoduor.bloodbank;

import android.content.Context;
import android.widget.ArrayAdapter;

public class BloodbankArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mDonations;
    private String[] mRequests;

    public BloodbankArrayAdapter(Context mContext, int resource, String[] mDonations, String[] mRequests) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mDonations = mDonations;
        this.mRequests = mRequests;

    }

    @Override
    public Object getItem(int position) {
        String donations = mDonations[position];
        String requests = mRequests[position];
        return String.format("%s \nServes great: %s", donations, requests);
    }

}
