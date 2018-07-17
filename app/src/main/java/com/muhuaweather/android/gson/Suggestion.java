package com.muhuaweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ywz on 2018/2/27.
 */

public class Suggestion {

//    @SerializedName("brf")
//    public String bref;
//
//    @SerializedName("txt")
//    public String info;
//
//    public String type;

    public Comf comf;
    public Sport sport;
    public CarWash cw;

    public class Comf {
        public String type;

        @SerializedName("brf")
        public String bref;

        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        public String type;

        @SerializedName("brf")
        public String bref;

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        public String type;

        @SerializedName("brf")
        public String bref;

        @SerializedName("txt")
        public String info;
    }
}
