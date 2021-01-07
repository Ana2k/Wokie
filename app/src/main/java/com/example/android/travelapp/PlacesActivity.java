package com.example.android.travelapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Word> details = new ArrayList<>();

        details.add(new Word("Assi Ghat","The most iconics Ghat of varanasi", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Kedar_Ghat_in_Varanasi.jpg/183px-Kedar_Ghat_in_Varanasi.jpg"));
        details.add(new Word("BHU","One of the Oldest and largest university of India ", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Kedar_Ghat_in_Varanasi.jpg/183px-Kedar_Ghat_in_Varanasi.jpg"));
        details.add(new Word("Vishawanasth Ghat","During evenign the aarti is to die for", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Kedar_Ghat_in_Varanasi.jpg/183px-Kedar_Ghat_in_Varanasi.jpg"));
        details.add(new Word("<add further items in placeAct.java>","", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Kedar_Ghat_in_Varanasi.jpg/183px-Kedar_Ghat_in_Varanasi.jpg"));

        WordAdapter adapter = new WordAdapter(this, details, R.color.category_places);
        //adapter creates list item for each list item.

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        //Media player track not required here
    }

}
