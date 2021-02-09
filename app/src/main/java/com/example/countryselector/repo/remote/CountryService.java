package com.example.countryselector.repo.remote;

import com.example.countryselector.model.CountryInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface CountryService {
    @GET("/rest/v2/name/{name}?fields=name;capital;flag")
    Call<List<CountryInfo>>getCountry(@Path("name") String search);
}
