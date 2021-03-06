package com.example.ahmedelbasha.tourisminegypt;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        Place currentPlace = getItem(position);

        int placeImageResourceId = currentPlace.getPlaceImageResourceId();

        ImageView placeImageView = gridItemView.findViewById(R.id.place_image_view);

        placeImageView.setImageResource(placeImageResourceId);

        TextView placeNameTextView = gridItemView.findViewById(R.id.place_name_text_view);
        placeNameTextView.setText(currentPlace.getPlaceName());

        TextView shorthandedPlaceDetailsTextView = gridItemView.findViewById(R.id.shorthanded_place_details_text_view);
        shorthandedPlaceDetailsTextView.setText(currentPlace.getPlaceDetails());

        return gridItemView;
    }
}
