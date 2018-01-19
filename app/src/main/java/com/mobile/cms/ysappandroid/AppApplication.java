package com.mobile.cms.ysappandroid;

import android.app.Application;
import android.graphics.Bitmap;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;

/**
 * Created by yangang on 2018/1/19.
 */

public class AppApplication extends Application {
    public void onCreate() {
        super.onCreate();
        //初始化Fresco
        Fresco.initialize(this, ImagePipelineConfig.newBuilder(this)
                .setDownsampleEnabled(true)
                .setBitmapsConfig(Bitmap.Config.ARGB_8888)
                .build());

    }
}
