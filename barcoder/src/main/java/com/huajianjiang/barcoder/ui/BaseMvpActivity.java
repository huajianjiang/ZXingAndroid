package com.huajianjiang.barcoder.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.huajianjiang.barcoder.contract.BaseContract;

/**
 * Created by Huajian Jiang on 2017/11/9.
 * developer.huajianjiang@gmail.com
 */
public abstract class BaseMvpActivity<P extends BaseContract.BaseIPresenter>
        extends AppCompatActivity implements BaseContract.BaseIView<P>
{
    protected P presenter;

    @NonNull
    public abstract P createPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindPresenter(createPresenter());
    }

    @SuppressWarnings("unchecked")
    @Override
    public void bindPresenter(@NonNull P presenter) {
        this.presenter = presenter;
        presenter.bindView(this);
    }

    @Override
    protected void onDestroy() {
        presenter.unbindView();
        super.onDestroy();
    }
}
