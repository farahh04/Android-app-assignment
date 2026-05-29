package com.example.recyclerviewassignment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewassignment.Adapter.MyAdapter;
import com.example.recyclerviewassignment.Models.CardModel;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<CardModel> data;
    RecyclerView recyclerView;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv1);
        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);
        setSupportActionBar(topAppBar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("My Favorite Cricketers");
        }
        data=new ArrayList<>();
        data.add(new CardModel(R.drawable.virat1,"Virat kohli","Aggressive right-handed batsman known for chasing targets.\n" +
                "Former India captain and one of the best modern-day run scorers."));
        data.add(new CardModel(R.drawable.babar,"Barbar Azam","Elegant right-handed top-order batsman from Pakistan.\n" +
                "Known for consistency and classic batting technique."));
        data.add(new CardModel(R.drawable.travishead,"Travis Head","Explosive Australian left-handed batsman.\n" +
                "Famous for attacking batting in big ICC matches."));
        data.add(new CardModel(R.drawable.rohit,"Rohit Sharma","Stylish Indian opener known for big centuries.\n" +
                "Record holder for highest ODI score (264)."));
        data.add(new CardModel(R.drawable.root,"Joe root","Technically strong English batsman.\n" +
                "Key player and former England Test captain."));
        data.add(new CardModel(R.drawable.kane,"Kane Williamson","Calm and classy New Zealand batsman.\n" +
                "Known for leadership and perfect batting technique."));
        data.add(new CardModel(R.drawable.roy,"Jason Roy","Aggressive English opener.\n" +
                "Specialist in fast scoring in limited overs cricket."));
        data.add(new CardModel(R.drawable.bumrah,"Jasprit Bumrah","India’s fast bowler known for deadly yorkers.\n" +
                "One of the best death-over bowlers in the world."));
        data.add(new CardModel(R.drawable.ab,"AB de Villiers","Explosive South African batsman known as “Mr. 360°” \uD83C\uDFAF.\n" +
                "Famous for playing shots all around the ground with insane innovation \uD83D\uDE80."));
        adapter = new  MyAdapter(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}