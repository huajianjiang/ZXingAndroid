package com.huajianjiang.barcoder.contract;

import android.view.SurfaceHolder;

import com.huajianjiang.barcoder.model.ScanResult;

/**
 * Created by Huajian Jiang on 2017/11/9.
 * developer.huajianjiang@gmail.com
 */
public interface ScanContract {

    interface IView extends BaseContract.BaseIView<IPresenter> {
        void onScanResultAvailable(ScanResult result);
    }

    interface IPresenter extends BaseContract.BaseIPresenter<IView> {
        void initAndPreviewCamera(SurfaceHolder display);

        void startPreview();

        void stopPreview();

        void stopPreviewAndFreeCamera();
    }

}
