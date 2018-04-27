package com.example.ahmedelbasha.tourisminegypt;

import java.sql.Struct;

public class Place {

    private String mPlaceName;
    private String mPlaceDetails;
    private int mPlaceImageResourceId;
    private String mPlacePosition;

    public Place(String placeName, String placeDetails, int placeImageResourceId, String placePosition) {
        mPlaceName = placeName;
        mPlaceDetails = placeDetails;
        mPlaceImageResourceId = placeImageResourceId;
        mPlacePosition = placePosition;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceDetails() {
        return mPlaceDetails;
    }

    public int getPlaceImageResourceId() {
        return mPlaceImageResourceId;
    }

    public String getPlacePosition() {
        return mPlacePosition;
    }
}
