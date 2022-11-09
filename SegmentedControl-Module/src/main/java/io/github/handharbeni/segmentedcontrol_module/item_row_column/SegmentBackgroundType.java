package io.github.handharbeni.segmentedcontrol_module.item_row_column;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Robert Apikyan on 9/12/2017.
 */
@IntDef(value = {SegmentBackgroundType.SINGLE_BG,
        SegmentBackgroundType.TOP_SINGLE_BG,
        SegmentBackgroundType.TOP_LEFT_BG,
        SegmentBackgroundType.TOP_LEFT_SINGLE_BG,
        SegmentBackgroundType.TOP_RIGHT_SINGLE_BG,
        SegmentBackgroundType.TOP_RIGHT_BG,
        SegmentBackgroundType.MIDDLE_BG,
        SegmentBackgroundType.BOTTOM_SINGLE_BG,
        SegmentBackgroundType.BOTTOM_LEFT_BG,
        SegmentBackgroundType.BOTTOM_RIGHT_BG})
@Retention(RetentionPolicy.SOURCE)
public @interface SegmentBackgroundType {
    int SINGLE_BG = 0;
    int TOP_SINGLE_BG = 1;
    int TOP_LEFT_BG = 2;
    int TOP_LEFT_SINGLE_BG = 3;
    int TOP_RIGHT_SINGLE_BG = 4;
    int TOP_RIGHT_BG = 5;
    int MIDDLE_BG = 6;
    int BOTTOM_SINGLE_BG = 7;
    int BOTTOM_LEFT_BG = 8;
    int BOTTOM_RIGHT_BG = 9;
}
