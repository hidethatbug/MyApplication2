package com.bawei.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.myapplication.adapter.Home_ListAdapter;
import com.bawei.myapplication.base.BaseFragment;
import com.bawei.myapplication.home_fragment.BuycarFragment;
import com.bawei.myapplication.home_fragment.ClassifyFragment;
import com.bawei.myapplication.home_fragment.HomeFragment;
import com.bawei.myapplication.home_fragment.MyFragment;
import com.bawei.myapplication.home_fragment.ShoppingFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout home_tablayout;
    private ViewPager home_viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home_tablayout = findViewById(R.id.home_tablayout);
        home_viewpager = findViewById(R.id.home_viewpager);
        List<BaseFragment> list=new ArrayList<>();
        //"主页","分类","购物","购物车","我的"
        list.add(new HomeFragment());
        list.add(new ClassifyFragment());
        list.add(new ShoppingFragment());
        list.add(new BuycarFragment());
        list.add(new MyFragment());

        home_viewpager.setAdapter(new Home_ListAdapter(getSupportFragmentManager(),list));
        home_tablayout.setupWithViewPager(home_viewpager);
    }
}
