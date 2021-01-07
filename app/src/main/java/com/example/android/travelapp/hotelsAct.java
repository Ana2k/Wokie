package com.example.android.travelapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class hotelsAct extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Word> details = new ArrayList<Word>();

        details.add(new Word("Hotels...bahot hai riverside ya kahi bhi","Riverside give good view, but not necessary good food"));

        WordAdapter adapter = new WordAdapter(this, details, R.color.category_hotels);

    }
}
