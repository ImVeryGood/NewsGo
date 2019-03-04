package com.example.newsgo.feature.picture.ui;


import android.support.v4.app.Fragment;

import com.example.newsgo.R;
import com.example.newsgo.base.mvp.BaseFragment;
import com.example.newsgo.base.mvp.BasePresenter;
import com.example.newsgo.feature.picture.presenter.PicturePresenter;
import com.example.newsgo.feature.picture.view.PictureView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PictureFragment extends BaseFragment implements PictureView {

    @Override
    public int getLayoutId() {
        return R.layout.fragment_picture;
    }

    @Override
    public void onCreateView() {

    }

    @Override
    public BasePresenter initPresenter() {
        return new PicturePresenter(this);
    }

    @Override
    public void showPicture() {

    }

}
