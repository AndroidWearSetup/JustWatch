package hackzurich.justwatch;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.wearable.view.CardFragment;
import android.support.wearable.view.FragmentGridPagerAdapter;

public final class MyGridPagerAdapter extends FragmentGridPagerAdapter {
    public MyGridPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getFragment(int i, int i1) {
        if (i1 == 1)
            return WearListFragment.newInstance();
        return CardFragment.create("aaaa" + i, "bbbbb" + i1);
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount(int i) {
        return 3;
    }
}
