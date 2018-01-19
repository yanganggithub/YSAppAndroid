package com.mobile.cms.ysappandroid.base;

import android.view.View;


import com.mobile.cms.ysappandroid.widget.FrescoImageView;
import com.zhusx.core.app.Lib_BaseFragment;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Author       zhusx
 * Email        327270607@qq.com
 * Created      2016/12/13 14:43
 */

public class BaseFragment extends Lib_BaseFragment {
    private CompositeSubscription mCompositeSubscription;


    public void addSubscription(Subscription s) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(s);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
            mCompositeSubscription = null;
        }
    }
    public void setImageURI(View view, String path) {
        ((FrescoImageView) view).setImageURI(path);
    }
}
