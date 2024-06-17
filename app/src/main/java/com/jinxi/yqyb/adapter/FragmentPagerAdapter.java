package com.jinxi.yqyb.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragmentList;

    public FragmentPagerAdapter(FragmentManager fragmentManager, List<Fragment> fragments) {
        super(fragmentManager);
        this.fragmentList=fragments;//初始化
    }
    @NonNull
    @Override
    //获取指定位置的Frament
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    //获取Fragment的数量
    public int getCount() {
        return fragmentList.size();
    }
}
