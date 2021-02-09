package com.example.countryselector.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.renderscript.ScriptGroup;

import com.example.countryselector.R;
import com.example.countryselector.adapter.RecycleAdapter;
import com.example.countryselector.databinding.ActivityMainBinding;
import com.example.countryselector.model.CountryInfo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    private ArrayList<CountryInfo> countries = new ArrayList<>();
    ActivityMainBinding activityMainBinding;
    private RecycleAdapter recycleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));
        countries.add(new CountryInfo("red","red","red"));countries.add(new CountryInfo("red","red","red"));



        recycleAdapter = new RecycleAdapter(countries);
        linearLayoutManager = new LinearLayoutManager(this);
        activityMainBinding.recyclerView.setAdapter(recycleAdapter);
        activityMainBinding.recyclerView.setLayoutManager(linearLayoutManager);


    }
}