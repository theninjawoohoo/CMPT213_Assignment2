package andywu.cmpt276.dogeseeker;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.easyandroidanimations.library.ExplodeAnimation;

public class WelcomeScreen extends AppCompatActivity {
    public static int SPLASH_SCREEN_TIMER = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },SPLASH_SCREEN_TIMER);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        final Button skip = findViewById(R.id.skipButton);

        //Skip button
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ExplodeAnimation(skip)
                        .setDuration(1000)
                        .animate();
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        finish();
                    }
                }, 1500);
            }
        });
    }





}
