package com.example.daxiang.login.contract;

import com.example.daxiang.base.BaseView;
import com.example.daxiang.login.bean.VerfiedBean;
import com.example.daxiang.util.INetCallBack;

public class AffirmPassWordContract {
    public  interface  IAffirmPaswView extends BaseView{
        void  registerResult(VerfiedBean bean);
    }

    public  interface  IAffirmPaswMode{
        <T> void  forgetPasw(String mobile, String sms_code, String password, INetCallBack<T>iNetCallBack);

    }

    public  interface IAffirPaswPresenter{
        void  forgetPasw(String moblie,String sms_code,String password);
    }
}
