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
public class PublicPlaceFragment extends Fragment {

    PlaceAdapter placeAdapter;;
    GridView gridView;

    public PublicPlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        String shallalatGardensDetails = "Shallalat Gardens is the name of ancient garden located in Alexandria, Egypt. Shallalat Gardens occupy a big area of Al Shatbyneighborhood.Parts of the ancient Alexandria Wall are still present at the gardens until now.";

        String montazaParkDetails = "The neighborhood of Montaza is at the far northeast end of Montaza District, along the coast. Built under the monarchy, it is a favored tourist spot on account of its sizable gardens and palaces left by its royal heritage; the Egyptian government charges a nominal fee (15 LE as of 2010). Montaza Palace, which gives the park its name, was constructed during the reign of the Khedive Abbas II, the royal family's habit of summering in the palace eventually drew wealthy Egyptians and foreigners to the same location (although foreigners in general tended to congregate at the opposite end of the city, in Agami). It is considered to be quite exclusive to be in possession of a cabin in the Montaza. It can not be bought and is usually passed down from generation to generation. There are several different \"suburbs\" within the Montaza, the most exclusive being Aida." + "\n\n" +
                "Montaza also plays host to a noted clock tower and two old hotels (the Helnan Palestine and Salamlek Palace). The Sheraton Montazah is actually across the street from the park, in the neighborhood of Mandara.";

        String alexandriaNationalMuseumDetails = "The Alexandria National Museum was inaugurated 31 December 2003. It is located in a restored Italian style palace in Tariq El Horreya Street (formerly Rue Fouad), near the center of the city. It contains about 1,800 artifacts that narrate the story of Alexandria and Egypt. Most of these pieces came from other Egyptian museums. The museum is housed in the old Al-Saad Bassili Pasha Palace, who was one of the wealthiest wood merchants in Alexandria. Construction on the site was first undertaken in 1926.";

        String alexandriaArtCenterDetails = "The Alexandria Center of Arts (Alexandria Center for Creativity) is an arts center, community exhibitions space and cultural center in the city of Alexandria, Egypt, overseen by the Egyptian Ministry of Culture. The center was officially opened on 29 October 2001, by Farouk Hosni, Minister of Culture, and then-President Hosni Mubarak's wife, Suzanne Mubarak.";

        String alexandriaOperaHouseDetails = "Alexandria Opera House or Sayyid Darwish Theatre was built in 1918 and opened in 1921 in the city of Alexandria, Egypt. When it opened, it was named Teatro Mohamed Ali.";

        String fawziaFahmyPalaceDetails = "Fawzia Fuad of Egypt (Arabic: الأميرة فوزية فؤاد\u200E; Persian: شاهدخت فوزیه فؤاد\u200E; 5 November 1921 – 2 July 2013), also known as Muluk Fawzia of Iran, was an Egyptian princess who became Queen of Iran as the first wife of Mohammad Reza Pahlavi." + "\n\n" +
                "Princess Fawzia was the daughter of Fuad I, the seventh son of Ismail the Magnificent, she descended from the Muhammad Ali Dynasty.She was also known as Fawzia Chirine (or Shirin), having married to Colonel Ismail Chirine, Egyptian diplomat of Circassian origin, in 1949, after the Egyptian Revolution of 1952, her royal titles were no longer recognized by the Egyptian government. Until her death in 2013, she was the oldest member of the deposed Muhammad Ali Dynasty residing in Egypt, her nephew, Fuad, who was proclaimed King Fuad II of Egypt and Sudan after the Revolution, resides in Switzerland." + "\n\n" +
                "Unfotunately, There are no details about Fawzia Fahmy Palace.";

        String sanStefanoGrandPlazaDetails = "San Stefano Grand Plaza (Arabic: سان ستفانو جراند بلازا\u200E) is a structural complex including a Four Seasons hotel, apartments, offices, a shopping malland a marina in Alexandria, Egypt. It was designed by WZMH Architects.";

