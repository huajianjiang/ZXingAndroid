package com.huajianjiang.barcoder.camera;

/**
 * Created by Huajian Jiang on 2017/11/8.
 * developer.huajianjiang@gmail.com
 */
public enum CameraFacing {
    BACK(0), FRONT(1), UNKNOWN(-1);

    private final int mId;

    CameraFacing(int id) {
        mId = id;
    }

    public int cameraId() {
        return mId;
    }

    public static CameraFacing facing(int cameraId) {
        CameraFacing facing;
        if (cameraId == 0) {
            facing = BACK;
        } else if (cameraId == 1) {
            facing = FRONT;
        } else {
            facing = UNKNOWN;
        }
        return facing;
    }
}
