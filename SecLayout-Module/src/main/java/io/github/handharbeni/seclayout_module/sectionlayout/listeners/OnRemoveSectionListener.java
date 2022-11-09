package io.github.handharbeni.seclayout_module.sectionlayout.listeners;

/**
 * Created by Robert Apikyan on 9/5/2017.
 */

public interface OnRemoveSectionListener {
    /**
     * Will be called when section is removed
     *
     * @param sectionPosition, the removed section position
     */
    void onSectionRemoved(int sectionPosition);
}
