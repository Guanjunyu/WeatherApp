package com.example.WeatherApp.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {

    /**
     *存储county数据的实体类
     **/

    private int id;

    private String countyName;

    private String weatherId;

    private int CityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }
}
