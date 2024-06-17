/**
  * Copyright 2021 json.cn 
  */
package com.jinxi.yqyb.Bean;


/*
hours : "19时"
wea : "阴"
wea_img : "yin"
tem : "22"
win : "东北风"
win_speed : "<3级"
 */

//hours：表示小时数的字符串
//wea：表示天气情况的字符串
//wea_img：表示天气情况对应的图片的字符串
//tem：表示温度的字符串
//win：表示风向的字符串
//win_speed：表示风速的字符串
public class Hours {

    private String hours;
    private String wea;
    private String wea_img;
    private String tem;
    private String win;
    private String win_speed;
    public void setHours(String hours) {
         this.hours = hours;
     }
     public String getHours() {
         return hours;
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

    public void setTem(String tem) {
         this.tem = tem;
     }
     public String getTem() {
         return tem;
     }

    public void setWin(String win) {
         this.win = win;
     }
     public String getWin() {
         return win;
     }

    public void setWin_speed(String win_speed) {
         this.win_speed = win_speed;
     }
     public String getWin_speed() {
         return win_speed;
     }
}