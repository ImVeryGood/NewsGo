package com.example.newsgo.base.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trello.rxlifecycle2.components.support.RxFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * date:2019/2/15
 */
public abstract class BaseFragment<P extends BasePresenter> extends RxFragment implements BaseView {
    protected Context mContext;
    public P presenter;
    protected View view;
    protected Unbinder unbinder;

    public BaseFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        presenter = initPresenter();
        view = inflater.inflate(getLayoutId(), container, false);
        unbinder = ButterKnife.bind(this, view);
        mContext=getActivity();
        onCreateView();
        return view;
    }

    /**
     * 布局id
     *
     * @return
     */
    public abstract int getLayoutId();

    /**
     * onCreateView
     */
    public abstract void onCreateView();

    public abstract P initPresenter();

    @Override
    public Context mContext() {
        return mContext;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
