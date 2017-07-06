package com.example.lenovo.first.kodaiguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.lenovo.first.kodaiguide.R.id.gettingThere;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView thingsToKnowView = (TextView) findViewById(R.id.thingsToKnow);
        final TextView gettingThereView = (TextView) findViewById(gettingThere);
        TextView majorAttractionsView = (TextView) findViewById(R.id.majorAttractions);
        TextView restaurantView = (TextView) findViewById(R.id.restaurants);

        thingsToKnowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent thingsToKnowIntent = new Intent(MainActivity.this, ThingsToKnow.class);
                startActivity(thingsToKnowIntent);
            }
        });

        gettingThereView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gettingThereIntent = new Intent(MainActivity.this, GettingThere.class);
                startActivity(gettingThereIntent);
            }
        });

        majorAttractionsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent majorAttractionsIntent = new Intent(MainActivity.this, MajorAttractions.class);
                startActivity(majorAttractionsIntent);
            }
        });

        restaurantView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent restaurantIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restaurantIntent);
            }
        });


    }
}
