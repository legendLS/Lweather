package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 廖松 on 2017/10/10.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县城名字
    private String weatherId;//记录县城对应的天气ID
    private int cityId;//记录当前所属市的id值
    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
