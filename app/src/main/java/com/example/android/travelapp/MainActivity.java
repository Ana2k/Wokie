package com.example.android.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //edit activity in android manifest file if not done already

        //Find the view that shows places category
        TextView places = (TextView) findViewById(R.id.places);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesIntent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(placesIntent);
            }
        });

        //Find view for food category
        TextView food = (TextView) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG","In mainact -1");
               Intent foodIntent = new Intent(getBaseContext(), FoodActivity.class);
               startActivity(foodIntent);
                Log.d("DEBUG","In mainact -3");
            }
        });

        //Find view for hotels category
        TextView hotels = (TextView) findViewById(R.id.hotels);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelActivity.class );
                startActivity(hotelsIntent);
            }
        });

        //Find view for unique category
        TextView attractions = (TextView) findViewById(R.id.attractions);
        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class );
                startActivity(attractionsIntent);
            }
        });

    }
}