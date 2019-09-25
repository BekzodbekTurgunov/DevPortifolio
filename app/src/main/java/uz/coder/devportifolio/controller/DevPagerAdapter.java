package uz.coder.devportifolio.controller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

import uz.coder.devportifolio.view.AboutFragment;
import uz.coder.devportifolio.view.ContactFragment;
import uz.coder.devportifolio.view.SkillsFragment;
import uz.coder.devportifolio.view.WorkFragment;

public class DevPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments = new ArrayList<>();

    public DevPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments.add(new AboutFragment());
        fragments.add(new WorkFragment());
        fragments.add(new SkillsFragment());
        fragments.add(new ContactFragment());
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return fragments.get(0);
            case 1: return fragments.get(1);
            case 2: return fragments.get(2);
            case 3: return fragments.get(3);
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "About";
            case 1: return "Work";
            case 2: return "Skills";
            case 3: return "Contact";
        }
        return null;
    }
}
