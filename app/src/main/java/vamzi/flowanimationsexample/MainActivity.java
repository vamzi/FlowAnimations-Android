package vamzi.flowanimationsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;


import org.w3c.dom.Text;

import vamzi.flowanimations.SlideInBottom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.tv);
        SlideInBottom slide=new SlideInBottom(tv,1000);
        slide.animate();

    }


}
