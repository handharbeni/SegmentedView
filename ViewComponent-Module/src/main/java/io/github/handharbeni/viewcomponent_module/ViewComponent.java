package io.github.handharbeni.viewcomponent_module;

import android.content.Context;
import androidx.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

/**
 * This class holds the parents view instance
 * You can extend this class and use with butterKnife bindings
 */
public class ViewComponent {
    final View rootView;
    private ViewGroup rootViewGroup;

    public ViewComponent(@NonNull View rootView) {
        this.rootView = rootView;
        if (rootView instanceof ViewGroup) {
            rootViewGroup = (ViewGroup) rootView;
        }
    }

    protected Context getContext() {
        return rootView.getContext();
    }

    public View getRootView() {
        return rootView;
    }

    public ViewGroup getRootViewGroup() {
        return rootViewGroup;
    }
}
