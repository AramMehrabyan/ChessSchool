package com.example.admin.chessschool;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter_Fragments extends FragmentPagerAdapter {

    public MyAdapter_Fragments(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fragment_dasavorutyun();
            case 1:
                return new Fragment_zinvor();
            case 2:
                return new Fragment_navak();
            case 3:
                return new Fragment_pix();
            case 4:
                return new Fragment_dzi();
            case 5:
                return new Fragment_taguhi();
            case 6:
                return new Fragment_tagavor();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 7;
    }
}

