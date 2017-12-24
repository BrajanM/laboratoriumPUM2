package com.example.student.aplikacjapogodowa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        ArrayList<Place> places=new ArrayList<>();
        places.add(new Place("Zabrze",12,"zimno"));
        places.add(new Place("Katowice",20,"ciepło"));

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        PlaceAdapter placeAdapter=new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);
    }
}
