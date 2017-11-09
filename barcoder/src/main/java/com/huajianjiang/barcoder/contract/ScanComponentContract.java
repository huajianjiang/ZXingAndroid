package com.huajianjiang.barcoder.contract;

import android.view.SurfaceHolder;

import com.google.zxing.Result;
import com.huajianjiang.barcoder.model.ScanResult;

/**
 * Created by Huajian Jiang on 2017/11/9.
 * developer.huajianjiang@gmail.com
 */
public interface ScanComponentContract {

    interface IView extends ScanContract.IView<IPresenter> {
        void onScanResultAvailable(ScanResult result);
    }

    interface IPresenter extends ScanContract.IPresenter<IView> {

    }

}
