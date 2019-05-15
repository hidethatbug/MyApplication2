package com.bawei.myapplication.mvp.home_mvp;

import com.bawei.myapplication.net.DataCallBack;

public class HomePersenterImpl implements IHomecontract.IHomePresenter {
    private IHomecontract.IHomeView view;
    private IHomecontract.IHomeMdoel mdoel;
    @Override
    public void attach(IHomecontract.IHomeView view) {
        this.view=view;
        mdoel=new HomeModelImpl();
    }

    @Override
    public void detach() {
        if (view!=null){
            view=null;
        }
        if (mdoel!=null){
            mdoel=null;
        }
    }

    @Override
    public void getDataBanner(String path_banner) {
            mdoel.getDataList(path_banner, new DataCallBack() {
                @Override
                public void Success(String s) {
                    view.getBanner(s);
                }

                @Override
                public void Error(String s) {

                }
            });

    }

    @Override
    public void getDataList(String path_list) {
        mdoel.getDataList(path_list, new DataCallBack() {
            @Override
            public void Success(String s) {
                view.getListData(s);
            }

            @Override
            public void Error(String s) {

            }
        });
    }
}
