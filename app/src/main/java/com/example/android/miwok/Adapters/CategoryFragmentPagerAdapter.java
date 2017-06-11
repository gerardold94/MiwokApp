package com.example.android.miwok.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.miwok.Fragments.ColorsFragment;
import com.example.android.miwok.Fragments.FamilyFragment;
import com.example.android.miwok.Fragments.NumbersFragment;
import com.example.android.miwok.Fragments.PhrasesFragment;

/**
 * Created by gerardo on 09/06/17.
 */

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Numbers", "Family", "Colors", "Phrases" };


    public CategoryFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
