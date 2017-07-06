package com.example.lenovo.first.kodaiguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class GettingThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_know);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Regular bus services are available" +
                " from the cities of Chennai, Coimbatore, Pondicherry, Madurai, Trichy and many more.", "By Bus", R.color.colorAccent));
        places.add(new Place("Many tourists take the rail route and get down at Kodai Road, which" +
                " is about 100 kilometres away from the main town. From here, " +
                "you can get a taxi. Being the only mode of transportation from " +
                "Kodai Road to Kodaikanal, taxi rates are not all that negotiable.", "By Train", R.color.colorAccent));

        places.add(new Place("The airport nearest to Kodaikanal is Madurai, about 120 kilometres " +
                "away. Others in line include the Trichy airport and the Coimbatore airport, " +
                "150 kilometres and 175 kilometres away, respectively. From the airport, " +
                "you can easily get a bus to Kodaikanal.", "By Air", R.color.colorAccent));

        places.add(new Place("Kodaikanal is easily accessible by road from Chennai " +
                "(439 kilometres) and Bangalore (305 kilometres). It’s only about 3.5 " +
                "hours away from Madurai. But if you decide to drive just make sure " +
                "your fuel tank is full because there are very limited gas stations on the way.", "Road/Self Drive", R.color.colorAccent));

        PlaceAdapter itemAdapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
