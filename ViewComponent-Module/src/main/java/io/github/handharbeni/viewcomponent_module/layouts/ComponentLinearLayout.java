package io.github.handharbeni.viewcomponent_module.layouts;

import static io.github.handharbeni.viewcomponent_module.ComponentDelegateImpl.create;

import android.content.Context;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import io.github.handharbeni.viewcomponent_module.ComponentDelegate;
import io.github.handharbeni.viewcomponent_module.ComponentDelegateImpl;
import io.github.handharbeni.viewcomponent_module.ControllerComponent;
import io.github.handharbeni.viewcomponent_module.ViewComponent;

public abstract class ComponentLinearLayout<VC extends ViewComponent, CC extends ControllerComponent<VC>> extends LinearLayout implements ComponentDelegate<VC, CC> {
    private final ComponentDelegateImpl<VC, CC> componentDelegate;

    public ComponentLinearLayout(@NonNull Context context) {
        super(context);
        componentDelegate = create(this, context);
    }

    public ComponentLinearLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        componentDelegate = create(this, context);
    }

    public ComponentLinearLayout(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
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
