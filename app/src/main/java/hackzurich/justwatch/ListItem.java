package hackzurich.justwatch;

import android.content.Context;
import android.support.wearable.view.WearableListView;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class ListItem extends FrameLayout implements WearableListView.OnCenterProximityListener {
    public ListItem(Context context) {
        super(context);
    }

    public ListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ListItem(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void onCenterPosition(boolean b) {

    }

    @Override
    public void onNonCenterPosition(boolean b) {

    }
}
