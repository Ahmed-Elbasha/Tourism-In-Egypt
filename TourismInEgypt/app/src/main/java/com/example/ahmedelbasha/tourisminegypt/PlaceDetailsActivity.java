package com.example.ahmedelbasha.tourisminegypt;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;

import java.util.HashMap;
import java.util.Map;

public class PlaceDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        setContentView(R.layout.activity_place_details);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
//        actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));


        Intent receiveDataFromFragmentIntent = getIntent();

        String placeName = receiveDataFromFragmentIntent.getStringExtra("Place Name");
        String placeDetails = receiveDataFromFragmentIntent.getStringExtra("Place Details");
        int placeImageResourceId = receiveDataFromFragmentIntent.getIntExtra("Place Image Id", 0);

        ImageView placeImageView = findViewById(R.id.place_image_view);
        placeImageView.setImageResource(placeImageResourceId);

        TextView placeNameTextView = findViewById(R.id.place_name_text_view);
        placeNameTextView.setText(placeName);

        TextView placeDetailsTextView = findViewById(R.id.place_details_text_view);
        placeDetailsTextView.setText(placeDetails);
    }
}
