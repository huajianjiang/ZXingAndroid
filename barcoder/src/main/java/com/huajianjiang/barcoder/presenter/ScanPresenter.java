package com.huajianjiang.barcoder.presenter;

import android.view.SurfaceHolder;

import com.huajianjiang.barcoder.contract.ScanContract;

/**
 * Created by Huajian Jiang on 2017/11/9.
 * developer.huajianjiang@gmail.com
 */
public class ScanPresenter extends BasePresenter<ScanContract.IView>
        implements ScanContract.IPresenter
{
    @Override
    public void initCamera(SurfaceHolder display) {
        if (!isActive()) return;
    }

    @Override
    public void startPreview() {

    }

    @Override
    public void stopPreview() {

    }

    @Override
    public void stopPreviewAndFreeCamera() {

    }

}
