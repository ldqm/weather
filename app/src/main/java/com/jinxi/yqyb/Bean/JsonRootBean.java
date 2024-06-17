/**
  * Copyright 2021 json.cn 
  */
package com.jinxi.yqyb.Bean;
import java.util.List;


/*
cityid : "101010100"
city : "北京"
cityEn : "beijing"
country : "中国"
countryEn : "China"
update_time : "2023-06-4 19:48:44"
 */


//该类用于表示 JSON 根对象，包含了城市的天气信息
public class JsonRootBean {

    private String cityid;
    private String city;
    private String cityEn;
    private String country;
    private String countryEn;
    private String update_time;
    private List<Data> data;
    public void setCityid(String cityid) {
         this.cityid = cityid;
     }
     public String getCityid() {
         return cityid;
     }

    public void setCity(String city) {
         this.city = city;
     }
     public String getCity() {
         return city;
     }

    public void setCityEn(String cityEn) {
         this.cityEn = cityEn;
     }
     public String getCityEn() {
         return cityEn;
     }

    public void setCountry(String country) {
         this.country = country;
     }
     public String getCountry() {
         return country;
     }

    public void setCountryEn(String countryEn) {
         this.countryEn = countryEn;
     }
     public String getCountryEn() {
         return countryEn;
     }

    public void setUpdate_time(String update_time) {
         this.update_time = update_time;
     }
     public String getUpdate_time() {
         return update_time;
     }

    public void setData(List<Data> data) {
         this.data = data;
     }
     public List<Data> getData() {
         return data;
     }
}