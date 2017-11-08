package com.huajianjiang.barcoder.camera;

/**
 * Created by Huajian Jiang on 2017/11/8.
 * developer.huajianjiang@gmail.com
 */
public enum CameraFacing {
    BACK(0), FRONT(1);

    private final int mId;

    CameraFacing(int id) {
        mId = id;
    }

    public int cameraId() {
        return mId;
    }
}
