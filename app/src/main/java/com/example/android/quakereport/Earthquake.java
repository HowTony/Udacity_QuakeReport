package com.example.android.quakereport;

/**
 * Created by Tony Howarth on 1/11/2017.
 */

public class Earthquake {
    private Double mMag;
    private String mLocation;
    private long mDateOfQuake;
    private String mUrl;

    public Earthquake(Double mag, String location, long date, String url){
        mMag = mag;
        mLocation = location;
        mDateOfQuake = date;
        mUrl = url;
    }

    public long getDateOfQuake() {
        return mDateOfQuake;
    }

    public String getLocation() {
        return mLocation;
    }

    public double getMag() {
        return mMag;
    }

    @Override
    public String toString() {
        return mMag.toString() + " " + mLocation + " " + mDateOfQuake;
    }

    public String getUrl() {
        return mUrl;
    }
}
