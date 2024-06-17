package com.jinxi.yqyb.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jinxi.yqyb.CityDBHelper;
import com.jinxi.yqyb.R;

import java.util.List;

public class AddAdapter extends RecyclerView.Adapter<AddAdapter.ViewHolder>{
    private Context context;
    private List<String> cityList;
    private CityDBHelper cityDBHelper;

    public AddAdapter(Context context, List<String> cityList,CityDBHelper cityDBHelper) {
        this.context = context;
        this.cityList = cityList;
        this.cityDBHelper=cityDBHelper;
    }

    @NonNull
    @Override
    public AddAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=View.inflate(context,R.layout.add_recylerview_item,null);// 布局文件获取
        ViewHolder viewHolder = new ViewHolder(view);//创建并传入
        return viewHolder;//返回该 ViewHolder 对象
    }
//绑定数据到 ViewHolder 上
    @Override
    public void onBindViewHolder(@NonNull AddAdapter.ViewHolder holder, int position) {
        holder.cityTv.setText(cityList.get(position));//显示城市名称

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clickCity=cityList.get(position);//在点击事件中，获取点击的城市名称
                if (clickCity!=null){
                    if (cityDBHelper.findCity(clickCity)) {//判断该城市是否已存在于数据库中
                        if (cityDBHelper.addCity(clickCity)) {
                            Toast.makeText(context,"添加成功",Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent("UPDATE");
                            context.sendBroadcast(intent);
                        }else {
                            Toast.makeText(context,"添加失败",Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(context,"已存在该城市",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
//RecyclerView 总共有多少个项需要显示
    @Override
    public int getItemCount() {
        return cityList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView cityTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cityTv=itemView.findViewById(R.id.itemCityTv);
        }
    }
}
