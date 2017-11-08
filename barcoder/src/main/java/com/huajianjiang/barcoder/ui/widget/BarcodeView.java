package com.huajianjiang.barcoder.ui.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Huajian Jiang on 2017/11/8.
 * developer.huajianjiang@gmail.com
 */
public class BarcodeView extends SurfaceView {
    private SurfaceHolder mHolder;
    private SurfaceCallback mCallback;

    public BarcodeView(Context context) {
        this(context, null);
    }

    public BarcodeView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BarcodeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public BarcodeView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        mCallback = new SurfaceCallback();
        mHolder = getHolder();
        mHolder.addCallback(mCallback);
    }


    private class SurfaceCallback implements SurfaceHolder.Callback {

        @Override
        public void surfaceCreated(SurfaceHolder surfaceHolder) {

        }

        @Override
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mHolder.removeCallback(mCallback);
    }

}
