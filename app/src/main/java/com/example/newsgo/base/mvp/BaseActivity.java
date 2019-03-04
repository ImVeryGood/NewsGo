package com.example.newsgo.base.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * date:2019/2/15
 * describe:baseActivity
 */
public abstract class BaseActivity<P extends BasePresenter> extends RxAppCompatActivity implements BaseView {
    protected P presenter;
    public Context mContext;
    protected Unbinder unbinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext = this;
        unbinder= ButterKnife.bind(this);
        presenter = initPresenter();
        onCreate();
    }

    /**
     * 布局id
     *
     * @return
     */
    public abstract int getLayoutId();

    /**
     * onCreate
     */
    public abstract void onCreate();

    /**
     * presenter
     *
     * @return
     */
    public abstract P initPresenter();

    @Override
    public Context mContext() {
        return mContext;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        if (presenter != null) {
            presenter.detach();
        }
    }
}
