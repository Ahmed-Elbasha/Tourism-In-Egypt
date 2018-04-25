package com.example.ahmedelbasha.tourisminegypt;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    ArrayList<Place> places;
    PlaceAdapter placeAdapter;
    GridView gridView;

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        String chinaHouseOnTheRooftopOfCecilHotelDetails = "• Location: 16, Saad Zagloul Square, Raml Station." + "\n\n" +
                "• Cuisine served: Chinese, Thai, & Asian Fusions." + "\n\n" +
                "• Biggest Advantage: Stunning views of the sea and the harbor, with great weather all year long that can get chilly at night." + "\n\n" +
                "• Drawback: Small portions with relatively expensive prices." + "\n\n" +
                "• Photo courtesy: dragon-group.org";

        String greekClubRestaurantDetails = "• Location: Qaitbay Street, El-Anfoushy (Inside the Greek Club) on the Third Floor." + "\n\n" +
                "• Cuisine Served: Seafood with a Greek twist." + "\n\n" +
                "• Biggest Advantage: Amazing view of the old port, and the Citadel, serving the freshest seafood in Alexandria." + "\n\n" +
                "• Drawback: A bit overpriced compared to other seafood restaurants." + "\n\n" +
                "• Photo courtesy: tripadvisor.com";

        String latinoCaféDetails = "• Location: El-Geish Road, Gleem."  + "\n\n" +
                "• Cuisine Served: International." + "\n\n" +
                "• Biggest Advantage: The sea view it offers, and its average prices." + "\n\n" +
                "• Drawback: This is basically a café, so don’t expect a premium food quality, the service is also not the best." + "\n\n" +
                "• Photo courtesy: Latino Cafe’s Facebook Page.";

        String sanGiovanniRestaurantDetails = "• Location: 205 El Geish Road, Stanly." + "\n\n" +
                "• Cuisine Served: Seafood with a Euro-Mediterranean twist." + "\n\n" +
                "• Biggest Advantage: Scenic views over the sea, and Stanly bridge, that’s a place in style, it hasn’t changed since it has first opened." + "\n\n" +
                "• Drawback: Best avoided at peak times, hence weekends and public holidays." + "\n\n" +
                "• Photo courtesy: sangiovannistanly.com";

        String zanillisCaféDetails = "• Location: Stanly or El-Montazah." + "\n\n" +
                "• Cuisine Served: Breakfast, Burgers, Hot Dogs, Sandwiches, Seafood, French, Greek and Mediterranean, & Italian cuisine." + "\n\n" +
                "• Biggest Advantage: Both branches offer stunning views of the sea." + "\n\n" +
                "• Drawback: The food variety is pretty awkward, making the food not the best." + "\n\n" +
                "• Photo courtesy: Zanilli’s Café Facebook page.";

        String skyroofWindsorPalaceDetails = "• Location: 17 El-Shohada street, off El-Geish Road, Raml Station, Cornish Moharram Bey." + "\n\n" +
                "• Cuisine Served: International (it’s basically a cafe)." + "\n\n" +
                "• Biggest Advantage: Best view over the city of Alexandria specially at sunset." + "\n\n" +
                "• Drawback: It’s not the best eatery, it’s just a cafe." + "\n\n" +
                "• Photo courtesy: booking.com";

        String santaLuciaDetails = "• Location: 40 Safia Zagloul Street, Raml Station." + "\n\n" +
                "• Cuisine Served: Mediterranean." + "\n\n" +
                "• Biggest Advantage: The atmosphere, service, food quality, and above all the pianist who plays every night." + "\n\n" +
                "• Drawback: The served portions are really small, specially desserts." + "\n\n'" +
                "• Photo courtesy: tripadvisor.com";

        String calitheaDetails = "• Location: 83 El-Geish Road, Raml Station." + "\n\n" +
                "• Cuisine Served: Greek." + "\n\n" +
                "• Biggest Advantage: This place was always able to maintain its superior quality, serving the. freshest seafood ever with reasonable prices. The fried calamari is a must eat!." + "\n\n" +
                "• Drawback: The served portions are pretty small." + "\n\n" +
                "• Photo courtesy: tripadvisor.com";

        String chezGabyDetails = "• Location: 22 El-Horreya Avenue." + "\n\n" +
                "• Cuisine Served: Italian Pizzeria." + "\n\n" +
                "• Biggest Advantage: This place that was established in the late seventies, has amazing energy and atmosphere, and great food as well, once you step in you will travel back in time taking you to the sixties." + "\n\n" +
                "• Drawback: Poor ventilation while smoking is allowed inside the restaurant." + "\n\n" +
                "• Photo courtesy: Chez Gaby au Ritrovo’s Facebook page.";

        String trianon1905Details = "• Location: 52 Saad Zaghloul St., Raml Station." + "\n\n" +
                "• Cuisine Served: Bakeries, Patisseries, and Coffee." + "\n\n" +
                "• Biggest Advantage: This is a place with history, it has been established since 1905 by two Greeks, and has a great location in the heart of Alexandria, giving you the energy and feel of the city of Alexandria." + "\n\n" +
                "• Drawback: Bad news for late risers, breakfast is only served till 11 AM." + "\n\n" +
                "• Photo courtesy: kokollenium.";

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("China House On The Rooftop Of Cecil Hotel", chinaHouseOnTheRooftopOfCecilHotelDetails, R.drawable.restraunt_china_house_cecil_resto));
        places.add(new Place("Greek Club Restaurant", greekClubRestaurantDetails, R.drawable.restraunt_greek_club));
        places.add(new Place("Latino Café", latinoCaféDetails, R.drawable.restraunt_latino_cafe));
        places.add(new Place("San Giovanni Restaurant", sanGiovanniRestaurantDetails, R.drawable.restraunt_sangiovanni));
        places.add(new Place("Zanilli's Café", zanillisCaféDetails, R.drawable.restraunt_zanillis_cafe));
        places.add(new Place("Skyroof Windsor Palace", skyroofWindsorPalaceDetails, R.drawable.restraunt_skyroof));
        places.add(new Place("Santa Lucia", santaLuciaDetails, R.drawable.restraunt_santalucia));
        places.add(new Place("Calithea", calitheaDetails, R.drawable.restraunt_calithea));
        places.add(new Place("Chez Gaby", chezGabyDetails, R.drawable.restraunt_chezgaby));
        places.add(new Place("Trianon1905", trianon1905Details, R.drawable.restraunt_trianon));

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
