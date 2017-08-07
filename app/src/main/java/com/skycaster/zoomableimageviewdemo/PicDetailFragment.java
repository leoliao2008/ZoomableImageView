package com.skycaster.zoomableimageviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skycaster.zoomableimageviewlib.ZoomableImageView;

/**
 * Created by 廖华凯 on 2017/7/31.
 */

public class PicDetailFragment extends Fragment{
    private static final String RESOURCE_ID = "Resource_Id";
    private ZoomableImageView mImageView;

    public PicDetailFragment() {
    }

    public PicDetailFragment(int imageRscId) {
        Bundle bundle=new Bundle();
        bundle.putInt(RESOURCE_ID,imageRscId);
        setArguments(bundle);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mImageView= (ZoomableImageView) inflater.inflate(R.layout.fragment_pic_detail,null);
        Bundle bundle = getArguments();
        int id = bundle.getInt(RESOURCE_ID, R.drawable.pic_08);
        mImageView.setImageResource(id);
        return mImageView;
    }


    public void zoom(ZoomableImageView.ZoomDirection direction){
        mImageView.zoom(direction);
    }

}