        String alexandriaNavalUnknownSoldierMemorialDetails = "The Alexandria Naval Unknown Soldier Memorial at the Manshaya district is dedicated to the unknown soldiers who lost their lives in the sea battles, it is present on the Corniche of Alexandria. It was built under the rule of Muhammed Ali of Egypt as Alexandria was the main naval base for his son Ibrahim Pasha's expedition to Greece during the Greek War of Independence, that culminated in the Battle of Navarino." + "\n\n" +
                "Originally a memorial to Khedive Ismail built by Italian residents of Alexandria, its status was changed following the Egyptian Revolution of 1952 to commemorate fallen naval personnel.";

        String montazaPalaceDetails = "Montaza Palace (Arabic: قصر المنتزة\u200E) is a palace, museum and extensive gardens in the Montaza district of Alexandria, Egypt. It was built on a low plateau east of central Alexandria overlooking a beach on the Mediterranean Sea." + "\n\n" +
                "The extensive Montaza Palace grounds first had the Salamlek Palace, built in 1892 by Khedive Abbas II, the last Muhammad Ali Dynasty ruler to hold the Khedive title over the Khedivate of Egypt and Sudan. It was used as a hunting lodge and residence for his companion." + "\n\n" +
                "The larger Al-Haramlik Palace and royal gardens were added to the Montaza Palace grounds, being built by King Fuad I in 1932, as a summer palace. It is in a mixture of Ottoman and Florentine styles, with two towers. One of these towers rises distinctively high above with elaborated Italian Renaissance design details. The palace has long open arcades facing the sea along each floor." + "\n\n" +
                "President Anwar El-Sadat renovated the original Salamlek Palace as an official presidential residence. It was most recently used by former president Hosni Mubarak." + "\n\n" +
                "The Al-Montaza Park, the former expansive royal gardens of 150 acres (61 ha), are open as a public landscape park and forest reserve." + "\n\n" +
                "The Al-Haramlik—Montaza Palace is a public museum of the Muhammad Ali Dynasty family history and objects d'art. The Salamlek Palace is now an adjacent hotel.";

        String shallalatGardensPosition = "31.2001737,29.9123548,21z";
        String montazaParkPosition = "31.2886093,30.0159936,18.72z";
        String alexandriaNationalMuseumPosition = "31.2009903,29.9134793,18.85z";
        String alexandriaArtCenterPosition = "31.195612,29.9000811,19.54z";
        String alexandriaOperaHousePosition = "31.196944,29.9019515,19.65z";
        String fawziaFahmyPalacePosition = "31.2408388,29.9633375,19.57z";
        String sanStefanoGrandPlazaPosition = "31.2454501,29.9670408,19.27z";
        String alexandriaNavalUnknownSoldierMemorialPosition = "31.1999412,29.8937676,20.15z";
        String montazaPalacePosition = "31.2885521,30.0160432,19.27z";

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Shallalat Gardens", shallalatGardensDetails, R.drawable.public_shalalat_gardens, shallalatGardensPosition));
        places.add(new Place("Montaza Park", montazaParkDetails, R.drawable.public_montaza_park_bridge, montazaParkPosition));
        places.add(new Place("Alexandria National Museum", alexandriaNationalMuseumDetails, R.drawable.public_alexandria_national_museum, alexandriaNationalMuseumPosition));
        places.add(new Place("Alexandria Art Center", alexandriaArtCenterDetails, R.drawable.public_alexandria_art_center, alexandriaArtCenterPosition));
        places.add(new Place("Alexandria Opera House", alexandriaOperaHouseDetails, R.drawable.public_alexandria_opera_house, alexandriaOperaHousePosition));
        places.add(new Place("Fawzia Fahmy Palace", fawziaFahmyPalaceDetails, R.drawable.public_fawzia_fahmy_palace, fawziaFahmyPalacePosition));
        places.add(new Place("San Stefano Grand Plaza", sanStefanoGrandPlazaDetails, R.drawable.public_san_stefano_grand_plaza, sanStefanoGrandPlazaPosition));
        places.add(new Place("Alexandria Naval Unknown Soldier Memorial", alexandriaNavalUnknownSoldierMemorialDetails, R.drawable.public_monument_of_the_navy_unknown_soldier_in_alexandria, alexandriaNavalUnknownSoldierMemorialPosition));
        places.add(new Place("Montaza Palace", montazaPalaceDetails, R.drawable.public_alexandria_montazah_palace, montazaPalacePosition));

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
