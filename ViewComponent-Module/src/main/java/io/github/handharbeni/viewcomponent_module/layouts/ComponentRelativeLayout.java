package io.github.handharbeni.viewcomponent_module.layouts;

import static io.github.handharbeni.viewcomponent_module.ComponentDelegateImpl.create;

import android.content.Context;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import io.github.handharbeni.viewcomponent_module.ComponentDelegate;
import io.github.handharbeni.viewcomponent_module.ComponentDelegateImpl;
import io.github.handharbeni.viewcomponent_module.ControllerComponent;
import io.github.handharbeni.viewcomponent_module.ViewComponent;

public abstract class ComponentRelativeLayout<VC extends ViewComponent, CC extends ControllerComponent<VC>> extends RelativeLayout implements ComponentDelegate<VC, CC> {
    private final ComponentDelegateImpl<VC, CC> componentDelegate;

    public ComponentRelativeLayout(@NonNull Context context) {
        super(context);
        componentDelegate = create(this, context);
    }

    public ComponentRelativeLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        componentDelegate = create(this, context);
    }

    public ComponentRelativeLayout(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        componentDelegate = create(this, context);
    }

    @Override
    public VC getViewComponent() {
        return componentDelegate.getViewComponent();
    }

    @Override
    public CC getControllerComponent() {
        return componentDelegate.getControllerComponent();
    }

}
