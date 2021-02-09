package com.example.countryselector.repo.remote;


import retrofit2.Call;

import com.example.countryselector.model.CountryInfo;
import com.example.countryselector.repo.RetrofitInstance;

public class CountryRepository {
    private static CountryRepository INSTANCE= null;

    private CountryRepository(){}

    public Call<CountryInfo> getCountries(String search){
        CountryService countryService = RetrofitInstance.getInstance();
        return countryService.getCountry(search);
    }

    public static CountryRepository getInstance(){
        if(INSTANCE == null){
            INSTANCE = new CountryRepository();
        }
        return INSTANCE;
    }

}
