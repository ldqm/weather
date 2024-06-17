/**
  * Copyright 2021 json.cn 
  */
package com.jinxi.yqyb.Bean;


/*
title : "紫外线指数"
level : "弱"
desc : "辐射较弱，涂擦SPF12-15、PA+护肤品。"
 */
//该类用于表示天气指数信息
public class Index {

    private String title;//标题
    private String level;//级别
    private String desc;//描述
    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setLevel(String level) {
         this.level = level;
     }
     public String getLevel() {
         return level;
     }

    public void setDesc(String desc) {
         this.desc = desc;
     }
     public String getDesc() {
         return desc;
     }
}