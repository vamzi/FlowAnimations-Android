package vamzi.flowanimationsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import vamzi.flowanimations.AnimationStyle;
import vamzi.flowanimations.FlowAnimations;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.tv);
        new FlowAnimations(AnimationStyle.SLIDE_IN_BOTTOM);
        TranslateAnimation anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 30.0f,
                Animation.RELATIVE_TO_SELF, 0.0f);
        anim.setDuration(3000);
        anim.setFillAfter( true );
        tv.startAnimation(anim);

    }


}
