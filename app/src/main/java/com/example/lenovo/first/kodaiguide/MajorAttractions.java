package com.example.lenovo.first.kodaiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MajorAttractions extends AppCompatActivity {

    public static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_know);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Kodaikanal Lake", "Kodai Lake that lays in the heart of Kodaikanal, is a star shaped man made lake" +
                " that is draped on an area of 60 acres. Boating, horse riding, cycling and angling are a few of the adventure " +
                "activities tourists can appease themselves with, near the lake.", R.color.colorAccent, R.drawable.kodaikanallake));
        places.add(new Place("Green Valley View (Suicide Point)", "Kodaikanal Lake Description", R.color.colorAccent, R.drawable.kodaikanallake));
        places.add(new Place("Kodaikanal Lake", "Green Valley View, or the otherwise known Suicide Point, is a magnificent spot " +
                "in Kodaikanal, popular mainly for its enroute fun. One must walk through misty woodlands and panoramic walks to " +
                "reach this heaven like spot.", R.color.colorAccent, R.drawable.kodaikanallake));
        places.add(new Place("Pillar Rocks", "The famous Pillars Rocks of Kodaikanal are located around 8 km from the lake and are " +
                "an exquisite picnic spot. Constituting of a beautiful mini garden, the place is so named as it has three vertically" +
                " positioned boulders reaching up to a height of 400 feet.", R.color.colorAccent, R.drawable.kodaikanallake));
        places.add(new Place("Berijam Lake", "An important hill station in not just Tamil Nadu but the whole of India," +
                " Kodaikanal offers an assortment of picnic spots inclusive of the magnificent " +
                "Berijam Lake.", R.color.colorAccent, R.drawable.kodaikanallake));
        places.add(new Place("Coakers Walk", "Coakers walk is an one killometer long built on the mountain. " +
                "It was constructed in 1872, by Lt Coaker. It is about 1/2 Km away from the Kodai and is constructed " +
                "on the steep slope of mountains. The outlook of the path defines the beauty of the nature i.e mountains, " +
                "valleys, cities etc. Telescope house is must watch of the coakers walk. People are allowed " +
                "to ride bicycles.", R.color.colorAccent, R.drawable.kodaikanallake));

        PlaceAdapter itemAdapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
