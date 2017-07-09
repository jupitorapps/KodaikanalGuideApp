package com.example.lenovo.first.kodaiguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.place_list, parent, false);
        }


        final Place currentPlace = (Place) getItem(position);
        assert currentPlace != null;
        if (currentPlace.hasImage()){

            ImageView imageView = listItemView.findViewById(R.id.itemThumbnail);
            imageView.setImageResource(currentPlace.getmImageResourceId());
            TextView placeNameView = listItemView.findViewById(R.id.placeName);
            placeNameView.setText(currentPlace.getmPlaceName());
            TextView placeDescriptionView = listItemView.findViewById(R.id.placeDescription);
            placeDescriptionView.setText(currentPlace.getmPlaceDescription());
            TextView subjectView = listItemView.findViewById(R.id.subject);
            subjectView.setVisibility(View.GONE);
            TextView importanceView = listItemView.findViewById(R.id.importance);
            importanceView.setVisibility(View.GONE);


        } else {
            //final Place currentPlace = (Place) getItem(position);
            TextView subjectView = listItemView.findViewById(R.id.subject);
            subjectView.setText(currentPlace.getmSubject());
            TextView importanceView = listItemView.findViewById(R.id.importance);
            importanceView.setText(currentPlace.getmImportance());
            importanceView.setTextColor(ContextCompat.getColor(getContext(), currentPlace.getmImportanceColorResourceId()));
            importanceView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
            ImageView imageView = listItemView.findViewById(R.id.itemThumbnail);
            imageView.setVisibility(View.GONE);
            TextView placeNameView = listItemView.findViewById(R.id.placeName);
            placeNameView.setVisibility(View.GONE);
            TextView placeDescriptionView = listItemView.findViewById(R.id.placeDescription);
            placeDescriptionView.setVisibility(View.GONE);

        }


        return listItemView;
    }


}


