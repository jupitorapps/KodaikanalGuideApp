package com.example.lenovo.first.kodaiguide;

public class Place {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mSubject;
    private String mImportance;
    private int mImportanceColorResourceId;
    private String mPlaceName;
    private String mPlaceDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Place(String subject, String importance, int importanceColorResourceId) {

        mSubject = subject;
        mImportance = importance;
        mImportanceColorResourceId = importanceColorResourceId;
    }

    public Place(String placeName, String placeDescription, int importanceColorResourceId, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mImportanceColorResourceId = importanceColorResourceId;
        mImageResourceId = imageResourceId;
    }

    public String getmSubject() {
        return mSubject;
    }

    public String getmImportance() {
        return mImportance;
    }

    public int getmImportanceColorResourceId() {
        return mImportanceColorResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmPlaceDescription() {
        return mPlaceDescription;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}