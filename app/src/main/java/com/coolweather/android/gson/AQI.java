package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ywz on 2018/2/27.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;

        @SerializedName("qlty")
        public String quality;
    }
}
