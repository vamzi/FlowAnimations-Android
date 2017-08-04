package vamzi.flowanimationsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;


import org.w3c.dom.Text;

import vamzi.flowanimations.SlideInBottom;
import vamzi.flowanimations.SlideInLeft;
import vamzi.flowanimations.SlideInUp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.tv);
        TranslateAnimation anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, -75.0f);
        anim.setDuration(5000);
        anim.setFillAfter( true );
        tv.startAnimation(anim);

    }


}
