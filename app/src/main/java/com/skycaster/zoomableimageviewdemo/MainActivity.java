package com.skycaster.zoomableimageviewdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ZoomControls;

import com.skycaster.zoomableimageviewlib.ZoomableImageView;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private PicIteratorPagerAdapter mAdapter;
    private ZoomControls mZoomControls;
    private PicDetailFragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager= (ViewPager) findViewById(R.id.view_pager);
        mAdapter=new PicIteratorPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);



        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                mFragment= (PicDetailFragment) mAdapter.getItem(position);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mZoomControls= (ZoomControls) findViewById(R.id.zoom_control);
        mZoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragment.zoom(ZoomableImageView.ZoomDirection.IN);

            }
        });

        mZoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragment.zoom(ZoomableImageView.ZoomDirection.OUT);
            }
        });
    }
}
