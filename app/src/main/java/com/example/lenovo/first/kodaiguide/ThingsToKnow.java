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
        places.add(new Place("Reconfirm with your hotel directly calling at Hotel, if you have " +
                "booked online.", "Must", R.color.colorAccent));
        places.add(new Place("If you are driving, make sure you have sufficient fule when you " +
                "leave Dindigul, becuase after that , it is difficult to get fuel. You need to climb hill of " +
                "50km, hill climbing may use double the fuel. Make sure you have full tank. Also take some food " +
                "with you if you have babies or you may get hungry. It will take nearly 2 hours to climb the hill. ", "Good", R.color.colorPrimary));
        places.add(new Place("Download google map for offline navigation. Download place " +
                "details also because at some places you may not get sufficient network or internet ", "Sure", R.color.colorPrimaryDark));
        places.add(new Place("Public tranport is not good or mostly not available in Kodaikanal. " +
                "You have to make your taxi or join some tourist group via a tour agent. You hotel can do that " +
                "for you", "Sure", R.color.colorPrimaryDark));
        places.add(new Place("If you are foreigner, keep your passport safe. Mostly, nobody will ask for passport unless something wrong happens. Show it only to police personnel. Crime is very less in " +
                " Kodaikanal but it's better to be safe", "Sure", R.color.colorPrimaryDark));
        places.add(new Place("Take an umbrelaa with you. It may rain sometimes. If you wish to " +
                " take a self driven bike, have a rain coat with you. Check the bike and take photos before " +
                " you take the bike.", "Sure", R.color.colorPrimaryDark));
        places.add(new Place("Self driven cars are not available in Kodaikanal. If you wish a " +
                " self driven car, take it from Chennai and drive to Kodaikanal. You can take it from " +
                " ZoomCar, book from their website or App", "Sure", R.color.colorPrimaryDark));
        places.add(new Place("Language is Tamil, mostly in Tamil. Some people can speak " +
                " English. But, you can adjust. Tamil people are very soft spoken and very helpful. ", "Sure", R.color.colorPrimaryDark));
        places.add(new Place("Food is mainly south Indian. In lunch you can get Idly, Dosai, " +
                " Vada, Pongal, Puri etc., in Lunch and Dinner you can get Indian, Chinese, Continental dishes, " +
                " I would suggest you try South Indian Meals in some reputed restaurant, " +
                " it's good and available in Lunch only.", "Sure", R.color.colorPrimaryDark));
        places.add(new Place("Giving tip in restaurant is not mandatory. I never give tips " +
                " because I feel waiters are not beggars , they should be pround of their work and should " +
                " be able to live a happy life with their salary. Because of tips, their employers pays them " +
                " low salary and again they depend our generosity, like beggars. ", "Sure", R.color.colorPrimaryDark));


        PlaceAdapter itemsAdapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
