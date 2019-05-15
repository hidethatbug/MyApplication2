package com.bawei.myapplication.home_fragment;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.bawei.myapplication.Api;
import com.bawei.myapplication.R;
import com.bawei.myapplication.base.BaseFragment;
import com.bawei.myapplication.mvp.home_mvp.HomePersenterImpl;
import com.bawei.myapplication.mvp.home_mvp.IHomecontract;

public class HomeFragment extends BaseFragment implements IHomecontract.IHomeView {


    private IHomecontract.IHomePresenter presenter;
    @Override
    protected void bindFind(View view) {

        presenter=new HomePersenterImpl();
        presenter.attach(this);
        presenter.getDataBanner(Api.home_path_banner);
        presenter.getDataList(Api.home_path_list);
    }

    @Override
    protected int bindView() {
        return R.layout.home_fragment;
    }

    @Override
    protected void initData() {

    }

    @Override
    public void getListData(String s) {

        Log.i("123", "getListData: "+s);
    }

    @Override
    public void getBanner(String s) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detach();
    }
}
