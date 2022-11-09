package io.github.handharbeni.segmentedcontrol_module;

import androidx.annotation.NonNull;
import android.view.View;
import android.widget.LinearLayout;

import io.github.handharbeni.seclayout_module.sectionlayout.SectionLayout;
import io.github.handharbeni.viewcomponent_module.ViewComponent;

/**
 * Created by Robert Apikyan on 9/5/2017.
 */

class SegmentedControlViewComponent<D> extends ViewComponent {
    final SectionLayout<D> verticalSectionLayout;

    SegmentedControlViewComponent(@NonNull View rootView) {
        super(rootView);
        //noinspection unchecked
        verticalSectionLayout = (SectionLayout<D>) getRootViewGroup().getChildAt(0);
        verticalSectionLayout.setOrientation(LinearLayout.VERTICAL);
    }
}
