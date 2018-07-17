package com.muhuaweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ywz on 2018/3/9.
 */

public class Weather {

    public Basic basic;

    @SerializedName("update")
    public UpdateTime updateTime;

    public String status;

    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    @SerializedName("hourly")
    public List<DetailForecast> detailForecastList;

    public AQI aqi;

    public Suggestion suggestion;

}
