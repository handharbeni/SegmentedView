package io.github.handharbeni.segmentedcontrol_module;

import io.github.handharbeni.segmentedcontrol_module.item_row_column.SegmentDecoration;

/**
 * Created by Robert Apikyan on 9/7/2017.
 */

class Configs {
    static final int DEFAULT_COLUMN_COUNT = 2;
    static final int DEFAULT_SUPPORTED_SELECTIONS_COUNT = 1;

    boolean willDistributeEvenly;
    boolean reselectionEnabled;

    int columnCount;
    int supportedSelectionsCount;

    SegmentDecoration segmentDecoration = new SegmentDecoration();

    static Configs getDefault() {
        Configs configs = new Configs();
        configs.reselectionEnabled = true;
        configs.willDistributeEvenly = false;
        configs.columnCount = DEFAULT_COLUMN_COUNT;
        configs.supportedSelectionsCount = DEFAULT_SUPPORTED_SELECTIONS_COUNT;
        return configs;
    }
}
