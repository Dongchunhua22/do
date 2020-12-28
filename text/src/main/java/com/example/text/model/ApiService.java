package com.example.text.model;

import com.example.text.bean.KnowledgeBean;
import com.example.text.bean.ModelData;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    String BaseUrl="http://apidev.niuwaketang.com/";
    @POST("api/knowledge/knowledge_list")
    @FormUrlEncoded
    Observable<KnowledgeBean> getKnowledge(@Field("channel")int chaggel,@Field("uid") int uid,@Field("k_id") int k_id,@Field("pid") int pid);
    @POST("api/knowledge/knowledge_list")
    @FormUrlEncoded
    Observable<ModelData> getModel(@Field("channel")int chaggel,@Field("uid") int uid,@Field("km_id") int km_id,@Field("pid") int pid);
}
