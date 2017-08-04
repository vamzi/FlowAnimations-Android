package vamzi.flowanimations;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;


public class SlideInUp extends Animation {
    View view;
    long duration;
    AnimationListener listner;

    public SlideInUp(View view,long duration){
        this.duration = duration;
        this.view = view;
    }

    public void animate(){
        TranslateAnimation anim = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 2.0f);
        anim.setDuration(1000);
        anim.setFillAfter( true );
        view.startAnimation(anim);
    }
}
