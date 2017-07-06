package com.example.lenovo.first.kodaiguide;



public class Place {

    private String mSubject;
    private String mImportance;
    private int mImportanceColorResourceId;
    private String mPlaceName;
    private String mPlaceDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Place (String subject, String importance, int importanceColorResourceId){

        mSubject = subject;
        mImportance = importance;
        mImportanceColorResourceId = importanceColorResourceId;
    }

    public Place (String placeName, String placeDescription, int importanceColorResourceId, int imageResourceId){
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mImportanceColorResourceId = importanceColorResourceId;
        mImageResourceId = imageResourceId;
    }

    public String getmSubject() {
        return mSubject;
    }

    public void setmSubject(String mSubject) {
        this.mSubject = mSubject;
    }

    public String getmImportance() {
        return mImportance;
    }

    public void setmImportance(String mImportance) {
        this.mImportance = mImportance;
    }

    public int getmImportanceColorResourceId() {
        return mImportanceColorResourceId;
    }

    public void setmImportanceColorResourceId(int mImportanceColorResourceId) {
        this.mImportanceColorResourceId = mImportanceColorResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public void setmPlaceName(String mPlaceName) {
        this.mPlaceName = mPlaceName;
    }

    public String getmPlaceDescription() {
        return mPlaceDescription;
    }

    public void setmPlaceDescription(String mPlaceDescription) {
        this.mPlaceDescription = mPlaceDescription;
    }

    public boolean hasImage(){
        return mImageResourceId !=NO_IMAGE_PROVIDED;

    }
}
