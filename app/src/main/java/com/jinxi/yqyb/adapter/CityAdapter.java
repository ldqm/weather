package com.jinxi.yqyb.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.jinxi.yqyb.R;

import java.util.List;

public class CityAdapter extends BaseAdapter {


    private Context context;
    private List<String> cityList;


    public CityAdapter(Context context, List<String> cityList) {
        this.context = context;
        this.cityList = cityList;
    }
//获取数据列表显示大小
    @Override
    public int getCount() {
        return cityList.size();
    }
//获取指定位置的数据
    @Override
    public Object getItem(int position) {
        return cityList.get(position);
    }
//获取指定位置ID
    @Override
    public long getItemId(int position) {
        return position;
    }
//获取指定位置的列表项的视图
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder viewHolder = null;
        if (convertView==null){//判断是否为空，创建新的视图
            viewHolder=new ViewHolder();
            convertView=View.inflate(context, R.layout.city_listview_item,null);
            viewHolder.cityNameTv=convertView.findViewById(R.id.cityNameTv);
            convertView.setTag(viewHolder);//将 viewHolder 设置为 convertView 的标签
        }else {
            viewHolder=(ViewHolder)convertView.getTag();
        }
        viewHolder.cityNameTv.setText(cityList.get(position));
        return convertView;
    }
    class ViewHolder{
        TextView cityNameTv;
    }
}
