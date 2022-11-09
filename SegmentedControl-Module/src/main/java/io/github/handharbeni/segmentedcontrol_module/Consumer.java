package io.github.handharbeni.segmentedcontrol_module;

/**
 * Created by Robert Apikyan on 9/8/2017.
 */

interface Consumer<T> {
    void apply(T t);
}
