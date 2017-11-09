package com.huajianjiang.barcoder.camera;

import android.hardware.Camera;

import com.huajianjiang.barcoder.model.ActiveCamera;

/**
 * Created by Huajian Jiang on 2017/11/9.
 * developer.huajianjiang@gmail.com
 */
class ActiveCameraManager {
    private boolean mIsPreviewing;

    private ActiveCamera mCamera;

    ActiveCameraManager(ActiveCamera camera) {
        mCamera = camera;
    }

    public void startPreview() {
        if (mIsPreviewing) {
            return;
        }
        Camera camera = mCamera.getCamera();
        camera.startPreview();
    }

    public void stopPreview() {
        if (!mIsPreviewing) {
            return;
        }
        Camera camera = mCamera.getCamera();
        camera.stopPreview();
    }
}
