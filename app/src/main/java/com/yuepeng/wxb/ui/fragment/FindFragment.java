package com.yuepeng.wxb.ui.fragment;

import android.view.View;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;
import com.yuepeng.wxb.R;
import com.yuepeng.wxb.base.BaseFragment;
import com.yuepeng.wxb.databinding.FragmentFindBinding;
import com.yuepeng.wxb.presenter.FindPresenter;
import com.yuepeng.wxb.presenter.view.FindDetailView;

import androidx.annotation.NonNull;

public class FindFragment extends BaseFragment<FragmentFindBinding, FindPresenter> implements FindDetailView, OnRefreshLoadMoreListener, View.OnClickListener {
    @Override
    public void onClick(View v) {

    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {

    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {

    }

    @Override
    protected int onBindLayout() {
        return R.layout.fragment_find;
    }

    @Override
    protected FindPresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void Retry() {

    }

    @Override
    protected View injectTarget() {
        return null;
    }

    @Override
    public void initData() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onFailed(String msg) {

    }

    @Override
    public void onFinishRefreshAndLoadMore() {

    }

    @Override
    public void onFinishRefreshAndLoadMoreWithNoMoreData() {

    }
}
