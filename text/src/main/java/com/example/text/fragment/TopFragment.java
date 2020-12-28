package com.example.text.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.text.R;
import com.example.text.adapter.MainPageAdapter;
import com.example.text.adapter.ModelFragmentAdapter;
import com.example.text.base.BaseFragment;
import com.example.text.bean.KnowledgeBean;
import com.example.text.bean.ModelData;
import com.example.text.pre.TopFragmentPre;
import com.example.text.view.TopFragmentView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TopFragment extends BaseFragment<TopFragmentPre> implements TopFragmentView, View.OnClickListener {
    private int k_id = 0;
    private TextView mSearchTop;
    private TextView mKonwledge;
    private TextView mModel;
    private boolean know_IsDown = true;
    private boolean model_IsDown = true;
    private PopupWindow know_pop;
    private TabLayout mTabXuanke;
    private ViewPager mPageXuanke;
    private PopupWindow model_pop;
    private int km_id=0;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected TopFragmentPre initPre() {
        return new TopFragmentPre();
    }

    @Override
    protected void initView(View inflate) {

        mSearchTop = (TextView) inflate.findViewById(R.id.top_search);
        mKonwledge = (TextView) inflate.findViewById(R.id.konwledge);
        mKonwledge.setOnClickListener(this);
        mModel = (TextView) inflate.findViewById(R.id.model);
        mModel.setOnClickListener(this);
        mTabXuanke = (TabLayout) inflate.findViewById(R.id.xuanke_tab);
        mPageXuanke = (ViewPager) inflate.findViewById(R.id.xuanke_page);
        mTabXuanke.setSelectedTabIndicator(0);
    }

    @Override
    protected int getLayout() {
        return R.layout.topfragment;
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.konwledge:
                // TODO 20/05/27
                konwledgeClick();
                break;
            case R.id.model:
                // TODO 20/05/27
                modelClick();
                break;
            default:
                break;
        }
    }

    private void modelClick() {
        if (model_IsDown) {
            showModelPop();
            if(know_pop!=null&&know_pop.isShowing()){
                know_pop.dismiss();
                know_IsDown=true;
            }
        } else {
            model_pop.dismiss();
        }
        setModelStatus();
    }

    private void showModelPop() {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.model_pop, null);
        final RadioButton one = inflate.findViewById(R.id.model_one);
        final RadioButton two = inflate.findViewById(R.id.model_two);
        final RadioButton three = inflate.findViewById(R.id.model_three);
        final RadioButton four = inflate.findViewById(R.id.model_four);
        final RadioButton five = inflate.findViewById(R.id.model_five);
        final RadioButton six = inflate.findViewById(R.id.model_six);
        final RadioButton seven = inflate.findViewById(R.id.model_seven);
        Button clear = inflate.findViewById(R.id.model_pop_clear);
        Button complete = inflate.findViewById(R.id.model_pop_complete);
        //全部恢复背景颜色
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one.setChecked(false);
                two.setChecked(false);
                three.setChecked(false);
                four.setChecked(false);
                five.setChecked(false);
                six.setChecked(false);
                seven.setChecked(false);
            }
        });
        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model_IsDown=true;
                model_pop.dismiss();
                if (one.isChecked() || two.isChecked() || three.isChecked() || four.isChecked() || five.isChecked() || six.isChecked()||seven.isChecked()) {
                    pre.getModelData(0,2222,km_id,3);
                    mTabXuanke.removeAllTabs();
                    mPageXuanke.removeAllViews();
                } else {
                    km_id = 0;
                    Toast.makeText(getActivity(), "请选择模块", Toast.LENGTH_SHORT).show();
                }
            }
        });
        setBackGround(one,two,three,four,five,six,seven);
        model_pop = new PopupWindow(inflate, LinearLayout.LayoutParams.MATCH_PARENT, 600);


        model_pop.showAsDropDown(mKonwledge, 0, 0);

    }

    private void setBackGround(final RadioButton one, final RadioButton two, final RadioButton three, final RadioButton four, final RadioButton five, final RadioButton six, final RadioButton seven) {
        one.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    km_id=39;
                    five.setChecked(false);
                    six.setChecked(false);
                    seven.setChecked(false);
                }
            }
        });  two.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    km_id=40;
                    five.setChecked(false);
                    six.setChecked(false);
                    seven.setChecked(false);
                }
            }
        });  three.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    km_id=41;
                    five.setChecked(false);
                    six.setChecked(false);
                    seven.setChecked(false);
                }
            }
        });  four.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    km_id=42;
                    five.setChecked(false);
                    six.setChecked(false);
                    seven.setChecked(false);
                }

            }
        });
        five.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    km_id=43;
                    one.setChecked(false);
                    two.setChecked(false);
                    three.setChecked(false);
                    four.setChecked(false);
                }
            }
        });
        six.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    km_id=44;
                    one.setChecked(false);
                    two.setChecked(false);
                    three.setChecked(false);
                    four.setChecked(false);
                }

            }
        });
        seven.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    km_id=45;
                    one.setChecked(false);
                    two.setChecked(false);
                    three.setChecked(false);
                    four.setChecked(false);
                }
            }
        });
    }

    private void setModelStatus() {
        if (model_IsDown) {
            model_IsDown = false;

        } else {
            model_IsDown = true;
        }
    }

    private void konwledgeClick() {
        if (know_IsDown) {
            showPop();
            if(model_pop!=null&&model_pop.isShowing()){
                model_pop.dismiss();
                model_IsDown=true;
            }
        } else {
            know_pop.dismiss();
        }
        setKnowStatus();
    }

    private void showPop() {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.know_pop1, null);
        final RadioButton one = inflate.findViewById(R.id.one);
        final RadioButton two = inflate.findViewById(R.id.two);
        final RadioButton three = inflate.findViewById(R.id.three);
        final RadioButton four = inflate.findViewById(R.id.four);
        final RadioButton five = inflate.findViewById(R.id.five);
        final RadioButton six = inflate.findViewById(R.id.six);
        setCheck(one, two, three, four, five, six);
        know_pop = new PopupWindow(inflate, LinearLayout.LayoutParams.MATCH_PARENT, 600);
        Button clear = inflate.findViewById(R.id.know_pop_clear);
        Button complete = inflate.findViewById(R.id.know_pop_complete);
        //全部恢复背景颜色
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one.setChecked(false);
                two.setChecked(false);
                three.setChecked(false);
                four.setChecked(false);
                five.setChecked(false);
                six.setChecked(false);
            }
        });
        //点击完成，取消PopWindow的展示
        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                know_pop.dismiss();
                know_IsDown = true;
                if (one.isChecked() || two.isChecked() || three.isChecked() || four.isChecked() || five.isChecked() || six.isChecked()) {
                    pre.getData(0,2222,k_id,3);
                    mTabXuanke.removeAllTabs();
                    mPageXuanke.removeAllViews();
                } else {
                    k_id = 0;
                    Toast.makeText(getActivity(), "请选择年级", Toast.LENGTH_SHORT).show();
                }

            }
        });
        know_pop.showAsDropDown(mKonwledge, 0, 0);
    }

    private void setCheck(final RadioButton one, final RadioButton two, final RadioButton three, final RadioButton four, final RadioButton five, final RadioButton six) {
        one.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    k_id = 5;
                    four.setChecked(false);
                    five.setChecked(false);
                    six.setChecked(false);
                }
            }
        });
        two.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    k_id = 6;
                    four.setChecked(false);
                    five.setChecked(false);
                    six.setChecked(false);
                }
            }
        });
        three.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    k_id = 7;
                    four.setChecked(false);
                    five.setChecked(false);
                    six.setChecked(false);
                }
            }
        });
        four.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    k_id = 8;
                    one.setChecked(false);
                    two.setChecked(false);
                    three.setChecked(false);
                }
            }
        });
        five.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    k_id = 9;
                    one.setChecked(false);
                    two.setChecked(false);
                    three.setChecked(false);
                }
            }
        });
        six.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    k_id = 10;
                    one.setChecked(false);
                    two.setChecked(false);
                    three.setChecked(false);
                }
            }
        });
    }


    private void setKnowStatus() {
        if (know_IsDown) {
            know_IsDown = false;
        } else {
            know_IsDown = true;
        }
    }

    @Override
    public void setKnowledge(KnowledgeBean knowledgeBean) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Fragment> fragments = new ArrayList<>();
        Log.i("TAG", "setKnowledge: "+knowledgeBean.getData().size());
        List<KnowledgeBean.DataBean> data = knowledgeBean.getData();
        for (int i = 0; i < data.size(); i++) {
           strings.add( data.get(i).getType_name());
            KnowledgeFragment knowledgeFragment = new KnowledgeFragment(data.get(i).getKnowledge_list());
            fragments.add(knowledgeFragment);
        }
        MainPageAdapter mainPageAdapter = new MainPageAdapter(getChildFragmentManager(), fragments, strings);
        mPageXuanke.setAdapter(mainPageAdapter);
        mTabXuanke.setupWithViewPager(mPageXuanke);
    }

    @Override
    public void setModel(ModelData knowledgeBean) {
        ArrayList<Fragment> fragments = new ArrayList<>();
        Log.i("TAG", "setKnowledge: "+knowledgeBean.getData().size());
        List<ModelData.DataBean> data = knowledgeBean.getData();
        if(data.size()>0){
            ModelFragment modelFragment = new ModelFragment(data.get(0).getKnowledge_list());
            fragments.add(modelFragment);
            ModelFragmentAdapter modelFragmentAdapter = new ModelFragmentAdapter(getChildFragmentManager(), fragments);
            mPageXuanke.setAdapter(modelFragmentAdapter);
            mTabXuanke.setupWithViewPager(mPageXuanke);
        }

    }
}
