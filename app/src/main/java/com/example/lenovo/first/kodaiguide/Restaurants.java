package com.example.lenovo.first.kodaiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_know);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.restaurantAltafsCafeName), getString(R.string.restaurantAltafsCafeDetails),
                R.color.colorAccent, R.drawable.restaurant_altaf_cafe));
        places.add(new Place(getString(R.string.restaurantPastryCorner), getString(R.string.restaurantPastryCornerDetails), R.color.colorAccent, R.drawable.restaurant_pastry_corner));
        places.add(new Place(getString(R.string.restaurantAstoria), getString(R.string.restaurantAstoriaDetails), R.color.colorAccent, R.drawable.restaurant_astoria_hotel));
        places.add(new Place(getString(R.string.restaurantPatel), getString(R.string.restaurantPatelRestaurantDetails), R.color.colorAccent, R.drawable.restaurant_patel_restaurant));

        PlaceAdapter itemAdapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}