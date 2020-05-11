package com.example.daxiang.login.prenster;

import com.example.daxiang.base.BasePresenter;
import com.example.daxiang.login.bean.VerfiedBean;
import com.example.daxiang.login.contract.AffirmPassWordContract;
import com.example.daxiang.login.model.AffirmPaswMode;
import com.example.daxiang.util.INetCallBack;

public class AffirmPaswPresenter extends BasePresenter<AffirmPassWordContract.IAffirmPaswView>implements AffirmPassWordContract.IAffirPaswPresenter {
    private AffirmPassWordContract.IAffirmPaswMode iAffirmPaswMode;

    public AffirmPaswPresenter() {

        iAffirmPaswMode = new AffirmPaswMode();

    }
    @Override
    public void forgetPasw(String phoneNum, String sms, String password) {
        iAffirmPaswMode.forgetPasw(phoneNum, sms, password, new INetCallBack<VerfiedBean>() {
            @Override
            public void onSuccess(VerfiedBean bean) {

                mview.registerResult(bean);
            }

            @Override
            public void onError(Throwable throwable) {

            }
        });

    }
}
