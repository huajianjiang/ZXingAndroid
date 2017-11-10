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

    /**
     * 初始化 camera ，打开 camera 驱动
     * @param surface 显示 camera 预览的 surface
     * @throws IOException
     */
    public void open(SurfaceHolder surface) throws IOException {
        open(0, surface);
    }

    /**
     * @param facing
     * @param surface
     * @throws IOException
     */
    public void open(CameraFacing facing, SurfaceHolder surface) throws IOException {
        open(facing.cameraId(), surface);
    }

    /**
     * @param cameraId
     * @param surface
     * @return
     * @throws IOException
     * @throws RuntimeException
     */
    public ActiveCameraManager open(int cameraId, SurfaceHolder surface) throws IOException,
            RuntimeException
    {
        final int cameraNumber = Camera.getNumberOfCameras();
        final boolean validCamera = 0 <= cameraId && cameraId < cameraNumber - 1;
        cameraId = validCamera ? cameraId : 0;

        Camera camera = Camera.open(cameraId);
        if (camera == null) {
            throw new IOException();
        }

        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(cameraId, cameraInfo);

        camera.setPreviewDisplay(surface);

        ActiveCamera activeCamera = new ActiveCamera(cameraId, CameraFacing.facing(cameraId),
                cameraInfo.orientation, camera);

        return new ActiveCameraManager(activeCamera);
    }

}


