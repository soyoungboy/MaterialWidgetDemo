package com.soyoungboy.material.fragement;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 
 * TODO: 头条
 * 
 * @author soyoungboy
 * @date 2015-2-7 上午11:18:24
 * @version 0.1.0
 */
public class HeadlinesFragment extends Fragment {

	private int mResourceId;
	
	public static HeadlinesFragment newInstance(int resourceId) {
		HeadlinesFragment headlinesFragment = new HeadlinesFragment();
		headlinesFragment.mResourceId = resourceId;
		return headlinesFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view =inflater.inflate(mResourceId, container, false);	
		return view;
	}


}
