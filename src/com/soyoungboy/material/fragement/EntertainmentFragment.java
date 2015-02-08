package com.soyoungboy.material.fragement;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 
 * TODO: 娱乐
 * 
 * @author soyoungboy
 * @date 2015-2-7 上午11:18:24
 * @version 0.1.0
 */
public class EntertainmentFragment extends Fragment {

	private int mResourceId;

	public static EntertainmentFragment newInstance(int resourceId) {
		EntertainmentFragment headlinesFragment = new EntertainmentFragment();
		headlinesFragment.mResourceId = resourceId;
		return headlinesFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(mResourceId, container, false);
	}
}
