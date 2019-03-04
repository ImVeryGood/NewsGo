package com.example.newsgo.base.mvp;

import java.lang.ref.WeakReference;

/**
 * date:2019/2/15
 */
public abstract class BasePresenter<V extends BaseView> {
    protected V view;
    private WeakReference<V> weakReference;

    public BasePresenter(V view) {
        weakReference = new WeakReference<>(view);
        this.view = weakReference.get();
        init();
    }

    /**
     * 解绑
     */
    public void detach() {
        view = null;
        weakReference.clear();
        weakReference = null;
    }

    protected abstract void init();
}
