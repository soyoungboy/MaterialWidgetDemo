package com.soyoungboy.material.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.material.widget.TabIndicator;
import com.soyoungboy.material.adapter.TestPagerAdapter;
import com.yh.materialwidgetdemo.R;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
		TestPagerAdapter adapter = new TestPagerAdapter(
				getSupportFragmentManager());
		viewPager.setAdapter(adapter);

		TabIndicator indicator = (TabIndicator) findViewById(R.id.indicator);
		indicator.setViewPager(viewPager);
	}
}