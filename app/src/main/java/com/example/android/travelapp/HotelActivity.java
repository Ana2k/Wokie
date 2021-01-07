package com.example.android.travelapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Word> details = new ArrayList<Word>();

        details.add(new Word("Hotels...bahot hai riverside ya kahi bhi","Riverside give good view, but not necessary good food","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Kedar_Ghat_in_Varanasi.jpg/183px-Kedar_Ghat_in_Varanasi.jpg"));

        WordAdapter adapter = new WordAdapter(this, details, R.color.category_hotels);
        //adapter creates list item for each list item.
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        //Media player track not required here

    }
}
