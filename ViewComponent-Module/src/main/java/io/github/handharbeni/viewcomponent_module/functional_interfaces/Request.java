package io.github.handharbeni.viewcomponent_module.functional_interfaces;

import androidx.annotation.NonNull;

import io.github.handharbeni.viewcomponent_module.ViewComponent;

/**
 * Created by Robert Apikyan on 8/18/2017.
 */

public interface Request<VC extends ViewComponent> {
    void onResult(@NonNull VC viewComponent);
}
