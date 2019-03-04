package com.example.newsgo.feature;

import com.example.newsgo.R;
import com.example.newsgo.base.mvp.BaseActivity;
import com.example.newsgo.base.mvp.BasePresenter;

public class MainActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public BasePresenter initPresenter() {
        return null;
    }
}
