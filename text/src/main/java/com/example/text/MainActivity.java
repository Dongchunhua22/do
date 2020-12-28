package com.example.text;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.text.adapter.MainPageAdapter;
import com.example.text.base.BaseActivity;
import com.example.text.base.BasePre;
import com.example.text.fragment.TopFragment;
import com.example.text.pre.MainPre;
import com.example.text.view.MainView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements MainView {


    private ViewPager mPageMain;
    private TabLayout mTabMain;
    private ArrayList<Fragment> fragments;
    private MainPageAdapter mainPageAdapter;
    private ArrayList<String> strings;
    private ArrayList<Integer> images;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {

        mPageMain = (ViewPager) findViewById(R.id.main_page);
        mTabMain = (TabLayout) findViewById(R.id.main_tab);
        mTabMain.setSelectedTabIndicator(0);
        initFragment();
        initTab();
        initImages();
        mainPageAdapter = new MainPageAdapter(getSupportFragmentManager(), fragments,strings);
        mPageMain.setAdapter(mainPageAdapter);
        mTabMain.setupWithViewPager(mPageMain);
        for (int i = 0; i < strings.size(); i++) {
            TabLayout.Tab tab = mTabMain.getTabAt(i);
            //设置自定义Tab布局
            tab.setCustomView(getTabView(i));
        }
    }

    private void initImages() {
        images = new ArrayList<>();
        images.add(R.drawable.top_select);
        images.add(R.drawable.xuanke_selete);
        images.add(R.drawable.exam_select);
        images.add(R.drawable.kaoshi_select);
        images.add(R.drawable.mine_select);
    }

    //根据索引获取对应的tab的自定义view
    private View getTabView(int position) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.tab, null);
        TextView tv = inflate.findViewById(R.id.tv);
        ImageView iv = inflate.findViewById(R.id.iv);
        tv.setText(strings.get(position));
        iv.setImageResource(images.get(position));
        return inflate;
    }

    private void saveTabText() {
        for (int i = 0; i < strings.size(); i++) {
            mTabMain.getTabAt(i).setText(strings.get(i));
        };
    }

    private void initTab() {
        strings = new ArrayList<>();
        strings.add("首页");
        strings.add("选择");
        strings.add("杯赛");
        strings.add("考试");
        strings.add("我的");

    }

    private void initFragment() {
        fragments = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            fragments.add(new TopFragment());
        }
    }

    @Override
    protected BasePre initPre() {
        return new MainPre();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void showToast(String msg) {

    }
}