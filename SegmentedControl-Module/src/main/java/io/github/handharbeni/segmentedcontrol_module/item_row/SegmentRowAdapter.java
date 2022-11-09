package io.github.handharbeni.segmentedcontrol_module.item_row;

import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import io.github.handharbeni.seclayout_module.sectionlayout.SectionLayout;
import io.github.handharbeni.seclayout_module.sectionlayout.SectionLayout;
import io.github.handharbeni.seclayout_module.sectionlayout.distributive_section_layout.DistributiveSectionLayout;
import io.github.handharbeni.segmentedcontrol_module.item_row_column.SegmentData;
import io.github.handharbeni.segmentedcontrol_module.item_row_column.SegmentAdapter;
import io.github.handharbeni.segmentedcontrol_module.item_row_column.SegmentData;

/**
 * Created by Robert Apikyan on 9/7/2017.
 */

public class SegmentRowAdapter<D> extends SectionLayout.Adapter<Boolean, SegmentRowViewHolder<SegmentData<D>>> {

    private final SegmentAdapter segmentAdapter;

    public SegmentRowAdapter(SegmentAdapter segmentAdapter) {
        this.segmentAdapter = segmentAdapter;
    }

    @NonNull
    @Override
    protected SegmentRowViewHolder<SegmentData<D>> onCreateViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new SegmentRowViewHolder<>(new DistributiveSectionLayout<SegmentData<D>>(layoutInflater.getContext()), segmentAdapter);
    }
}
