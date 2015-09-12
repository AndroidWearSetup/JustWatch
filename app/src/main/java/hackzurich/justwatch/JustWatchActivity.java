package hackzurich.justwatch;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.wearable.view.GridPagerAdapter;
import android.support.wearable.view.GridViewPager;
import android.support.wearable.view.WatchViewStub;

public class JustWatchActivity extends FragmentActivity {

    private GridViewPager gridViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                bindOnLayoutInflated(stub);
            }
        });
    }
    public void bindOnLayoutInflated(WatchViewStub stub) {
        gridViewPager = (GridViewPager) stub.findViewById(R.id.pager);
        gridViewPager.setAdapter(new MyGridPagerAdapter(getFragmentManager()));
    }
}
