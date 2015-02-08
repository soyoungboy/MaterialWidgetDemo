package com.soyoungboy.material.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.material.widget.TabIndicator;
import com.soyoungboy.material.fragement.EntertainmentFragment;
import com.soyoungboy.material.fragement.HeadlinesFragment;
import com.soyoungboy.material.fragement.TestFragment;
import com.yh.materialwidgetdemo.R;
/**
 * Created by IntelliJ IDEA. User: keith. Date: 14-9-24. Time: 16:10.
 */
public class TestPagerAdapter extends FragmentPagerAdapter implements
TabIndicator.TabResourceProvider {

	protected static final String[] CONTENT = new String[] { "头条",
		"娱乐", "热点", "体育" };

	private int mCount = CONTENT.length;

	public TestPagerAdapter(FragmentManager fragmentManager) {
		super(fragmentManager);
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			return HeadlinesFragment.newInstance(R.layout.widget_layout1);
		case 1:
			return EntertainmentFragment.newInstance(R.layout.widget_layout2);
		default:
			return TestFragment.newInstance(CONTENT[position]);
		}
	}

	@Override
	public String getText(int position) {
		return TestPagerAdapter.CONTENT[position % CONTENT.length];
	}

	@Override
	public int getCount() {
		return mCount;
	}
}
