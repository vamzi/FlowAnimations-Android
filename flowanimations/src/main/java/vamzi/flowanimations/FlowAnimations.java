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
    private long duration=1000;
    private  long delay;
    private  View view;
    private  TranslateAnimation anim;
    public  FlowAnimations(AnimationStyle animation_style){
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
            case SLIDE_IN_RIGHT:
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
        this.view=v;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }

    @Override
    public void setDuration(long duration) {
        anim.setDuration(duration);
    }

    public  void animate(){
        anim.setFillAfter(true);
        view.startAnimation(anim);

    }




}
