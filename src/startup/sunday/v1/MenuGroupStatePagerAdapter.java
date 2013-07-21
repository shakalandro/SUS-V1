package startup.sunday.v1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentManager;
import android.util.Log;

public class MenuGroupStatePagerAdapter extends FragmentStatePagerAdapter {

	public MenuGroupStatePagerAdapter(FragmentManager fragmentManager) {
		super(fragmentManager);
	}

	@Override
	public Fragment getItem(int i) {
		Fragment fragment = new MenuGroupFragment();
        Bundle args = new Bundle();
        args.putInt(MenuGroupFragment.ARG_PAGE_NUM, i + 1);
        fragment.setArguments(args);
        return fragment;
	}

	@Override
	public int getCount() {
		return 100;
	}

	@Override
    public CharSequence getPageTitle(int position) {
        return "Menu Part " + (position + 1);
    }
}
