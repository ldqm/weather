package com.jinxi.yqyb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CityDBHelper extends SQLiteOpenHelper {
    private static SQLiteDatabase db;
    ContentValues values=new ContentValues();
    private long flag=0;
//数据库的创建
    public CityDBHelper(@Nullable Context context) {
        super(context, "city.db", null, 1);
        db=this.getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建表
        String sql = "create table city(id integer primary key autoincrement,city varchar(20) unique not null)";
        db.execSQL(sql);
    }
    //城市添加
    public boolean addCity(String city){
        values.put("city",city);
        flag=db.insert("city",null,values);
        return flag>0?true:false;
    }
    //城市删除
    public boolean deleteCity(String city){
        flag=db.delete("city","city=?",new String[]{city});
        return flag>0?true:false;
    }
    //查询city数据并将它们存储在一个字符串列表中返回
    public List<String> queryCity(){
        List<String> cityList=new ArrayList<>();
        Cursor cursor=db.query("city",null,null,null,null,null,null);
        if (cursor!=null){
            while (cursor.moveToNext()){
                String city=cursor.getString(1);
                cityList.add(city);
            }
        }
        return cityList;
    }
    //数据表的查找操作
    public boolean findCity(String city) {
        Cursor cursor = db.query("city", null, "city=?", new String[]{city}, null, null, null);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String findCity = cursor.getString(1);
                Log.i("Jinxi",findCity+"findCity");
                if (findCity != null) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    //数据库升级
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
