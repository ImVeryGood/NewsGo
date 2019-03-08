package com.example.newsgo.feature.main.ui;


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
public class MineFragment extends BaseFragment {

    @Override
    public int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    public void onCreateView() {

    }

    @Override
    public BasePresenter initPresenter() {
        return null;
    }

}
