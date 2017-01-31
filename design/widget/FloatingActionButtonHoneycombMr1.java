package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.View;

class FloatingActionButtonHoneycombMr1 extends FloatingActionButtonEclairMr1 {
    private boolean mIsHiding;

    /* renamed from: android.support.design.widget.FloatingActionButtonHoneycombMr1.1 */
    class C00031 extends AnimatorListenerAdapter {
        final /* synthetic */ InternalVisibilityChangedListener val$listener;

        C00031(InternalVisibilityChangedListener internalVisibilityChangedListener) {
            this.val$listener = internalVisibilityChangedListener;
        }

        public void onAnimationStart(Animator animation) {
            FloatingActionButtonHoneycombMr1.this.mIsHiding = true;
            FloatingActionButtonHoneycombMr1.this.mView.setVisibility(0);
        }

        public void onAnimationCancel(Animator animation) {
            FloatingActionButtonHoneycombMr1.this.mIsHiding = false;
        }

        public void onAnimationEnd(Animator animation) {
            FloatingActionButtonHoneycombMr1.this.mIsHiding = false;
            FloatingActionButtonHoneycombMr1.this.mView.setVisibility(8);
            if (this.val$listener != null) {
                this.val$listener.onHidden();
            }
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButtonHoneycombMr1.2 */
    class C00042 extends AnimatorListenerAdapter {
        final /* synthetic */ InternalVisibilityChangedListener val$listener;

        C00042(InternalVisibilityChangedListener internalVisibilityChangedListener) {
            this.val$listener = internalVisibilityChangedListener;
        }

        public void onAnimationStart(Animator animation) {
            FloatingActionButtonHoneycombMr1.this.mView.setVisibility(0);
        }

        public void onAnimationEnd(Animator animation) {
            if (this.val$listener != null) {
                this.val$listener.onShown();
            }
        }
    }

    FloatingActionButtonHoneycombMr1(View view, ShadowViewDelegate shadowViewDelegate) {
        super(view, shadowViewDelegate);
    }

    boolean requirePreDrawListener() {
        return true;
    }

    void onPreDraw() {
        updateFromViewRotation(this.mView.getRotation());
    }

    void hide(@Nullable InternalVisibilityChangedListener listener) {
        if (this.mIsHiding || this.mView.getVisibility() != 0) {
            if (listener != null) {
                listener.onHidden();
            }
        } else if (!ViewCompat.isLaidOut(this.mView) || this.mView.isInEditMode()) {
            this.mView.setVisibility(8);
            if (listener != null) {
                listener.onHidden();
            }
        } else {
            this.mView.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(new C00031(listener));
        }
    }

    void show(@Nullable InternalVisibilityChangedListener listener) {
        if (this.mView.getVisibility() == 0) {
            return;
        }
        if (!ViewCompat.isLaidOut(this.mView) || this.mView.isInEditMode()) {
            this.mView.setVisibility(0);
            this.mView.setAlpha(1.0f);
            this.mView.setScaleY(1.0f);
            this.mView.setScaleX(1.0f);
            if (listener != null) {
                listener.onShown();
                return;
            }
            return;
        }
        this.mView.setAlpha(0.0f);
        this.mView.setScaleY(0.0f);
        this.mView.setScaleX(0.0f);
        this.mView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(new C00042(listener));
    }

    private void updateFromViewRotation(float rotation) {
        if (this.mShadowDrawable != null) {
            this.mShadowDrawable.setRotation(-rotation);
        }
        if (this.mBorderDrawable != null) {
            this.mBorderDrawable.setRotation(-rotation);
        }
    }
}
