package com.example.text.base;

import java.lang.ref.WeakReference;

public class BasePre<V extends BaseView>  {
   public V view;
    public void bindView(V v){
        this.view= v;
    }
}
