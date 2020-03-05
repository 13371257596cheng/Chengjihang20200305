package com.bawei.chengjihang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.iv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                AlphaAnimation alphaAnimation=new AlphaAnimation();
                TranslateAnimation translateAnimation=new TranslateAnimation(1000,2000,1000,2000);
                translateAnimation.setFillAfter(true);
                translateAnimation.setDuration(5000);
                translateAnimation.start();



            }
        });

    }
}
