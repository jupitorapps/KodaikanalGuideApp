package com.example.lenovo.first.kodaiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MajorAttractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_know);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.attraction1Name), getString(R.string.attraction1Details), R.color.colorAccent, R.drawable.attraction_kodaikanallake));
        places.add(new Place(getString(R.string.attraction2Name), getString(R.string.attraction2Details), R.color.colorAccent, R.drawable.attraction_green_vally_view_point));
        places.add(new Place(getString(R.string.attraction3Name), getString(R.string.attraction3Details), R.color.colorAccent, R.drawable.attraction_pillar_rock));
        places.add(new Place(getString(R.string.attraction4Name), getString(R.string.attraction4Details), R.color.colorAccent, R.drawable.attraction_berijam_lake));

        PlaceAdapter itemAdapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}