package com.example.lenovo.first.kodaiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ThingsToKnow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_know);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.thingsToKnow1), getString(R.string.priorityMust), R.color.colorAccent));
        places.add(new Place(getString(R.string.thingsToKnow2), getString(R.string.priorityMust), R.color.colorAccent));
        places.add(new Place(getString(R.string.thingsToKnow3), getString(R.string.priorityMust), R.color.colorAccent));
        places.add(new Place(getString(R.string.thingsToKnow4), getString(R.string.prioritySure), R.color.colorPrimaryDark));
        places.add(new Place(getString(R.string.thingsToKnow5), getString(R.string.prioritySure), R.color.colorPrimaryDark));
        places.add(new Place(getString(R.string.thingsToKnow6), getString(R.string.prioritySure), R.color.colorPrimaryDark));

        PlaceAdapter itemsAdapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}