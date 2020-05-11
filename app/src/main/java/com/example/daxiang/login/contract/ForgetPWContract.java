package com.example.daxiang.login.contract;

import com.example.daxiang.base.BaseView;
import com.example.daxiang.login.bean.VerfiedBean;
import com.example.daxiang.util.INetCallBack;

public class ForgetPWContract {
    public interface IForgetPWView extends BaseView {

        //            逻辑判断在P层判断--为了简单一点，扔道Acitivty
        void getVerified(VerfiedBean s);

        void checkSmsCodeResult(VerfiedBean verfiedBean);

    }
    public interface IForgetPWMode{
        <T> void getVerified(String phoneNum, String type, INetCallBack<T> iNetCallBack);

        <T> void checkSmsCode(String phoneNum, String smsCode, String type, INetCallBack<T> iNetCallBack);
    }
    public interface IForgetPWPresenter{
        void getVerified(String string, String type);
        void checkSmsCode(String phoneNum, String smsCode, String type);
    }
}
