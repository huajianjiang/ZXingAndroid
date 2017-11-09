package com.huajianjiang.barcoder.presenter;

import android.view.SurfaceHolder;

import com.huajianjiang.barcoder.contract.ScanComponentContract;

/**
 * Created by Huajian Jiang on 2017/11/9.
 * developer.huajianjiang@gmail.com
 */
public class CameraPresenter extends BasePresenter<ScanComponentContract.IView>
        implements ScanComponentContract.IPresenter
{
    @Override
    public void initCamera(SurfaceHolder display) {
        if (!isActive()) return;

    }

    @Override
    public void stopScanning() {
        if (!isActive()) return;
    }

}
