package com.mobile.cms.ysappandroid.ui.homepage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.mobile.cms.ysappandroid.R;
import com.mobile.cms.ysappandroid.base.BaseFragment;
import com.mobile.cms.ysappandroid.entity.home.HomePageEntity;
import com.mobile.cms.ysappandroid.http.LoadData;
import com.mobile.cms.ysappandroid.http.LoadingHelper;
import com.mobile.cms.ysappandroid.widget.FrescoImageView;
import com.zhusx.core.adapter.Lib_BaseAdapter;
import com.zhusx.core.adapter.Lib_BasePagerAdapter;
import com.zhusx.core.network.HttpRequest;
import com.zhusx.core.network.HttpResult;
import com.zhusx.core.utils._Lists;
import com.zhusx.core.widget.Lib_Widget_LooperViewPager;
import com.zhusx.core.widget.indicator.Lib_ViewPager_LinePageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by yangang on 2018/1/18.
 */

public class MainHomeFragment extends BaseFragment {
    private LoadData<HomePageEntity> loadData;
    private HomePageEntity data;
    @BindView(R.id.content)
    ScrollView content;
    @BindView(R.id.flayout_top)
    ViewGroup topLayout;
    @BindView(R.id.tv_message)
    TextView topMessageTv;
    @BindView(R.id.indicator)
    Lib_ViewPager_LinePageIndicator indicatorView;
    @BindView(R.id.viewPager)
    Lib_Widget_LooperViewPager viewPager;
    @BindView(R.id.gridView)
    GridView gridView;
    @BindView(R.id.gridView1)
    GridView gridView1;

    @BindView(R.id.gridView2)
    GridView gridView2;

    @BindView(R.id.gridView3)
    GridView gridView3;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_homepage,container,false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);

        loadData = new LoadData<HomePageEntity>(LoadData.Api.Home,this);
        loadData._setOnLoadingListener(new LoadingHelper<HomePageEntity>(content,loadData) {
            @Override
            public void __onComplete(HttpRequest<Object> httpRequest, HttpResult<HomePageEntity> data) {
                initData(data.getData());
            }


        });
        loadData._loadData();
    }

    private void initData(final HomePageEntity data) {
        content.setVisibility(View.VISIBLE);
        this.data = data;
        ViewGroup.LayoutParams lp = topLayout.getLayoutParams();
        lp.height = _getFullScreenWidth() * 350/750;
        lp.width = _getFullScreenWidth();
        topLayout.setLayoutParams(lp);

        viewPager.setAdapter(new Lib_BasePagerAdapter<HomePageEntity.SlideListBean>(getActivity(), data.slide_list) {
            @Override
            public View getView(LayoutInflater layoutInflater, int i, final HomePageEntity.SlideListBean slide, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = new FrescoImageView(layoutInflater.getContext());
                }
                ((FrescoImageView) view).setImageURI(slide.litpic);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                return view;
            }
        });

        if (!_Lists.isEmpty(data.slide_list)) {
            topMessageTv.setText(data.slide_list.get(0).title);
        }

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                topMessageTv.setText(data.slide_list.get(viewPager.getCurrentItem()).title);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        indicatorView._setViewPager(viewPager);

        gridView.setAdapter(new Lib_BaseAdapter<HomePageEntity.DataListBean.DataBean>(data.move_list.data) {
            @Override
            public View getView(LayoutInflater layoutInflater, final HomePageEntity.DataListBean.DataBean tv, int i, View view, ViewGroup viewGroup) {
                ViewHolder holder = _getViewHolder(view, viewGroup, R.layout.list_item_movie);
                holder.setText(R.id.tv_message, TextUtils.isEmpty(tv.title) ? "" : tv.title);
                holder.setText(R.id.tv_name, tv.title);
                setImageURI(holder.getView(R.id.iv_image), tv.litpic);

                return holder.rootView;
            }
        });

        gridView1.setAdapter(new Lib_BaseAdapter<HomePageEntity.DataListBean.DataBean>(data.tv_list.data) {
            @Override
            public View getView(LayoutInflater layoutInflater, final HomePageEntity.DataListBean.DataBean tv, int i, View view, ViewGroup viewGroup) {
                ViewHolder holder = _getViewHolder(view, viewGroup, R.layout.list_item_movie);
                holder.setText(R.id.tv_message, TextUtils.isEmpty(tv.title) ? "" : tv.title);
                holder.setText(R.id.tv_name, tv.title);
                setImageURI(holder.getView(R.id.iv_image), tv.litpic);

                return holder.rootView;
            }
        });

        gridView2.setAdapter(new Lib_BaseAdapter<HomePageEntity.DataListBean.DataBean>(data.arts_list.data) {
            @Override
            public View getView(LayoutInflater layoutInflater, final HomePageEntity.DataListBean.DataBean tv, int i, View view, ViewGroup viewGroup) {
                ViewHolder holder = _getViewHolder(view, viewGroup, R.layout.list_item_movie);
                holder.setText(R.id.tv_message, TextUtils.isEmpty(tv.title) ? "" : tv.title);
                holder.setText(R.id.tv_name, tv.title);
                setImageURI(holder.getView(R.id.iv_image), tv.litpic);

                return holder.rootView;
            }
        });

        gridView3.setAdapter(new Lib_BaseAdapter<HomePageEntity.DataListBean.DataBean>(data.comic_list.data) {
            @Override
            public View getView(LayoutInflater layoutInflater, final HomePageEntity.DataListBean.DataBean tv, int i, View view, ViewGroup viewGroup) {
                ViewHolder holder = _getViewHolder(view, viewGroup, R.layout.list_item_movie);
                holder.setText(R.id.tv_message, TextUtils.isEmpty(tv.title) ? "" : tv.title);
                holder.setText(R.id.tv_name, tv.title);
                setImageURI(holder.getView(R.id.iv_image), tv.litpic);

                return holder.rootView;
            }
        });






    }
}

