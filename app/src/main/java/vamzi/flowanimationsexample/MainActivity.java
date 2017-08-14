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
        FlowAnimations  fn=new FlowAnimations(AnimationStyle.SLIDE_IN_UP);
        fn.setDuration(5000);
        fn.playOn(tv);
        fn.animate();

    }


}
