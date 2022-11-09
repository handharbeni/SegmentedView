package io.github.handharbeni.seclayout_module.sectionlayout;

import io.github.handharbeni.seclayout_module.sectionlayout.listeners.OnAddSectionListener;
import io.github.handharbeni.seclayout_module.sectionlayout.listeners.OnAddSectionListener;
import io.github.handharbeni.seclayout_module.sectionlayout.listeners.OnAddSectionRequestListener;
import io.github.handharbeni.seclayout_module.sectionlayout.listeners.OnAllSectionsRemoveRequestListener;
import io.github.handharbeni.seclayout_module.sectionlayout.listeners.OnAllSectionsRemovedListener;
import io.github.handharbeni.seclayout_module.sectionlayout.listeners.OnRemoveSectionListener;
import io.github.handharbeni.seclayout_module.sectionlayout.listeners.OnRemoveSectionRequestListener;

/**
 * Created by Robert Apikyan on 9/5/2017.
 */

class Notifier<D> implements OnAddSectionListener<D>, OnRemoveSectionListener, OnAddSectionRequestListener<D>, OnRemoveSectionRequestListener<D>, OnAllSectionsRemovedListener, OnAllSectionsRemoveRequestListener {

    private OnAddSectionListener<D> onAddSectionListener;
    private OnRemoveSectionListener onRemoveSectionListener;
    private OnAddSectionRequestListener<D> onAddSectionRequestListener;
    private OnRemoveSectionRequestListener<D> onRemoveSectionRequestListener;
    private OnAllSectionsRemovedListener onAllSectionsRemovedListener;
    private OnAllSectionsRemoveRequestListener onAllSectionsRemoveRequestListener;

    @Override
    public void onSectionAdded(D sectionData, int sectionPosition) {
        if (onAddSectionListener != null) {
            onAddSectionListener.onSectionAdded(sectionData, sectionPosition);
        }
    }

    @Override
    public void onSectionRemoved(int position) {
        if (onRemoveSectionListener != null) {
            onRemoveSectionListener.onSectionRemoved(position);
        }
    }

    @Override
    public boolean onAddSectionRequest(D sectionData, int sectionPosition) {
        return onAddSectionRequestListener == null || onAddSectionRequestListener.onAddSectionRequest(sectionData, sectionPosition);
    }

    @Override
    public boolean onRemoveSectionRequest(D sectionData) {
        return onRemoveSectionRequestListener == null || onRemoveSectionRequestListener.onRemoveSectionRequest(sectionData);
    }

    @Override
    public void onAllSectionsRemoved() {
        if (onAllSectionsRemovedListener != null) {
            onAllSectionsRemovedListener.onAllSectionsRemoved();
        }
    }

    @Override
    public boolean onAllSectionsRemoveRequest() {
        return onAllSectionsRemoveRequestListener == null || onAllSectionsRemoveRequestListener.onAllSectionsRemoveRequest();
    }

    // setters
    void setOnAddSectionListener(OnAddSectionListener<D> onAddSectionListener) {
        this.onAddSectionListener = onAddSectionListener;
    }

    void setOnRemoveSectionListener(OnRemoveSectionListener onRemoveSectionListener) {
        this.onRemoveSectionListener = onRemoveSectionListener;
    }

    void setOnAddSectionRequestListener(OnAddSectionRequestListener<D> onAddSectionRequestListener) {
        this.onAddSectionRequestListener = onAddSectionRequestListener;
    }

    void setOnRemoveSectionRequestListener(OnRemoveSectionRequestListener<D> onRemoveSectionRequestListener) {
        this.onRemoveSectionRequestListener = onRemoveSectionRequestListener;
    }

    void setOnAllSectionsRemovedListener(OnAllSectionsRemovedListener onAllSectionsRemovedListener) {
        this.onAllSectionsRemovedListener = onAllSectionsRemovedListener;
    }

    void setOnAllSectionsRemoveRequestListener(OnAllSectionsRemoveRequestListener onAllSectionsRemoveRequestListener) {
        this.onAllSectionsRemoveRequestListener = onAllSectionsRemoveRequestListener;
    }

    // getters
    OnAddSectionListener<D> getOnAddSectionListener() {
        return onAddSectionListener;
    }

    OnRemoveSectionListener getOnRemoveSectionListener() {
        return onRemoveSectionListener;
    }

    OnAddSectionRequestListener<D> getOnAddSectionRequestListener() {
        return onAddSectionRequestListener;
    }

    OnRemoveSectionRequestListener<D> getOnRemoveSectionRequestListener() {
        return onRemoveSectionRequestListener;
    }

    OnAllSectionsRemovedListener getOnAllSectionsRemovedListener() {
        return onAllSectionsRemovedListener;
    }

    OnAllSectionsRemoveRequestListener getOnAllSectionsRemoveRequestListener() {
        return onAllSectionsRemoveRequestListener;
    }
}
