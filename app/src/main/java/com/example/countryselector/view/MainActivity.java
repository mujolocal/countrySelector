package com.example.countryselector.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.renderscript.ScriptGroup;

import com.example.countryselector.R;
import com.example.countryselector.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(activityMainBinding.getRoot());
    }
}