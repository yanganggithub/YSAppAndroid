package com.mobile.cms.ysappandroid.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;

import com.mobile.cms.ysappandroid.R;


/**
 * Author       zhusx
 * Email        327270607@qq.com
 * Created      2017/5/25 9:57
 */

public class LoadingDialog extends Dialog {

    public LoadingDialog(@NonNull Context context) {
        super(context, R.style.dialogTransparent);
        setContentView(R.layout.dialog_loading);
    }
}
