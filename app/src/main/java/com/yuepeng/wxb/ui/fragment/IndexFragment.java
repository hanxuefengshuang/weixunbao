package com.yuepeng.wxb.ui.fragment;

import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.gyf.immersionbar.ImmersionBar;
import com.gyf.immersionbar.components.ImmersionFragment;
import com.gyf.immersionbar.components.ImmersionOwner;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;
import com.yuepeng.wxb.R;
import com.yuepeng.wxb.base.BaseFragment;
import com.yuepeng.wxb.databinding.FragmentIndexBinding;
import com.yuepeng.wxb.presenter.IndexPresenter;
import com.yuepeng.wxb.presenter.view.IndexDetailView;
import com.yuepeng.wxb.utils.StatusBarUtil;
import com.zackratos.ultimatebarx.library.UltimateBarX;

import androidx.annotation.NonNull;

public  class IndexFragment extends BaseFragment<FragmentIndexBinding, IndexPresenter>implements IndexDetailView, OnRefreshLoadMoreListener, View.OnClickListener, ImmersionOwner {

    private ImmersionBar mImmersionBar;

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
        return R.layout.fragment_index;
    }

    @Override
    protected IndexPresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
//        Window window = getWindow();
//        //After LOLLIPOP not translucent status bar
//        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        //Then call setStatusBarColor.
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//        window.setStatusBarColor(getResources().getColor(R.color.test_bg));


//        UltimateBarX.create(UltimateBarX.STATUS_BAR)        // 设置状态栏
//                .fitWindow(true)                                // 布局是否侵入状态栏（true 不侵入，false 侵入）
//                .bgColor(Color.RED)                           // 状态栏背景颜色（色值）
//                .bgColorRes(R.color.design_default_color_error)                // 状态栏背景颜色（资源id）
////                .bgRes(R.drawable.ic_launcher_background)                  // 状态栏背景 drawable
//                .light(false)                                   // light模式（状态栏字体灰色 Android 6.0 以上支持）
//                .apply(this);


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

    @Override
    public void onLazyBeforeView() {

    }

    @Override
    public void onLazyAfterView() {

    }

    @Override
    public void onVisible() {

    }

    @Override
    public void onInvisible() {

    }

    @Override
    public void initImmersionBar() {

    }

    @Override
    public boolean immersionBarEnabled() {
        return true;
    }
}
