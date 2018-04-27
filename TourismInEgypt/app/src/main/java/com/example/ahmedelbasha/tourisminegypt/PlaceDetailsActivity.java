package com.example.ahmedelbasha.tourisminegypt;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.jaeger.library.StatusBarUtil;

import java.util.HashMap;
import java.util.Map;

public class PlaceDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent receiveDataFromFragmentIntent = getIntent();

        String placeName = receiveDataFromFragmentIntent.getStringExtra("Place Name");
        String placeDetails = receiveDataFromFragmentIntent.getStringExtra("Place Details");
        int placeImageResourceId = receiveDataFromFragmentIntent.getIntExtra("Place Image Id", 0);
        String placeLocation = receiveDataFromFragmentIntent.getStringExtra("Place Position");
        setTitle(placeName);

        setContentView(R.layout.activity_place_details);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
//        actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ImageView placeImageView = findViewById(R.id.place_image_view);
        placeImageView.setImageResource(placeImageResourceId);

        TextView placeNameTextView = findViewById(R.id.place_name_text_view);
        placeNameTextView.setText(placeName);

        TextView placeDetailsTextView = findViewById(R.id.place_details_text_view);
        placeDetailsTextView.setText(placeDetails);

        final Uri placeGeoLocation = Uri.parse("geo:" + placeLocation);

        RelativeLayout showPositionButton = findViewById(R.id.show_position_button);
        showPositionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPlacePositionIntent(placeGeoLocation);
            }
        });
    }

    private void showPlacePositionIntent(Uri location) {
        Intent showPlacePositionIntent = new Intent(Intent.ACTION_VIEW, location);
//        showPlacePositionIntent.setData(location);
        showPlacePositionIntent.setPackage("com.google.android.apps.maps");
        if (showPlacePositionIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(showPlacePositionIntent);
        }
    }

    // navigating to parent activity with possibility to be navigating back from another app's activity.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent upIntent = NavUtils.getParentActivityIntent(this);
                if (NavUtils.shouldUpRecreateTask(this, upIntent)) {
                    TaskStackBuilder.create(this).addNextIntentWithParentStack(upIntent).startActivities();
                } else {
                    NavUtils.navigateUpTo(this, upIntent);
                }
        }
        return super.onOptionsItemSelected(item);
    }
}
