package com.huajianjiang.barcoder.ui.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Huajian Jiang on 2017/11/8.
 * developer.huajianjiang@gmail.com
 */
public class ScanHelperView extends View {
    public ScanHelperView(Context context) {
        super(context);
    }

    public ScanHelperView(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
    }

    public ScanHelperView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ScanHelperView(Context context, @Nullable AttributeSet attrs, int defStyleAttr,
            int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
