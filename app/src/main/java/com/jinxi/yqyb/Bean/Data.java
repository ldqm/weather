/**
  * Copyright 2021 json.cn 
  */
package com.jinxi.yqyb.Bean;
import java.util.List;


/*
 day : "14日（星期二）"
 date : "2023-06-6"
 week : "星期二"
 wea : "多云"
 wea_img : "yun"
 wea_day : "多云"
 wea_day_img : "yun"
 wea_night : "多云"
 wea_night_img : "yun"
 tem : "24℃"
 tem1 : "25℃"
 tem2 : "17℃"
 humidity : "66%"
 visibility : "18km"
 pressure : "1014"
 win_speed : "<3级"
 win_meter : "5km/h"
 sunrise : "05:54"
 sunset : "18:25"
 air : "31"
 air_level : "优"


 */
//day：表示星期几的字符串
//date：表示日期的字符串
//week：表示星期几的字符串
//wea：表示天气情况的字符串
//wea_img：表示天气情况对应的图片的字符串
//wea_day：表示白天天气情况的字符串
//wea_day_img：表示白天天气情况对应的图片的字符串
//wea_night：表示晚上天气情况的字符串
//wea_night_img：表示晚上天气情况对应的图片的字符串
//tem：表示温度的字符串
//tem1：表示最高温度的字符串
//tem2：表示最低温度的字符串
//humidity：表示湿度的字符串
//visibility：表示能见度的字符串
//pressure：表示气压的字符串
//win：表示风向的字符串列表
//win_speed：表示风速的字符串
//win_meter：表示风速单位的字符串
//sunrise：表示日出时间的字符串
//sunset：表示日落时间的字符串
//air：表示空气质量的字符串
//air_level：表示空气质量级别的字符串
//air_tips：表示空气质量提示的字符串

//hours：表示每小时天气情况的列表
//index：表示天气指数的列表
public class Data {

    private String day;
    private String date;
    private String week;
    private String wea;
    private String wea_img;
    private String wea_day;
    private String wea_day_img;
    private String wea_night;
    private String wea_night_img;
    private String tem;
    private String tem1;
    private String tem2;
    private String humidity;
    private String visibility;
    private String pressure;
    private List<String> win;
    private String win_speed;
    private String win_meter;
    private String sunrise;
    private String sunset;
    private String air;
    private String air_level;
    private String air_tips;
    private List<Hours> hours;
    private List<Index> index;
    public void setDay(String day) {
         this.day = day;
     }
     public String getDay() {
         return day;
     }

    public void setDate(String date) {
         this.date = date;
     }
     public String getDate() {
         return date;
     }

    public void setWeek(String week) {
         this.week = week;
     }
     public String getWeek() {
         return week;
     }

    public void setWea(String wea) {
         this.wea = wea;
     }
     public String getWea() {
         return wea;
     }

    public void setWea_img(String wea_img) {
         this.wea_img = wea_img;
     }
     public String getWea_img() {
         return wea_img;
     }

    public void setWea_day(String wea_day) {
         this.wea_day = wea_day;
     }
     public String getWea_day() {
         return wea_day;
     }

    public void setWea_day_img(String wea_day_img) {
         this.wea_day_img = wea_day_img;
     }
     public String getWea_day_img() {
         return wea_day_img;
     }

    public void setWea_night(String wea_night) {
         this.wea_night = wea_night;
     }
     public String getWea_night() {
         return wea_night;
     }

    public void setWea_night_img(String wea_night_img) {
         this.wea_night_img = wea_night_img;
     }
     public String getWea_night_img() {
         return wea_night_img;
     }

    public void setTem(String tem) {
         this.tem = tem;
     }
     public String getTem() {
         return tem;
     }

    public void setTem1(String tem1) {
         this.tem1 = tem1;
     }
     public String getTem1() {
         return tem1;
     }

    public void setTem2(String tem2) {
         this.tem2 = tem2;
     }
     public String getTem2() {
         return tem2;
     }

    public void setHumidity(String humidity) {
         this.humidity = humidity;
     }
     public String  getHumidity() {
         return humidity;
     }

    public void setVisibility(String visibility) {
         this.visibility = visibility;
     }
     public String getVisibility() {
         return visibility;
     }

    public void setPressure(String pressure) {
         this.pressure = pressure;
     }
     public String getPressure() {
         return pressure;
     }
//0 : "东北风"
//1 : "东北风"
    public void setWin(List<String> win) {
         this.win = win;
     }
     public List<String> getWin() {
         return win;
     }

    public void setWin_speed(String win_speed) {
         this.win_speed = win_speed;
     }
     public String getWin_speed() {
         return win_speed;
     }

    public void setWin_meter(String win_meter) {
         this.win_meter = win_meter;
     }
     public String getWin_meter() {
         return win_meter;
     }

    public void setSunrise(String sunrise) {
         this.sunrise = sunrise;
     }
     public String getSunrise() {
         return sunrise;
     }

    public void setSunset(String sunset) {
         this.sunset = sunset;
     }
     public String getSunset() {
         return sunset;
     }

    public void setAir(String air) {
         this.air = air;
     }
     public String getAir() {
         return air;
     }

    public void setAir_level(String air_level) {
         this.air_level = air_level;
     }
     public String getAir_level() {
         return air_level;
     }

    public void setAir_tips(String air_tips) {
         this.air_tips = air_tips;
     }
     public String getAir_tips() {
         return air_tips;
     }



    public void setHours(List<Hours> hours) {
         this.hours = hours;
     }
     public List<Hours> getHours() {
         return hours;
     }

    public void setIndex(List<Index> index) {
         this.index = index;
     }
     public List<Index> getIndex() {
         return index;
     }

}