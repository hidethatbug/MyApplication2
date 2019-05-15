package com.bawei.myapplication.mvp.home_mvp;

import com.bawei.myapplication.net.DataCallBack;
import com.bawei.myapplication.net.HttpUtile;

public class HomeModelImpl implements IHomecontract.IHomeMdoel {
    @Override
    public void getDataList(String path, DataCallBack dataCallBack) {
        HttpUtile.getInstance().getData_GET(path,dataCallBack);
    }
}
