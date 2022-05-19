package com.thnhthao.bai3_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnFadeInXml, btnFadeInCode, btnFadeOutXml, btnFadeOutCode, btnBlinkXml,
            btnBlinkCode, btnZoomInXml, btnZoomInCode, btnZoomOutXml, btnZoomOutCode, btnRotateXml,
            btnRotateCode, btnMoveXml, btnMoveCode, btnSlideUpXml, btnSlideUpCode, btnBounceXml,
            btnBounceCode, btnCombineXml, btnCombineCode;
    private ImageView ivUitLogo;
    private Animation.AnimationListener animationListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewByIds();
        initVariables();


        // FADE IN XML
        final Animation animation_fade_in_xml = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_fade_in);
        animation_fade_in_xml.setAnimationListener(animationListener);
        btnFadeInXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation_fade_in_xml);
            }
        });

        // FADE OUT XML
        final Animation animation_fade_out_xml = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_fade_out);
        animation_fade_out_xml.setAnimationListener(animationListener);
        btnFadeOutXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation_fade_out_xml);
            }
        });

        //BLINK XML
        final Animation animation_bink_xml = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_blink);
        animation_bink_xml.setAnimationListener(animationListener);
        btnBlinkXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation_bink_xml);
            }
        });

        //ZOOM IN XML
        final Animation animation_zoom_in_xml = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_zoom_in);
        animation_zoom_in_xml.setAnimationListener(animationListener);
        btnZoomInXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation_zoom_in_xml);
            }
        });

        //ZOOM OUT XML
        final Animation animation_zoom_out_xml = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_zoom_out);
        animation_zoom_out_xml.setAnimationListener(animationListener);
        btnZoomOutXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation_zoom_out_xml);
            }
        });

        //ROTATE XML
        final Animation animation_rotate_xml = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rotate);
        animation_rotate_xml.setAnimationListener(animationListener);
        btnRotateXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation_rotate_xml);
            }
        });

        //MOVE XML
        final Animation animation_move_xml = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_move);
        animation_move_xml.setAnimationListener(animationListener);
        btnMoveXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation_move_xml);
            }
        });

        //SLIDE UP XML
        final Animation animation_slide_up_xml = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_slide_up);
        animation_slide_up_xml.setAnimationListener(animationListener);
        btnSlideUpXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation_slide_up_xml);
            }
        });

        //BOUNCE XML
        final Animation animation_bounce_xml = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_bounce);
        animation_bounce_xml.setAnimationListener(animationListener);
        btnBounceXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation_bounce_xml);
            }
        });

        //COMBINE XML
        final Animation animation_combine_xml = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_combine);
        animation_combine_xml.setAnimationListener(animationListener);
        btnCombineXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation_combine_xml);
            }
        });


        //ANIMATION FOR CODE
        handleClickAnimationCode(btnFadeInCode, initFadeInAnimation());
        handleClickAnimationCode(btnFadeOutCode, initFadeOutAnimation());
        handleClickAnimationCode(btnBlinkCode, initBlinkAnimation());

        ivUitLogo = findViewById(R.id.iv_uit_logo);
        ivUitLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manhinh2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(manhinh2);
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            }
        });
    }

    private void initVariables() {
        animationListener = new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(getApplicationContext(), "Animation Stopped",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        };

    }

    private void findViewByIds() {

        ivUitLogo = (ImageView) findViewById(R.id.iv_uit_logo);
        btnFadeInXml = (Button) findViewById(R.id.btn_fade_in_xml);
        btnFadeInCode = (Button) findViewById(R.id.btn_fade_in_code);
        btnFadeOutXml = (Button) findViewById(R.id.btn_fade_out_xml);
        btnFadeOutCode = (Button) findViewById(R.id.btn_fade_out_code);
        btnBlinkXml = (Button) findViewById(R.id.btn_blink_xml);
        btnBlinkCode = (Button) findViewById(R.id.btn_blink_code);
        btnZoomInXml = (Button) findViewById(R.id.btn_zoom_in_xml);
        btnZoomInCode = (Button) findViewById(R.id.btn_zoom_in_code);
        btnZoomOutXml = (Button) findViewById(R.id.btn_zoom_out_xml);
        btnZoomOutCode = (Button) findViewById(R.id.btn_zoom_out_code);
        btnRotateXml = (Button) findViewById(R.id.btn_rotate_xml);
        btnRotateCode = (Button) findViewById(R.id.btn_rotate_code);
        btnMoveXml = (Button) findViewById(R.id.btn_move_xml);
        btnMoveCode = (Button) findViewById(R.id.btn_move_code);
        btnSlideUpXml = (Button) findViewById(R.id.btn_slide_up_xml);
        btnSlideUpCode = (Button) findViewById(R.id.btn_slide_up_code);
        btnBounceXml = (Button) findViewById(R.id.btn_bounce_xml);
        btnBounceCode = (Button) findViewById(R.id.btn_bounce_code);
        btnCombineXml = (Button) findViewById(R.id.btn_combine_xml);
        btnCombineCode = (Button) findViewById(R.id.btn_combine_code);


    }

    private void handleClickAnimationCode(Button btn, final Animation animation) {

        // Handle onclickListenner to start animation
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivUitLogo.startAnimation(animation);
            }
        });
    }

    private Animation initFadeInAnimation() {
        AlphaAnimation animation_fade_in_code = new AlphaAnimation(0f, 1f);
        animation_fade_in_code.setDuration(3000);
        animation_fade_in_code.setFillAfter(true);
        animation_fade_in_code.setAnimationListener(animationListener);
        return animation_fade_in_code;
    }

    private Animation initFadeOutAnimation() {
        AlphaAnimation animation_fade_out_code = new AlphaAnimation(1.0f, 0.0f);
        animation_fade_out_code.setDuration(3000);
        animation_fade_out_code.setFillAfter(true);
        animation_fade_out_code.setAnimationListener(animationListener);
        return animation_fade_out_code;
    }

    private Animation initBlinkAnimation() {
        AlphaAnimation animation_blink_code = new AlphaAnimation(0f, 1f);
        animation_blink_code.setDuration(600);
        animation_blink_code.setRepeatMode(Animation.REVERSE);
        animation_blink_code.setRepeatCount(Animation.INFINITE);
        animation_blink_code.setAnimationListener(animationListener);
        return animation_blink_code;
    }
}