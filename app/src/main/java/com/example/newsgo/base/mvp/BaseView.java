package com.example.newsgo.base.mvp;

import android.content.Context;

import com.trello.rxlifecycle2.LifecycleTransformer;

/**
 * date:2019/2/15
 * describe:baseView
 */
public interface BaseView {
    /**
     * 获取context
     *
     * @return
     */
    Context mContext();

    /**
     * 绑定生命周期
     *
     * @param <T>
     * @return
     */
    <T> LifecycleTransformer<T> bindToLifecycle();
}
