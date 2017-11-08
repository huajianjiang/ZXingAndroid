package com.huajianjiang.barcoder.camera;

import android.hardware.Camera;
import android.view.SurfaceHolder;

import com.huajianjiang.barcoder.model.ActiveCamera;

import java.io.IOException;

/**
 * Created by Huajian Jiang on 2017/11/8.
 * developer.huajianjiang@gmail.com
 */
public class CameraHelper {
    public static final int UNSPECIFIED_CAMERA_ID = -1;

    private CameraHelper() {
    }

    public void open(SurfaceHolder surface) throws IOException {
        open(UNSPECIFIED_CAMERA_ID, surface);
    }

    public void open(CameraFacing facing, SurfaceHolder surface) throws IOException {
        open(facing.cameraId(), surface);
    }

    public void open(int cameraId, SurfaceHolder surface) throws IOException {
        final int cameraNumber = Camera.getNumberOfCameras();
        final boolean validCamera = 0 <= cameraId && cameraId < cameraNumber - 1;
        cameraId = validCamera ? cameraId : 0;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(cameraId, cameraInfo);

        Camera camera = Camera.open(cameraId);
        camera.setPreviewDisplay(surface);
    }


}


