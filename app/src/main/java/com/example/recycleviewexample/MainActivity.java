package com.example.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ReclycleAdapter adapter;
    private ArrayList<String> CountryList = new ArrayList<String>();
    private ArrayList<String>  Descripictionlist = new ArrayList<String>();
    private ArrayList<Integer>  ImageList = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleExAMPLE);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        CountryList.add("INDIA");
        CountryList.add("ENGLAND");
        CountryList.add("GERMANY");

        Descripictionlist.add("WE are Indians");
        Descripictionlist.add("We are Englands");
        Descripictionlist.add("Wer are Germany's");



        ImageList.add(R.drawable.india);
        ImageList.add(R.drawable.england);
        ImageList.add(R.drawable.germany);

        adapter = new ReclycleAdapter(CountryList,Descripictionlist,ImageList,MainActivity.this);
        recyclerView.setAdapter(adapter);

    }
}