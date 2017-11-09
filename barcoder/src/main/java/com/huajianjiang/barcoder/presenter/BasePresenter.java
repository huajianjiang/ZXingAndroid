package com.huajianjiang.barcoder.presenter;

import android.support.annotation.NonNull;

import com.huajianjiang.barcoder.contract.BaseContract;

/**
 * Created by Huajian Jiang on 2017/11/9.
 * developer.huajianjiang@gmail.com
 */
public class BasePresenter<V extends BaseContract.BaseIView>
        implements BaseContract.BaseIPresenter<V>
{
    protected V view;

    @Override
    public void bindView(@NonNull V view) {
        this.view = view;
    }

    @Override
    public void unbindView() {
        view = null;
    }

    public boolean isActive() {
        return view != null;
    }

}
