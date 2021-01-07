package com.example.android.travelapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Word>  details = new ArrayList<Word>();
        details.add(new Word("Ganges boat ride","The boat RIde","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Kedar_Ghat_in_Varanasi.jpg/183px-Kedar_Ghat_in_Varanasi.jpg"));
        details.add(new Word("GHat Walk","Walkfrom iconic ghats to and fro","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Kedar_Ghat_in_Varanasi.jpg/183px-Kedar_Ghat_in_Varanasi.jpg"));
        details.add(new Word("Get lost..","No seriously! do get lost :P in the galis of varanasi","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Kedar_Ghat_in_Varanasi.jpg/183px-Kedar_Ghat_in_Varanasi.jpg"));

        WordAdapter adapter = new WordAdapter(this, details,R.color.category_attractions);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        //adapetr knows how to create list view for each item
    }
}
