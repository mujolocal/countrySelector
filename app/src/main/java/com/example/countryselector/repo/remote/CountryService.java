package com.example.countryselector.repo.remote;

import com.example.countryselector.model.CountryInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface CountryService {
    @GET("/{name}?fields=name;capital;flag")
    Call<CountryInfo>getCountry(@Path("name") String name);
}
