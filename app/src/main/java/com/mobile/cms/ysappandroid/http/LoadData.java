package com.mobile.cms.ysappandroid.http;

import android.app.Dialog;


import com.mobile.cms.ysappandroid.api.ApiService;
import com.mobile.cms.ysappandroid.base.BaseActivity;
import com.mobile.cms.ysappandroid.base.BaseFragment;
import com.mobile.cms.ysappandroid.widget.dialog.LoadingDialog;
import com.zhusx.core.imp.OnCycleListenerImp;
import com.zhusx.core.network.HttpRequest;
import com.zhusx.core.network.HttpResult;

import rx.Observable;

/**
 * Author       zhusx
 * Email        327270607@qq.com
 * Created      2017/2/20 13:33
 */

public class LoadData<T> extends BaseRetrofitLoadData<LoadData.Api, T, Object> {
    Dialog progressDialog;
    BaseActivity activity;

    //用于区分api接口
    public enum Api {
       Home,
    }

    public LoadData(Api api, BaseActivity activity) {
        super(api);
        this.activity = activity;
        activity._addOnCycleListener(new OnCycleListenerImp() {
            @Override
            public void onDestroy() {
                _cancelLoadData();
            }
        });
    }

    public LoadData(Api api, BaseFragment fragment) {
        super(api);
        activity = (BaseActivity) fragment.getActivity();
        fragment._addOnCycleListener(new OnCycleListenerImp() {
            @Override
            public void onDestroy() {
                _cancelLoadData();
//                _Files.writeObject()
            }
        });
    }

    @Override
    protected Observable<JSONResult<T>> getHttpParams(Api api, Object... params) {
        switch (api) {
            case Home:
                return cast(Retrofits.createApi(ApiService.class).getHomePage());
        }

        return null;
    }

    public static <T> T cast(Object o) {
        return (T) o;
    }

    private String valueOf(Object o) {
        if (o == null) {
            return "";
        }
        return String.valueOf(o);
    }

    @Override
    protected void onLoadStart(Api api, HttpRequest<Object> request) {

    }

    public void showProgressDialog() {
        if (progressDialog == null) {
            progressDialog = new LoadingDialog(activity);
            progressDialog.setCanceledOnTouchOutside(false);
        }
        progressDialog.show();
    }

    @Override
    protected void onLoadComplete(Api api, HttpRequest<Object> request, HttpResult<T> result) {
        switch (api) {

        }
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    protected void onLoadError(Api api, HttpRequest<Object> request, HttpResult<T> result, boolean var4, String errorMessage) {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        switch (api) {
            case Home:
                activity.showToast(errorMessage);
                break;
        }
    }
}
