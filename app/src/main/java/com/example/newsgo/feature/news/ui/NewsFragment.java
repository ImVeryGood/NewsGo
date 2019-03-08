package com.example.newsgo.feature.news.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newsgo.R;
import com.example.newsgo.base.mvp.BaseFragment;
import com.example.newsgo.base.mvp.BasePresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends BaseFragment {

    @Override
    public int getLayoutId() {
        return R.layout.fragment_news;
    }

    @Override
    public void onCreateView() {

    }

    @Override
    public BasePresenter initPresenter() {
        return null;
    }

}
