package com.example.text.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.text.R;
import com.example.text.adapter.RecAdapter;
import com.example.text.bean.KnowledgeBean;

import java.util.List;

public class KnowledgeFragment extends Fragment {

    private final List<KnowledgeBean.DataBean.KnowledgeListBean> data;
    private RecyclerView rec;
    private RecAdapter adapter;

    public KnowledgeFragment(List<KnowledgeBean.DataBean.KnowledgeListBean> knowledge_list) {
        this.data=knowledge_list;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.knowledge, null);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        rec = inflate.findViewById(R.id.kn_rec);
        rec.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new RecAdapter(getActivity());
        rec.setAdapter(adapter);
        adapter.addData(data);
    }

}
