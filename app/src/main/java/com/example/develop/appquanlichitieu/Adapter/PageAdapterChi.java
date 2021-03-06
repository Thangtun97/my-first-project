package com.example.develop.appquanlichitieu.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import com.example.develop.appquanlichitieu.TabPage.KhoanChiFragment;
import com.example.develop.appquanlichitieu.TabPage.LoaiChiFragment;

/**
 * Created by Develop on 5/4/2018.
 */

public class PageAdapterChi extends FragmentStatePagerAdapter {


    public PageAdapterChi(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag= new KhoanChiFragment();

                break;
            case 1:
                frag=new LoaiChiFragment();

                break;


        }

        return frag;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        String title = "";
        switch (position){
            case 0:
                title = "Chi tiết chi";
                break;
            case 1:
                title = "Loại chi";
                break;
        }

        return title;
    }

}
