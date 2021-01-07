package com.example.android.travelapp;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {
    public WordAdapter(@NonNull Activity context, ArrayList<Word> words, int ColorResourceID) {
        super(context, 0, words);
        mColorResourceID = ColorResourceID;
    }

    private int mColorResourceID;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
             listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentDetail = (Word) getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentDetail.getmItemName());

        TextView detailTextView = (TextView) listItemView.findViewById(R.id.detail_text_view);
        detailTextView.setText(currentDetail.getmItemDetail());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        /*if(currentDetail.hasImage()){
            imageView.setImageResource(currentDetail.getmImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.INVISIBLE);
        }//If image is provided for this number
        //display the image provided based on the id.
        //else hide the ImageView*/
        

        Picasso.get()
                .load(currentDetail.getmImageURL())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ghats)
                .resize(111,111)
                .into(imageView);
        Log.d("GEtIMAGEURL",currentDetail.getmImageURL());
        //3rd party installed in implementation build gradle
        //User permission edited in manifest file regarding internet
        //Picasso churaya from atm1504 blog on picasso
        //resize is neew

        //WordAdapter adapted to include string URL and get it.

        View  textContainer = listItemView.findViewById(R.id.full_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceID);
        textContainer.setBackgroundColor(color);
        //set theme color for countainer
        //get color and set it as background colour

        return listItemView;//return the VIew type
    }
}
