package com.example.text.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.text.R;
import com.example.text.bean.KnowledgeBean;
import com.example.text.bean.ModelData;

import java.util.ArrayList;
import java.util.List;

public class ModelRecAdapter extends RecyclerView.Adapter {
    private ArrayList<ModelData.DataBean.KnowledgeListBean> data=new ArrayList<>();
    private Context context;

    public ModelRecAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.rec, parent, false);
        return new OneViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ModelData.DataBean.KnowledgeListBean knowledgeListBean = data.get(position);
        ModelRecAdapter.OneViewHolder oneViewHolder= (ModelRecAdapter.OneViewHolder) holder;
        oneViewHolder.title.setText(knowledgeListBean.getK_name());
        Glide.with(context).load(knowledgeListBean.getK_img()).into(oneViewHolder.image);
    }


    @Override
    public int getItemCount() {
        return data.size();
    }
    public void addData(List<ModelData.DataBean.KnowledgeListBean> data){
        this.data.addAll(data);
        notifyDataSetChanged();
    };
    public class OneViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;
        public OneViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            image=itemView.findViewById(R.id.img);
        }
    }
}
