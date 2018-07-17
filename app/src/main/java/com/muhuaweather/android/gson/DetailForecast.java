package com.muhuaweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ywz on 2018/3/9.
 * 每小时的天气预报情况
 */

public class DetailForecast {

    public String cloud;//云量

    @SerializedName("cond_code")
    public String conditionCode;//天气状况代码

    @SerializedName("cond_txt")
    public String conditionText;//天气状况描述

    public String dew;

    @SerializedName("hum")
    public String humidity;//相对湿度

    @SerializedName("pop")
    public String probability;//降水概率

    @SerializedName("pres")
    public String pressure;//大气压强

    public String time;//预报时间，格式yyyy-MM-dd HH:mm

    public String tmp;//温度

    @SerializedName("wind_deg")
    public String windDegree;//风向,360角度制

    @SerializedName("wind_dir")
    public String windDirection;//风向，如东南风

    @SerializedName("wind_sc")
    public String windPower;//风力

    @SerializedName("wind_spd")
    public String windSpeed;//风速，单位：公里/小时
}
