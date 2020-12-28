package com.example.text.model;

public interface NetCallBack<T> {
    void onSuccess(T t);
    void onFail(String msg);
}
