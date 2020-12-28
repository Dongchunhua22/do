package com.example.text.model;

import com.example.text.bean.KnowledgeBean;
import com.example.text.bean.ModelData;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class TopModel {

    public void getData(int channel, int uid, int k_id, int pid, final NetCallBack<KnowledgeBean> callBack) {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(ApiService.BaseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = build.create(ApiService.class
        );
        Observable<KnowledgeBean> knowledge = apiService.getKnowledge(channel, uid, k_id, pid);
        knowledge.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<KnowledgeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(KnowledgeBean knowledgeBean) {
                        callBack.onSuccess(knowledgeBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                callBack.onFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void getModelData(int channel, int uid, int km_id, int pid, final NetCallBack<ModelData> callBack) {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(ApiService.BaseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = build.create(ApiService.class
        );
        Observable<ModelData> knowledge = apiService.getModel(channel, uid, km_id, pid);
        knowledge.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ModelData>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ModelData knowledgeBean) {
                        callBack.onSuccess(knowledgeBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callBack.onFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
