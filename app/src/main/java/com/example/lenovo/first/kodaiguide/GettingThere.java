package com.example.lenovo.first.kodaiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GettingThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_know);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.gettingThereByBusDetails), getString(R.string.gettingTherebyBus), R.color.colorAccent));
        places.add(new Place(getString(R.string.gettingThereByTrainDetails), getString(R.string.gettingThereByTrain), R.color.colorAccent));
        places.add(new Place(getString(R.string.gettingThereByAirDetails), getString(R.string.gettingThereByAir), R.color.colorAccent));
        places.add(new Place(getString(R.string.gettingThereBySelfDriveDetails), getString(R.string.gettingThereBySelfDrive), R.color.colorAccent));

        PlaceAdapter itemAdapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}