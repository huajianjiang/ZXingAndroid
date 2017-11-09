package com.huajianjiang.barcoder.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.huajianjiang.barcoder.R;
import com.huajianjiang.barcoder.contract.ScanContract;
import com.huajianjiang.barcoder.model.ScanResult;
import com.huajianjiang.barcoder.presenter.ScanPresenter;
import com.huajianjiang.barcoder.ui.widget.PreviewView;
import com.huajianjiang.barcoder.util.Msgs;
import com.huajianjiang.barcoder.util.Sys;
import com.huajianjiang.barcoder.util.Views;

/**
 * Created by Huajian Jiang on 2017/11/8.
 * developer.huajianjiang@gmail.com
 */
public class ScanActivity extends BaseMvpActivity<ScanContract.IPresenter>
        implements ScanContract.IView
{
    private PreviewView mPreviewView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sacn);
        checkFeature();
    }

    private void checkFeature() {
        if (!Sys.hasCamreaFeature(this)) {
            Msgs.shortToast(this, "Camera not available");
            finish();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        initView();
    }

    private void initView() {
        mPreviewView = Views.find(this, R.id.previewView);
        mPreviewView.bindPresenter(presenter);
    }

    @NonNull
    @Override
    public ScanContract.IPresenter createPresenter() {
        return new ScanPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPreviewView.isSurfaceAvailable()) {
            presenter.initCamera(mPreviewView.getHolder());
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.stopPreviewAndFreeCamera();
    }

    @Override
    public void onScanResultAvailable(ScanResult result) {

    }
}
