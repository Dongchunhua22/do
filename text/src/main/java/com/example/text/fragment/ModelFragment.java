package com.example.text.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.text.R;
import com.example.text.adapter.ModelRecAdapter;
import com.example.text.adapter.RecAdapter;
import com.example.text.bean.ModelData;

import java.util.List;

public class ModelFragment extends Fragment {
    private final List<ModelData.DataBean.KnowledgeListBean> data;
    private ModelRecAdapter adapter;

    public ModelFragment(List<ModelData.DataBean.KnowledgeListBean> dataBean) {
        this.data=dataBean;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.modelfragment, null);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        RecyclerView rec = inflate.findViewById(R.id.model_rec);
        rec.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new ModelRecAdapter(getActivity());
        rec.setAdapter(adapter);
        adapter.addData(data);
    }
}
