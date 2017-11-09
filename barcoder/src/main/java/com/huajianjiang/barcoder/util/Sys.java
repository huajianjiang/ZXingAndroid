package com.huajianjiang.barcoder.util;

import android.Manifest;
import android.content.Context;

/**
 * <p>Author: Huajian Jiang
 * <br>Date: 2017/11/10
 * <br>Email: developer.huajianjiang@gmail.com
 */
public class Sys {

    public static boolean hasCamreaFeature(Context context) {
        return context.getPackageManager().hasSystemFeature(Manifest.permission.CAMERA);
    }

}
