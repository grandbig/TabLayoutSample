package com.example.ec_dev.tablayoutsample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ec_dev on 2016/02/02.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    final private String[] pageTitles = {"HOME", "SEARCH", "SETTINGS"};

    // コンストラクタ
    public MyFragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 2:
                return SettingsFragment.newInstance(position + 1);
            default:
                return PageFragment.newInstance(position + 1);
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitles[position];
    }

    @Override
    public int getCount() {
        return pageTitles.length;
    }
}
