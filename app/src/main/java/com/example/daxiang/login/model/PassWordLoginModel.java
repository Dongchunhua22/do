package com.example.daxiang.login.model;

import android.util.Log;

import com.example.daxiang.api.URLConstants;
import com.example.daxiang.login.contract.PassWordLoginContract;
import com.example.daxiang.util.INetCallBack;
import com.example.daxiang.util.NetWorkFactory;
import com.example.daxiang.util.ParamsUtils;

import java.util.HashMap;

public class PassWordLoginModel implements PassWordLoginContract.IPassWordLoginMode {
    @Override
    public <T> void passWordLogin(String username, String password, INetCallBack<T> iNetCallBack) {

        HashMap<String, String> commonParams = ParamsUtils.getCommonParams();
        commonParams.put("username",username);
        commonParams.put("password",password);

        for (String key: commonParams.keySet()) {
            Log.e("TAG","key="+key+",values="+commonParams.get(key));
        }
        NetWorkFactory.getInstance().getNetWork().post(URLConstants.PHONEPAWORD_LOGIN,commonParams,iNetCallBack);


    }
}
