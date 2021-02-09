package com.example.countryselector.model;

import java.io.Serializable;

public class CountryInfo implements Serializable {
    private String flag;
    private String name;
    private String capital;

    public CountryInfo(String flag, String name, String capital) {
        this.flag = flag;
        this.name = name;
        this.capital = capital;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
