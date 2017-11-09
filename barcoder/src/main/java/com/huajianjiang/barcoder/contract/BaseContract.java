package com.huajianjiang.barcoder.contract;

import android.support.annotation.NonNull;

/**
 * Created by Huajian Jiang on 2017/11/9.
 * developer.huajianjiang@gmail.com
 */
public interface BaseContract {

    interface BaseIView<P extends BaseIPresenter> {
        void bindPresenter(@NonNull P presenter);
    }

    interface BaseIPresenter<V extends BaseIView> {
        void bindView(@NonNull V view);

        void unbindView();
    }

}
