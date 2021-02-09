package com.example.countryselector.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;


import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.renderscript.ScriptGroup;

import com.example.countryselector.R;
import com.example.countryselector.adapter.RecycleAdapter;
import com.example.countryselector.databinding.ActivityMainBinding;
import com.example.countryselector.model.CountryInfo;
import com.example.countryselector.viewModel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    private ArrayList<CountryInfo> countries = new ArrayList<>();
    ActivityMainBinding activityMainBinding;
    private RecycleAdapter recycleAdapter;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mainViewModel.fetchCountries("alb");
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
        mainViewModel.getCountries().observe(this, new Observer<List<CountryInfo>>() {
            @Override
            public void onChanged(List<CountryInfo> countryInfos) {
                countries = (ArrayList<CountryInfo>) countryInfos;
            }
        });


        recycleAdapter = new RecycleAdapter(countries);
        linearLayoutManager = new LinearLayoutManager(this);
        activityMainBinding.recyclerView.setAdapter(recycleAdapter);
        activityMainBinding.recyclerView.setLayoutManager(linearLayoutManager);


    }
}