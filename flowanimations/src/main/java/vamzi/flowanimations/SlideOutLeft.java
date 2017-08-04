package vamzi.flowanimations;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/**
 * Created by kotha on 8/4/2017.
 */

public class SlideOutLeft extends Animation {
    View view;
    long duration;
    AnimationListener listner;

    public SlideOutLeft(View view,long duration){
        this.duration = duration;
        this.view = view;
    }

    public void animate(){
        TranslateAnimation anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, -30.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f);
        anim.setDuration(duration);
        anim.setFillAfter( true );
        view.startAnimation(anim);}
}
