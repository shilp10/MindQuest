package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.Nullable;
import android.support.design.C0000R;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

class FloatingActionButtonEclairMr1 extends FloatingActionButtonImpl {
    private int mAnimationDuration;
    CircularBorderDrawable mBorderDrawable;
    private float mElevation;
    private boolean mIsHiding;
    private float mPressedTranslationZ;
    Drawable mRippleDrawable;
    ShadowDrawableWrapper mShadowDrawable;
    Drawable mShapeDrawable;
    private StateListAnimator mStateListAnimator;

    private abstract class BaseShadowAnimation extends Animation {
        private float mShadowSizeDiff;
        private float mShadowSizeStart;

        protected abstract float getTargetShadowSize();

        private BaseShadowAnimation() {
        }

        public void reset() {
            super.reset();
            this.mShadowSizeStart = FloatingActionButtonEclairMr1.this.mShadowDrawable.getShadowSize();
            this.mShadowSizeDiff = getTargetShadowSize() - this.mShadowSizeStart;
        }

        protected void applyTransformation(float interpolatedTime, Transformation t) {
            FloatingActionButtonEclairMr1.this.mShadowDrawable.setShadowSize(this.mShadowSizeStart + (this.mShadowSizeDiff * interpolatedTime));
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButtonEclairMr1.1 */
    class C02441 extends AnimationListenerAdapter {
        final /* synthetic */ InternalVisibilityChangedListener val$listener;

        C02441(InternalVisibilityChangedListener internalVisibilityChangedListener) {
            this.val$listener = internalVisibilityChangedListener;
        }

        public void onAnimationStart(Animation animation) {
            FloatingActionButtonEclairMr1.this.mIsHiding = true;
        }

        public void onAnimationEnd(Animation animation) {
            FloatingActionButtonEclairMr1.this.mIsHiding = false;
            FloatingActionButtonEclairMr1.this.mView.setVisibility(8);
            if (this.val$listener != null) {
                this.val$listener.onHidden();
            }
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButtonEclairMr1.2 */
    class C02452 extends AnimationListenerAdapter {
        final /* synthetic */ InternalVisibilityChangedListener val$listener;

        C02452(InternalVisibilityChangedListener internalVisibilityChangedListener) {
            this.val$listener = internalVisibilityChangedListener;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.val$listener != null) {
                this.val$listener.onShown();
            }
        }
    }

    private class ElevateToTranslationZAnimation extends BaseShadowAnimation {
        private ElevateToTranslationZAnimation() {
            super(null);
        }

        protected float getTargetShadowSize() {
            return FloatingActionButtonEclairMr1.this.mElevation + FloatingActionButtonEclairMr1.this.mPressedTranslationZ;
        }
    }

    private class ResetElevationAnimation extends BaseShadowAnimation {
        private ResetElevationAnimation() {
            super(null);
        }

        protected float getTargetShadowSize() {
            return FloatingActionButtonEclairMr1.this.mElevation;
        }
    }

    FloatingActionButtonEclairMr1(View view, ShadowViewDelegate shadowViewDelegate) {
        super(view, shadowViewDelegate);
        this.mAnimationDuration = view.getResources().getInteger(17694720);
        this.mStateListAnimator = new StateListAnimator();
        this.mStateListAnimator.setTarget(view);
        this.mStateListAnimator.addState(PRESSED_ENABLED_STATE_SET, setupAnimation(new ElevateToTranslationZAnimation()));
        this.mStateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, setupAnimation(new ElevateToTranslationZAnimation()));
        this.mStateListAnimator.addState(EMPTY_STATE_SET, setupAnimation(new ResetElevationAnimation()));
    }

    void setBackgroundDrawable(ColorStateList backgroundTint, Mode backgroundTintMode, int rippleColor, int borderWidth) {
        Drawable[] layers;
        this.mShapeDrawable = DrawableCompat.wrap(createShapeDrawable());
        DrawableCompat.setTintList(this.mShapeDrawable, backgroundTint);
        if (backgroundTintMode != null) {
            DrawableCompat.setTintMode(this.mShapeDrawable, backgroundTintMode);
        }
        this.mRippleDrawable = DrawableCompat.wrap(createShapeDrawable());
        DrawableCompat.setTintList(this.mRippleDrawable, createColorStateList(rippleColor));
        DrawableCompat.setTintMode(this.mRippleDrawable, Mode.MULTIPLY);
        if (borderWidth > 0) {
            this.mBorderDrawable = createBorderDrawable(borderWidth, backgroundTint);
            layers = new Drawable[]{this.mBorderDrawable, this.mShapeDrawable, this.mRippleDrawable};
        } else {
            this.mBorderDrawable = null;
            layers = new Drawable[]{this.mShapeDrawable, this.mRippleDrawable};
        }
        this.mShadowDrawable = new ShadowDrawableWrapper(this.mView.getResources(), new LayerDrawable(layers), this.mShadowViewDelegate.getRadius(), this.mElevation, this.mElevation + this.mPressedTranslationZ);
        this.mShadowDrawable.setAddPaddingForCorners(false);
        this.mShadowViewDelegate.setBackgroundDrawable(this.mShadowDrawable);
        updatePadding();
    }

    void setBackgroundTintList(ColorStateList tint) {
        DrawableCompat.setTintList(this.mShapeDrawable, tint);
        if (this.mBorderDrawable != null) {
            this.mBorderDrawable.setBorderTint(tint);
        }
    }

    void setBackgroundTintMode(Mode tintMode) {
        DrawableCompat.setTintMode(this.mShapeDrawable, tintMode);
    }

    void setRippleColor(int rippleColor) {
        DrawableCompat.setTintList(this.mRippleDrawable, createColorStateList(rippleColor));
    }

    void setElevation(float elevation) {
        if (this.mElevation != elevation && this.mShadowDrawable != null) {
            this.mShadowDrawable.setShadowSize(elevation, this.mPressedTranslationZ + elevation);
            this.mElevation = elevation;
            updatePadding();
        }
    }

    void setPressedTranslationZ(float translationZ) {
        if (this.mPressedTranslationZ != translationZ && this.mShadowDrawable != null) {
            this.mPressedTranslationZ = translationZ;
            this.mShadowDrawable.setMaxShadowSize(this.mElevation + translationZ);
            updatePadding();
        }
    }

    void onDrawableStateChanged(int[] state) {
        this.mStateListAnimator.setState(state);
    }

    void jumpDrawableToCurrentState() {
        this.mStateListAnimator.jumpToCurrentState();
    }

    void hide(@Nullable InternalVisibilityChangedListener listener) {
        if (!this.mIsHiding && this.mView.getVisibility() == 0) {
            Animation anim = AnimationUtils.loadAnimation(this.mView.getContext(), C0000R.anim.design_fab_out);
            anim.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            anim.setDuration(200);
            anim.setAnimationListener(new C02441(listener));
            this.mView.startAnimation(anim);
        } else if (listener != null) {
            listener.onHidden();
        }
    }

    void show(@Nullable InternalVisibilityChangedListener listener) {
        if (this.mView.getVisibility() != 0 || this.mIsHiding) {
            this.mView.clearAnimation();
            this.mView.setVisibility(0);
            Animation anim = AnimationUtils.loadAnimation(this.mView.getContext(), C0000R.anim.design_fab_in);
            anim.setDuration(200);
            anim.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            anim.setAnimationListener(new C02452(listener));
            this.mView.startAnimation(anim);
        } else if (listener != null) {
            listener.onShown();
        }
    }

    private void updatePadding() {
        Rect rect = new Rect();
        this.mShadowDrawable.getPadding(rect);
        this.mShadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    private Animation setupAnimation(Animation animation) {
        animation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        animation.setDuration((long) this.mAnimationDuration);
        return animation;
    }

    private static ColorStateList createColorStateList(int selectedColor) {
        states = new int[3][];
        int[] colors = new int[3];
        states[0] = FOCUSED_ENABLED_STATE_SET;
        colors[0] = selectedColor;
        int i = 0 + 1;
        states[i] = PRESSED_ENABLED_STATE_SET;
        colors[i] = selectedColor;
        i++;
        states[i] = new int[0];
        colors[i] = 0;
        i++;
        return new ColorStateList(states, colors);
    }
}
