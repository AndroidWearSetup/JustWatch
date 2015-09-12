package hackzurich.justwatch;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.wearable.view.WearableListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class WearListFragment extends Fragment {
    public static Fragment newInstance() {
        return new WearListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        WearableListView wearableList =(WearableListView) getView().findViewById(R.id.wearable_list);
        wearableList.setAdapter(new MyAdapter());
    }
}
