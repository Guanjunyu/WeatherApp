package com.example.WeatherApp.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    /**
     * 对各种返回数据进行汇总
     * **/

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
