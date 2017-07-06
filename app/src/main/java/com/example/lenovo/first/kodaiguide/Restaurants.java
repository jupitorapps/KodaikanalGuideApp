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

        setContentView(R.layout.activity_things_to_know);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Altaf's Cafe", "A restaurant dealing mainly in Indian and Middle" +
                " Eastern cuisines for the hungry and tired travelers of Kodaikanal.",
                R.color.colorAccent, R.drawable.kodaikanallake));
        places.add(new Place("Pastry Corner", "Pick up great picnic sandwiches and yummy muffins" +
                " and croissants at this highly popular bakery, or squeeze onto the benches with " +
                "a cup to watch the world go by.", R.color.colorAccent, R.drawable.kodaikanallake));
        places.add(new Place("Hotel Astoria", "Crowded with tourists and locals, Astoria is almost" +
                " impossible to get through during the lunch hours when it serves the " +
                "all-you-can-eat thalis.", R.color.colorAccent, R.drawable.kodaikanallake));
        places.add(new Place("Patel Restaurant", "If you're a Gujarati lusting after excellent " +
                "dishes from your cuisine, Patel's is the place to be.",
                R.color.colorAccent, R.drawable.kodaikanallake));
        places.add(new Place("Hilltop Towers", "For a wide variety of Biryanis, ranging from " +
                "vegetarian to chicken to seafood specialties, visit Hilltop's Biryani.",
                R.color.colorAccent, R.drawable.kodaikanallake));
        places.add(new Place("Royal Tibet", "Drop by this place if you're craving for the" +
                " traditional, steamed momos or dumplings.",
                R.color.colorAccent, R.drawable.kodaikanallake));


        PlaceAdapter itemAdapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
