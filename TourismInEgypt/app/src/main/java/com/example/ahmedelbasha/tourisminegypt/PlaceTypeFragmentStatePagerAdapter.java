package com.example.ahmedelbasha.tourisminegypt;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PlaceTypeFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    public PlaceTypeFragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0 ) {
            return  new AttractionsFragment();
        } else if (position == 1) {
            return  new PublicPlaceFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new EventsFragment();
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0 ) {
            return  "Attractions";
        } else if (position == 1) {
            return  "Public Places";
        } else if (position == 2) {
            return  "Restaurants";
        } else {
            return  "Events";
        }
    }
}
