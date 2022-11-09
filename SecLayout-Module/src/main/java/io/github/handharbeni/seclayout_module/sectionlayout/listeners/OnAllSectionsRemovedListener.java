package io.github.handharbeni.seclayout_module.sectionlayout.listeners;


import io.github.handharbeni.seclayout_module.sectionlayout.SectionManager;

/**
 * Only for {@link SectionManager#removeAllSections()} method
 */
public interface OnAllSectionsRemovedListener {
    /**
     * Will be called after all sections removed
     */
    void onAllSectionsRemoved();
}
