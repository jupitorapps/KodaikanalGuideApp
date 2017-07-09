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

        places.add(new Place("Kodaikanal Lake", "Kodai Lake that lays in the heart of Kodaikanal, is a star shaped man made lake" +
                " that is draped on an area of 60 acres. Boating, horse riding, cycling and angling are a few of the adventure " +
                "activities tourists can appease themselves with, near the lake.", R.color.colorAccent, R.drawable.attraction_kodaikanallake));
        places.add(new Place("Green Valley View (Suicide Point)", "As the name suggest, it offers tourists with amazing view of the plains, " +
                "valleys and hills. Breath taking view of the Vaigai dam makes for an experience worth remembering. The green valley View is " +
                "formerly called as Suicide Point. It received its name because of the dangerous valley which is deep and dense. The valley below " +
                "the point is more than 5000 feet drop. ", R.color.colorAccent, R.drawable.attraction_green_vally_view_point));

        places.add(new Place("Pillar Rocks", "The famous Pillars Rocks of Kodaikanal are located around 8 km from the lake and are " +
                "an exquisite picnic spot. Constituting of a beautiful mini garden, the place is so named as it has three vertically" +
                " positioned boulders reaching up to a height of 400 feet.", R.color.colorAccent, R.drawable.attraction_pillar_rock));
        places.add(new Place("Berijam Lake", "An important hill station in not just Tamil Nadu but the whole of India," +
                " Kodaikanal offers an assortment of picnic spots inclusive of the magnificent " +
                "Berijam Lake.", R.color.colorAccent, R.drawable.attraction_berijam_lake));


        PlaceAdapter itemAdapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
