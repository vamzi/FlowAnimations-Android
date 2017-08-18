package vamzi.flowanimationsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

import vamzi.flowanimations.AnimationStyle;
import vamzi.flowanimations.FlowAnimations;
import vamzi.googlefontslibrary.FontStyle;
import vamzi.googlefontslibrary.GoogleFontsLibrary;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        long duration=2500;
        setContentView(R.layout.activity_main);
        Button b1,b2,b3;
        b1=(Button)findViewById(R.id.fb_button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        TextView tv=(TextView)findViewById(R.id.tv);
        tv.setTypeface(GoogleFontsLibrary.PermanentMarker(this, FontStyle.REGULAR));
        FlowAnimations fn2,fn3,fn4;
        fn2=new FlowAnimations(AnimationStyle.SLIDE_IN_BOTTOM);
        fn3=new FlowAnimations(AnimationStyle.SLIDE_IN_BOTTOM);
        fn4=new FlowAnimations(AnimationStyle.SLIDE_IN_BOTTOM);
        fn2.playOn(b1);
        fn3.playOn(b2);
        fn4.playOn(b3);
        FlowAnimations  fn1=new FlowAnimations(AnimationStyle.SLIDE_IN_UP);
        fn1.setDuration(duration);
        fn2.setDuration(duration);
        fn3.setDuration(duration);
        fn4.setDuration(duration);
        fn1.playOn(tv);
        fn1.animate();
        fn2.animate();
        fn3.animate();
        fn4.animate();

    }


}
