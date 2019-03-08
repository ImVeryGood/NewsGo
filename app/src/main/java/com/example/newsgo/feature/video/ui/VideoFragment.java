package com.example.newsgo.feature.video.ui;


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
public class VideoFragment extends BaseFragment {


    @Override
    public int getLayoutId() {
        return R.layout.fragment_video;
    }

    @Override
    public void onCreateView() {

    }

    @Override
    public BasePresenter initPresenter() {
        return null;
    }

}
