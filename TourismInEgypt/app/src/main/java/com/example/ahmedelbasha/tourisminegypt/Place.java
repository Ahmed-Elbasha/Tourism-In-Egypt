package com.example.ahmedelbasha.tourisminegypt;

import java.sql.Struct;

public class Place {

    private String mPlaceName;
    private String mPlaceDetails;
    private int mPlaceImageResourceId;

    public Place(String placeName, String placeDetails, int placeImageResourceId) {
        mPlaceName = placeName;
        mPlaceDetails = placeDetails;
        mPlaceImageResourceId = placeImageResourceId;
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
}
