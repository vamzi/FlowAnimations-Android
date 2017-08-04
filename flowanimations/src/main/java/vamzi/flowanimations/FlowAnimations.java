package vamzi.flowanimations;

import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/**
 * Created by kotha on 8/4/2017.
 */

public class FlowAnimations extends Animation {
    private AnimationStyle style;
    private long duration;
    private static long delay;
    private static View view;
    private static TranslateAnimation anim;
    public FlowAnimations(AnimationStyle animation_style){
        style=animation_style;
        duration=1000;
        delay=0;
        switch (style){
            case SLIDE_IN_BOTTOM:
                anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 30.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f);
                break;
            case SLIDE_IN_UP:
                anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, -30.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f);
                break;
            case SLIDE_IN__RIGHT:
                anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 30.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f);
                break;
            case SLIDE_IN_LEFT:
                anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, -30.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f);
                break;
            case SLIDE_OUT_BOTTOM:
                anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 30.0f);
                break;
            case SLIDE_OUT_UP:
                anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, -30.0f);
                break;
            case SLIDE_OUT_RIGHT:
                anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 30.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f);
                break;
            case SLIDE_OUT_LEFT:
                anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, -30.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f);
                break;
            default:
                break;
        }
    }

    public void playOn(View v){
        view=v;
    }

    public static void setDelay(long delay) {
        FlowAnimations.delay = delay;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public static void animate(){
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
               view.startAnimation(anim);
            }
        },delay);
    }




}
