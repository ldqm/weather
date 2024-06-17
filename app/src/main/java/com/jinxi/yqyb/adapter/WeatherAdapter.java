package com.jinxi.yqyb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.jinxi.yqyb.Bean.Hours;
import com.jinxi.yqyb.R;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {
    private Context context;
    private List<Hours> timeBean;

    public WeatherAdapter(Context context, List<Hours> timeBean) {
        this.context = context;
        this.timeBean = timeBean;
    }
    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.fragment_recylerview_item,parent,false);//布局文件中获取对象
        WeatherViewHolder weatherViewHolder=new WeatherViewHolder(view);//传入布局文件
        return weatherViewHolder;
    }
    @Override
    //获取数据
    public void onBindViewHolder(@NonNull WeatherViewHolder holder, int position) {
        Hours hoursBean = timeBean.get(position);
        holder.timeTv.setText(hoursBean.getHours());
        holder.timeWeatherTv.setText(hoursBean.getWea());
        holder.timeTempTv.setText(hoursBean.getTem()+"°C");
        holder.timeWindTv.setText(hoursBean.getWin()+" "+hoursBean.getWin_speed());
    }

    @Override
    //获取列表项的数量
    public int getItemCount() {
        if (timeBean==null){
            return 0;
        }
        return timeBean.size();//获取列表项的数量，并将该数量作为返回值
    }


    //timeTv：用于显示时间的 TextView 控件
    //timeTempTv：用于显示温度的 TextView 控件
    //timeWeatherTv：用于显示天气情况的 TextView 控件
    //timeWindTv：用于显示风力风向的 TextView 控件

    class WeatherViewHolder extends RecyclerView.ViewHolder {
        TextView timeTv;
        TextView timeTempTv;
        TextView timeWeatherTv;
        TextView timeWindTv;
        public WeatherViewHolder(@NonNull View itemView) {
            super(itemView);//初始化itemView
            timeTv = itemView.findViewById(R.id.timeTv);
            timeTempTv = itemView.findViewById(R.id.timeTempTv);
            timeWeatherTv = itemView.findViewById(R.id.timeWeatherTv);
            timeWindTv = itemView.findViewById(R.id.timeWindTv);
        }
    }
}
