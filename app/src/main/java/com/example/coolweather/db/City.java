package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 廖松 on 2017/10/10.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;//市的名字
    private int cityCode;//市的代号
    private int provinceId;//记录当前所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
