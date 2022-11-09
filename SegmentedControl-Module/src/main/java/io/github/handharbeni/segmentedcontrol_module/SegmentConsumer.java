package io.github.handharbeni.segmentedcontrol_module;

import io.github.handharbeni.segmentedcontrol_module.item_row_column.SegmentViewHolder;

public interface SegmentConsumer<D> {
    void apply(SegmentViewHolder<D> segmentViewHolder);
}