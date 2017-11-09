package com.huajianjiang.barcoder.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.huajianjiang.barcoder.R;
import com.huajianjiang.barcoder.contract.ScanComponentContract;
import com.huajianjiang.barcoder.model.ScanResult;
import com.huajianjiang.barcoder.presenter.CameraPresenter;
import com.huajianjiang.barcoder.ui.widget.PreviewView;
import com.huajianjiang.barcoder.util.Views;

/**
 * Created by Huajian Jiang on 2017/11/8.
 * developer.huajianjiang@gmail.com
 */
public class ScanActivity extends BaseMvpActivity<ScanComponentContract.IPresenter>
        implements ScanComponentContract.IView
{
    private PreviewView mPreviewView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sacn);
        initView();
    }

    private void initView() {
        mPreviewView = Views.find(this, R.id.previewView);
        mPreviewView.bindPresenter(presenter);
    }

    @NonNull
    @Override
    public ScanComponentContract.IPresenter createPresenter() {
        return new CameraPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    public void onScanResultAvailable(ScanResult result) {

    }

}
