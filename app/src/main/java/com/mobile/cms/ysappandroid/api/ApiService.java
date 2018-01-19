package com.mobile.cms.ysappandroid.api;

import com.mobile.cms.ysappandroid.entity.home.HomePageEntity;
import com.mobile.cms.ysappandroid.http.JSONResult;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by yangang on 2018/1/18.
 */

public interface ApiService {

    /**
     * 首页
     */
    @GET("ysapi/v1.HomePage/getHomeData")
    Observable<JSONResult<HomePageEntity>> getHomePage();
}
