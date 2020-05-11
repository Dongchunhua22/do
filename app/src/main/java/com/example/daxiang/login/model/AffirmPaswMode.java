package com.example.daxiang.login.model;

import android.util.Log;

import com.example.daxiang.api.URLConstants;
import com.example.daxiang.login.contract.AffirmPassWordContract;
import com.example.daxiang.util.INetCallBack;
import com.example.daxiang.util.NetWorkFactory;
import com.example.daxiang.util.ParamsUtils;

import java.util.HashMap;

public class AffirmPaswMode implements AffirmPassWordContract.IAffirmPaswMode {
    @Override
    public <T> void forgetPasw(String mobile, String sms_code, String password, INetCallBack<T> iNetCallBack) {
        HashMap<String, String> commonParams = ParamsUtils.getCommonParams();
        commonParams.put("mobile",mobile);
        commonParams.put("password",password);
        commonParams.put("sms_code",sms_code);

        for (String key: commonParams.keySet()) {
            Log.e("TAG","key="+key+",values="+commonParams.get(key));
        }
        NetWorkFactory.getInstance().getNetWork().post(URLConstants.FORGET_PW,commonParams,iNetCallBack);



    }
}
