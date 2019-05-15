package com.bawei.myapplication.mvp.home_mvp;

import com.bawei.myapplication.net.DataCallBack;

public interface IHomecontract {
    interface IHomeMdoel{
        void getDataList(String path, DataCallBack dataCallBack);

    }
    interface IHomeView{
        void getListData(String s);
        void getBanner(String s);
    }
    interface IHomePresenter{
        void attach(IHomeView view);
        void detach();
        void getDataBanner(String path_banner);
        void getDataList(String path_list);
    }
}
