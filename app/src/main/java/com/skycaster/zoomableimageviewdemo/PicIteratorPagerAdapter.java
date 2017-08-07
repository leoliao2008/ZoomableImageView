package com.skycaster.zoomableimageviewdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by 廖华凯 on 2017/7/31.
 */

public class PicIteratorPagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<PicDetailFragment>mList=new ArrayList<>();



        public PicIteratorPagerAdapter(FragmentManager fm) {
        super(fm);
        PicDetailFragment f1=new PicDetailFragment(R.drawable.pic_01);
        PicDetailFragment f2=new PicDetailFragment(R.drawable.pic_02);
        PicDetailFragment f3=new PicDetailFragment(R.drawable.pic_03);
        PicDetailFragment f4=new PicDetailFragment(R.drawable.pic_04);
        PicDetailFragment f5=new PicDetailFragment(R.drawable.pic_05);
        PicDetailFragment f6=new PicDetailFragment(R.drawable.pic_06);
        PicDetailFragment f7=new PicDetailFragment(R.drawable.pic_07);
        mList.add(f1);
        mList.add(f2);
        mList.add(f3);
        mList.add(f4);
        mList.add(f5);
        mList.add(f6);
        mList.add(f7);
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

}
