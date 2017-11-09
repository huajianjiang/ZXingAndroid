package com.huajianjiang.barcoder.model;

import android.graphics.Bitmap;

import com.google.zxing.Result;

/**
 * Created by Huajian Jiang on 2017/11/9.
 * developer.huajianjiang@gmail.com
 */
public class ScanResult {
    private Result mRaw;
    private Bitmap mBarcode;
    private int scale;

    public ScanResult(Result raw, Bitmap barcode, int scale) {
        mRaw = raw;
        mBarcode = barcode;
        this.scale = scale;
    }

    public Result getRaw() {
        return mRaw;
    }

    public Bitmap getBarcode() {
        return mBarcode;
    }

    public int getScale() {
        return scale;
    }

}
