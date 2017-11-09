package com.huajianjiang.barcoder.contract;

import android.view.SurfaceHolder;

/**
 * Created by Huajian Jiang on 2017/11/9.
 * developer.huajianjiang@gmail.com
 */
public interface ScanContract {

    interface IView<P extends IPresenter> extends BaseContract.BaseIView<P> {

    }

    interface IPresenter<V extends IView> extends BaseContract.BaseIPresenter<V> {
        void initCamera(SurfaceHolder display);

        void stopScanning();
    }

}
