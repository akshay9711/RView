package com.example.rview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        String[] languages = {"Java", "C#", "C++", "JavaScript",
                "Java", "C#", "C++", "JavaScript",
                "Java", "C#", "C++", "JavaScript"};
        programmingList.setAdapter(new RecycleViewAdapter(languages));
    }
}