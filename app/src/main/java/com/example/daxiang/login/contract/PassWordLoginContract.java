package com.example.daxiang.login.contract;

import com.example.daxiang.base.BaseView;
import com.example.daxiang.login.bean.AffirmRegisterBean;
import com.example.daxiang.util.INetCallBack;

public class PassWordLoginContract {
    public interface IPassWordLoginView extends BaseView {
        void  getPWLoginResult(AffirmRegisterBean string);
    }
    public interface IPassWordLoginMode{
        <T> void passWordLogin(String username, String password, INetCallBack<T> iNetCallBack);
    }
    public interface IPassWordLoginPresenter{
        void passWordLogin(String username, String password);
    }
}
