package com.example.countryselector.viewModel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.countryselector.model.CountryInfo;
import com.example.countryselector.repo.remote.CountryRepository;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainViewModel extends ViewModel {
    private static final String TAG = "MainViewModel";

    private final MutableLiveData<List<CountryInfo>> countryInfos = new MutableLiveData<>();

    public LiveData<List<CountryInfo>> getCountries(){return countryInfos;}
    public void fetchCountries(String search){
        CountryRepository countryRepository = CountryRepository.getInstance();
       countryRepository.getCountries(search).enqueue(new Callback<List<CountryInfo>>() {
           @Override
           public void onResponse(Call<List<CountryInfo>> call, Response<List<CountryInfo>> response) {
               countryInfos.setValue(response.body());
           }

           @Override
           public void onFailure(Call<List<CountryInfo>> call, Throwable t) {
               Log.d(TAG, "onFailure: it failed");
           }
       });

    }
}
