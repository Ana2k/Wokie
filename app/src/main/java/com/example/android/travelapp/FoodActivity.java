package com.example.android.travelapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("debug","opens foodAct-ONcreate");
        setContentView(R.layout.list);
        Log.d("debug","opens foodAct");
        final ArrayList<Word> details = new ArrayList<Word>();

        details.add(new Word("Banarasi Paan","Eat this iconic food from blah blah place","https://img.icons8.com/material/4ac144/256/user-male.png"));
        details.add(new Word("Thandai", "Best is found in dashwashwamed crossing in Baba ki thandai","https://img.icons8.com/material/4ac144/256/user-male.png"));
        details.add(new Word("Chaat","Deena chat is THE PLACE to eat this","https://img.icons8.com/material/4ac144/256/user-male.png"));
        details.add(new Word("<add further detials in foodAct.java>","","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Kedar_Ghat_in_Varanasi.jpg/183px-Kedar_Ghat_in_Varanasi.jpg"));
        //FILL IN THE DETAILS HERE

        WordAdapter adapter = new WordAdapter(this, details, R.color.category_food);
        //adapter creates list item for each list item.
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        //Media player track not required here


    }
}
