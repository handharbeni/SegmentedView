package io.github.handharbeni.viewcomponent_module;

import androidx.annotation.NonNull;
import android.view.View;

/**
 * This interface is used in order to bind ControllerComponent in to Custom View's lifecycle
 *
 * @param <VC> ViewComponent type
 */
interface ControllerLifeCycle<VC extends ViewComponent> {
    /**
     * We call this inside {@link ComponentDelegateImpl} class's constructor method, after Components instantiation
     *
     * @param viewComponent non null viewComponent
     */
    void onCreate(@NonNull VC viewComponent);
}
