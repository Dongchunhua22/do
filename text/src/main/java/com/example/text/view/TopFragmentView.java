package com.example.text.view;

import com.example.text.base.BaseView;
import com.example.text.bean.KnowledgeBean;
import com.example.text.bean.ModelData;

public interface TopFragmentView extends BaseView {
    void setKnowledge(KnowledgeBean knowledgeBean);

    void setModel(ModelData knowledgeBean);
}
