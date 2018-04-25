package com.example.ahmedelbasha.tourisminegypt;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {

    PlaceAdapter placeAdapter;
    GridView gridView;

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        placeAdapter = new PlaceAdapter(getActivity(), places);

        gridView = rootView.findViewById(R.id.grid_list);

        gridView.setAdapter(placeAdapter);

        RelativeLayout noListItemContainer = rootView.findViewById(R.id.no_list_item_message_container);

        if (places.size() < 1) {
            noListItemContainer.setVisibility(View.VISIBLE);
        } else {
            noListItemContainer.setVisibility(View.GONE);
        }

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place currentPlace = places.get(position);

                Intent transferDataToPlaceDetailsActivityIntent = new Intent(getActivity(), PlaceDetailsActivity.class);
                transferDataToPlaceDetailsActivityIntent.putExtra("Place Name", currentPlace.getPlaceName());
                transferDataToPlaceDetailsActivityIntent.putExtra("Place Details", currentPlace.getPlaceDetails());
                transferDataToPlaceDetailsActivityIntent.putExtra("Place Image Id", currentPlace.getPlaceImageResourceId());
                startActivity(transferDataToPlaceDetailsActivityIntent);
            }
        });

        return rootView;
    }

}
