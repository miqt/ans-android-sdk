package com.analysys.allgro.plugin;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;

/**
 * Description:
 * Author: fengzeyuan
 * Date: 2019-11-21 16:33
 * Version: 1.0
 */
public interface ASMHookInterface {
    // ------------------------ Fragment ---------------------------------------

    /**
     * fragmentViewCreated 探针
     */
    void onFragmentViewCreated(Object object, View rootView, Bundle savedInstanceState, boolean hasTrackPvAnn);

    /**
     * fragmentResume 探针
     *
     * @param object fragment 实例
     */
    void trackFragmentResume(Object object, boolean hasTrackPvAnn);

    /**
     * SetUserVisibleHint 探针
     */
    void trackFragmentSetUserVisibleHint(Object object, boolean isVisibleToUser, boolean hasTrackPvAnn);

    /**
     * Fragment OnHiddenChanged 探针
     */
    void trackOnHiddenChanged(Object object, boolean hidden, boolean hasTrackPvAnn);


    // ------------------------ Click ---------------------------------------

    /**
     * Dialog 点击
     */
    void trackDialog(DialogInterface dialogInterface, int which, boolean hasTrackClickAnn);

    /**
     * TabLayout 点击
     */
    void trackTabLayout(Object object, Object tab, boolean hasTrackClickAnn);

    /**
     * TabHost 点击
     */
    void trackTabHost(String tabName, boolean hasTrackClickAnn);

    /**
     * RadioGroup 点击
     */
    void trackRadioGroup(RadioGroup parent, int checkedId, boolean hasTrackClickAnn);

    /**
     * 扩展ListView Child Item点击
     */
    void trackExpListViewChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, boolean hasTrackClickAnn);

    /**
     * 扩展列表控件GroupItem点击
     */
    void trackExpListViewGroupClick(ExpandableListView parent, View v, int groupPosition, boolean hasTrackClickAnn);

    /**
     * 列表控件点击
     */
    void trackListView(AdapterView<?> parent, View v, int position, boolean hasTrackClickAnn);

    /**
     * 独立控件点击
     */
    void trackViewOnClick(View v, boolean hasTrackClickAnn);
    
    /**
     * 菜单控件点击
     */
    void trackMenuItem(Object obj,MenuItem menuItem, boolean hasTrackClickAnn);

    /**
     * 菜单控件点击
     */
    void trackMenuItem(MenuItem menuItem, boolean hasTrackClickAnn);
    
    /**
     * DrawerLayout控件点击
     */
    void trackDrawerSwitch(View drawerLayout,boolean isOpen, boolean hasTrackClickAnn);

    /**
     * 可能的XML控件点击绑定
     */
    void maybeClickInXML(View v, boolean methodName, boolean hasTrackClickAnn);

}
