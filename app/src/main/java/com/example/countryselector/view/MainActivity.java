package com.example.countryselector.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.renderscript.ScriptGroup;

import com.example.countryselector.R;
import com.example.countryselector.adapter.RecycleAdapter;
import com.example.countryselector.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    private ArrayList<String> strings = new ArrayList<>();
    ActivityMainBinding activityMainBinding;
    private RecycleAdapter recycleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        strings.add("red");
        strings.add("white");
        strings.add("bue");
        strings.add("red");
        strings.add("white");
        strings.add("bue");
        strings.add("red");
        strings.add("white");
        strings.add("bue");
        recycleAdapter = new RecycleAdapter(strings);
        linearLayoutManager = new LinearLayoutManager(this);
        activityMainBinding.recyclerView.setAdapter(recycleAdapter);
        activityMainBinding.recyclerView.setLayoutManager(linearLayoutManager);


    }
}