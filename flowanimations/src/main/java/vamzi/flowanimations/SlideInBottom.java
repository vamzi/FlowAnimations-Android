package vamzi.flowanimations;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/**
 * Created by kotha on 8/4/2017.
 */

public class SlideInBottom extends Animation {
    View view;
    long duration;
    AnimationListener listner;

    public SlideInBottom(View view,long duration){
        this.duration = duration;
        this.view = view;
    }

    public void animate(){
            TranslateAnimation anim = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 2.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f);
            anim.setDuration(1000);
            anim.setFillAfter( true );
            view.startAnimation(anim);
    }



}
