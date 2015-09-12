package hackzurich.justwatch;

import android.support.wearable.view.WearableListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class MyAdapter extends WearableListView.Adapter {
    @Override
    public WearableListView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(WearableListView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class Holder extends WearableListView.ViewHolder {

        public Holder(View itemView) {
            super(itemView);
        }
    }
}
