package com.huajianjiang.barcoder.model;

import android.hardware.Camera;

import com.huajianjiang.barcoder.camera.CameraFacing;

/**
 * Created by Huajian Jiang on 2017/11/8.
 * developer.huajianjiang@gmail.com
 */
public class ActiveCamera {
    private int mId;
    private CameraFacing mFacing;
    private int mOrientation;
    private Camera mCamera;

    public ActiveCamera(int id, CameraFacing facing, int orientation, Camera camera) {
        mId = id;
        mFacing = facing;
        mOrientation = orientation;
        mCamera = camera;
    }

    public int getId() {
        return mId;
    }

    public CameraFacing getFacing() {
        return mFacing;
    }

    public int getOrientation() {
        return mOrientation;
    }

    public Camera getCamera() {
        return mCamera;
    }
}
