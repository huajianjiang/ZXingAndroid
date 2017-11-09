package com.huajianjiang.barcoder.ui.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.huajianjiang.barcoder.contract.BaseContract;
import com.huajianjiang.barcoder.contract.ScanContract;

/**
 * Created by Huajian Jiang on 2017/11/8.
 * developer.huajianjiang@gmail.com
 */
public class PreviewView extends SurfaceView
        implements BaseContract.BaseIView<ScanContract.IPresenter>
{
    private ScanContract.IPresenter mPresenter;

    private boolean mIsSurfaceAvailable = false;
    private SurfaceHolder mHolder;
    private SurfaceCallback mCallback;

    public PreviewView(Context context) {
        this(context, null);
    }

    public PreviewView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PreviewView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PreviewView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        mCallback = new SurfaceCallback();
        mHolder = getHolder();
        mHolder.addCallback(mCallback);
    }

    public boolean isSurfaceAvailable() {
        return mIsSurfaceAvailable;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mHolder.removeCallback(mCallback);
    }

    @Override
    public void bindPresenter(@NonNull ScanContract.IPresenter presenter) {
        mPresenter = presenter;
    }

    private class SurfaceCallback implements SurfaceHolder.Callback {

        @Override
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            mIsSurfaceAvailable = true;
            mPresenter.initCamera(surfaceHolder);
        }

        @Override
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            mIsSurfaceAvailable = false;
            mPresenter.stopPreview();
        }
    }

}
