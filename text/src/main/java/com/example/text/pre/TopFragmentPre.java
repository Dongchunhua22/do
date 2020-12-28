package com.example.text.pre;

import com.example.text.base.BasePre;
import com.example.text.bean.KnowledgeBean;
import com.example.text.bean.ModelData;
import com.example.text.model.NetCallBack;
import com.example.text.model.TopModel;
import com.example.text.view.TopFragmentView;

public class TopFragmentPre extends BasePre<TopFragmentView> {

    private final TopModel topModel;

    public TopFragmentPre() {
        topModel = new TopModel();
    }

    public void getData(int channel, int uid, int k_id, int pid) {
        topModel.getData(channel,uid,k_id,pid, new NetCallBack<KnowledgeBean>() {
            @Override
            public void onSuccess(KnowledgeBean knowledgeBean) {
                view.setKnowledge(knowledgeBean);
            }

            @Override
            public void onFail(String msg) {
view.showToast(msg);
            }
        });
    }

    public void getModelData(int channel, int uid, int km_id, int pid) {
        topModel.getModelData(channel,uid,km_id,pid,new NetCallBack<ModelData>(){

            @Override
            public void onSuccess(ModelData modelData) {
view.setModel(modelData);
            }

            @Override
            public void onFail(String msg) {
view.showToast(msg);
            }
        });
    }
}
