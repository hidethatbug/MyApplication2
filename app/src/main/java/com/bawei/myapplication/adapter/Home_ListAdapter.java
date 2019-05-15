package com.bawei.myapplication.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bawei.myapplication.base.BaseFragment;

import java.util.List;

public class Home_ListAdapter extends FragmentPagerAdapter {
    private List<BaseFragment> list;
    private String tab_title[]=new String[]{
            "主页","分类","购物","购物车","我的"
    };

    public Home_ListAdapter(FragmentManager fm, List<BaseFragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tab_title[position];
    }
}
