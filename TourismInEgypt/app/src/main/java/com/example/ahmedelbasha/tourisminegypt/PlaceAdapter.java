package com.example.ahmedelbasha.tourisminegypt;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param places  The objects to represent in the ListView.
     */
    public PlaceAdapter(@NonNull Context context, @NonNull ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gridItemView = convertView;

        if (gridItemView == null) {
            gridItemView = View.inflate(getContext(), R.layout.grid_item, parent);
        }

        Place currentPlace = getItem(position);

        int placeImageResourceId = currentPlace.getPlaceImageResourceId();

        ImageView placeImageView = gridItemView.findViewById(R.id.place_image_view);

        placeImageView.setImageResource(placeImageResourceId);

        return gridItemView;
    }
}
