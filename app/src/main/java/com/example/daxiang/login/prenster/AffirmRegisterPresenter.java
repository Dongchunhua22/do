package com.example.daxiang.login.prenster;


import com.example.daxiang.base.BasePresenter;
import com.example.daxiang.login.bean.AffirmRegisterBean;
import com.example.daxiang.login.contract.AffirmContract;
import com.example.daxiang.login.model.AffirmRegisterModel;
import com.example.daxiang.util.INetCallBack;

public class AffirmRegisterPresenter extends BasePresenter<AffirmContract.IAffirmView> implements AffirmContract.IAffirmPresenter {

    private AffirmContract.IAffirmMode iAffirmMode;
    public AffirmRegisterPresenter() {

        iAffirmMode = new AffirmRegisterModel();

    }

    @Override
    public void register(String phoneNum, String password, String affirm_password) {
        iAffirmMode.register(phoneNum, password, affirm_password, new INetCallBack<AffirmRegisterBean>() {
            @Override
            public void onSuccess(AffirmRegisterBean registerBean) {
                mview.registerResult(registerBean);
            }

            @Override
            public void onError(Throwable throwable) {

            }
        });

    }
}
