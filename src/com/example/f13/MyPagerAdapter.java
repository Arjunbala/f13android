package com.example.f13;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {

private final List<Fragment> fragments;

/**
* @param fm
* @param fragments
*/
public MyPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
super(fm);
this.fragments = fragments;
}

/*
* (non-Javadoc)
*
* @see android.support.v4.app.FragmentPagerAdapter#getItem(int)
*/
@Override
public Fragment getItem(int position) {
return this.fragments.get(position);
}

/*
* (non-Javadoc)
*
* @see android.support.v4.view.PagerAdapter#getCount()
*/
@Override
public int getCount() {
return this.fragments.size();
}
}
