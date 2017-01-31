package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.support.design.C0000R;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

abstract class FloatingActionButtonImpl {
    static final int[] EMPTY_STATE_SET;
    static final int[] FOCUSED_ENABLED_STATE_SET;
    static final int[] PRESSED_ENABLED_STATE_SET;
    static final int SHOW_HIDE_ANIM_DURATION = 200;
    private OnPreDrawListener mPreDrawListener;
    final ShadowViewDelegate mShadowViewDelegate;
    final View mView;

    /* renamed from: android.support.design.widget.FloatingActionButtonImpl.1 */
    class C00051 implements OnPreDrawListener {
        C00051() {
        }

        public boolean onPreDraw() {
            FloatingActionButtonImpl.this.onPreDraw();
            return true;
        }
    }

    interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    abstract void hide(@Nullable InternalVisibilityChangedListener internalVisibilityChangedListener);

    abstract void jumpDrawableToCurrentState();

    abstract void onDrawableStateChanged(int[] iArr);

    abstract void setBackgroundDrawable(ColorStateList colorStateList, Mode mode, int i, int i2);

    abstract void setBackgroundTintList(ColorStateList colorStateList);

    abstract void setBackgroundTintMode(Mode mode);

    abstract void setElevation(float f);

    abstract void setPressedTranslationZ(float f);

    abstract void setRippleColor(int i);

    abstract void show(@Nullable InternalVisibilityChangedListener internalVisibilityChangedListener);

    static {
        PRESSED_ENABLED_STATE_SET = new int[]{16842919, 16842910};
        FOCUSED_ENABLED_STATE_SET = new int[]{16842908, 16842910};
        EMPTY_STATE_SET = new int[0];
    }

    FloatingActionButtonImpl(View view, ShadowViewDelegate shadowViewDelegate) {
        this.mView = view;
        this.mShadowViewDelegate = shadowViewDelegate;
    }

    void onAttachedToWindow() {
        if (requirePreDrawListener()) {
            ensurePreDrawListener();
            this.mView.getViewTreeObserver().addOnPreDrawListener(this.mPreDrawListener);
        }
    }

    void onDetachedFromWindow() {
        if (this.mPreDrawListener != null) {
            this.mView.getViewTreeObserver().removeOnPreDrawListener(this.mPreDrawListener);
            this.mPreDrawListener = null;
        }
    }

    boolean requirePreDrawListener() {
        return false;
    }

    CircularBorderDrawable createBorderDrawable(int borderWidth, ColorStateList backgroundTint) {
        Resources resources = this.mView.getResources();
        CircularBorderDrawable borderDrawable = newCircularDrawable();
        borderDrawable.setGradientColors(resources.getColor(C0000R.color.design_fab_stroke_top_outer_color), resources.getColor(C0000R.color.design_fab_stroke_top_inner_color), resources.getColor(C0000R.color.design_fab_stroke_end_inner_color), resources.getColor(C0000R.color.design_fab_stroke_end_outer_color));
        borderDrawable.setBorderWidth((float) borderWidth);
        borderDrawable.setBorderTint(backgroundTint);
        return borderDrawable;
    }

    CircularBorderDrawable newCircularDrawable() {
        return new CircularBorderDrawable();
    }

    GradientDrawable createShapeDrawable() {
        GradientDrawable d = new GradientDrawable();
        d.setShape(1);
        d.setColor(-1);
        return d;
    }

    void onPreDraw() {
    }

    private void ensurePreDrawListener() {
        if (this.mPreDrawListener == null) {
            this.mPreDrawListener = new C00051();
        }
    }
}
