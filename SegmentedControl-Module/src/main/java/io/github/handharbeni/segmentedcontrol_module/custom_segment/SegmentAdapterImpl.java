package io.github.handharbeni.segmentedcontrol_module.custom_segment;

import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import io.github.handharbeni.segmentedcontrol_module.R;
import io.github.handharbeni.segmentedcontrol_module.item_row_column.SegmentAdapter;


/**
 * Created by Robert Apikyan on 9/8/2017.
 */

public class SegmentAdapterImpl extends SegmentAdapter<CharSequence, SegmentViewHolderImpl> {

    @NonNull
    @Override
    protected SegmentViewHolderImpl onCreateViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new SegmentViewHolderImpl(layoutInflater.inflate(R.layout.item_segment_impl, null));
    }
}
