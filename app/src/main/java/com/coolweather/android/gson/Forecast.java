package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ywz on 2018/3/1.
 * 一天的天气预报情况
 */

public class Forecast {

//    @SerializedName("cond_code_d")
//    public String dayConditionCode;//白天天气状况代码
//
//    @SerializedName("cond_code_n")
//    public String nightConditionCode;//晚间天气状况代码
//
//    @SerializedName("cond_txt_d")
//    public String dayInfo;//白天天气状况描述
//
//    @SerializedName("cond_txt_n")
//    public String nightInfo;//晚间天气状况描述
//
//    public String date;//预报日期, 格式: yyyy-mm-dd
//
//    @SerializedName("hum")
//    public String humidity;//相对湿度
//
//    @SerializedName("mr")
//    public String moonrise;//月升时间
//
//    @SerializedName("ms")
//    public String moonset;//月落时间
//
//    public String pcpn;//降水量
//
//    @SerializedName("pop")
//    public String probability;//降水概率
//
//    @SerializedName("pres")
//    public String pressure;//大气压强
//
//    @SerializedName("sr")
//    public String sunrise;//日出时间
//
//    @SerializedName("ss")
//    public String sunset;//日落时间
//
//    public String tmpMax;//最高温度
//
//    public String tmpMin;//最低温度
//
//    @SerializedName("uv_index")
//    public String uvIndex;//紫外线强度指数
//
//    @SerializedName("vis")
//    public String visibility;//能见度，单位：公里
//
//    @SerializedName("wind_deg")
//    public String windDegree;//风向,360角度制
//
//    @SerializedName("wind_dir")
//    public String windDirection;//风向，如东南风
//
//    @SerializedName("wind_sc")
//    public String windPower;//风力
//
//    @SerializedName("wind_spd")
//    public String windSpeed;//风速，单位：公里/小时

    public String date;

    public ForcastCond cond;

    public class ForcastCond {
        @SerializedName("txt_d")
        public String txt;
    }

    @SerializedName("tmp")
    public Temp temp;

    public class Temp {
        public String max;
        public String min;
    }

}
