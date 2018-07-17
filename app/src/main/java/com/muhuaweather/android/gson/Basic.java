package com.muhuaweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ywz on 2018/2/27.
 */


public class Basic {
    public String cid;

    public String location;

    @SerializedName("parent_city")
    public String parentCity;

    @SerializedName("admin_area")
    public String adminArea;

    @SerializedName("cnty")
    public String country;

    public String lat;

    public String lon;

    @SerializedName("tz")
    public String timeZone;

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weahterId;

    public UpdateTime update;

}
