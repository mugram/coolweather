package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ywz on 2018/2/27.
 * 实况天气
 */

public class Now {

    public String cloud;//云量

    @SerializedName("cond_code")
    public String conditionCode;//天气状况代码

    @SerializedName("cond_txt")
    public String conditionText;//天气状况描述

    @SerializedName("fl")
    public String fletTemp;//体感温度，摄氏度

    @SerializedName("hum")
    public String humidity;//相对湿度

    public String pcpn;//降水量

    @SerializedName("pres")
    public String pressure;//大气压强

    public String tmp;//温度

    @SerializedName("vis")
    public String visibility;//能见度，单位：公里

    @SerializedName("wind_deg")
    public String windDegree;//风向,360角度制

    @SerializedName("wind_dir")
    public String windDirection;//风向，如东南风

    @SerializedName("wind_sc")
    public String windPower;//风力

    @SerializedName("wind_spd")
    public String windSpeed;//风速，单位：公里/小时

//    public class NowCondition {
//    }
}
