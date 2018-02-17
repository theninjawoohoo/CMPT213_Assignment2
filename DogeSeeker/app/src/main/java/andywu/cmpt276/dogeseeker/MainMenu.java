package andywu.cmpt276.dogeseeker;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.easyandroidanimations.library.ExplodeAnimation;
import com.easyandroidanimations.library.ShakeAnimation;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Intent welcomeScreen = new Intent(MainMenu.this, WelcomeScreen.class);
        startActivity(welcomeScreen);
        Button playBtn = findViewById(R.id.playButton);
        Button optionBtn = findViewById(R.id.optionsButton);
        Button helpBtn = findViewById(R.id.helpButton);
        playTheGame(playBtn);

    }

    private void playTheGame(final Button playGameButton) {
        playGameButton.setOnClickListener(new View.OnClickListener() {
            //Button Animations that create a new scene
            //Credits to... https://github.com/2359media/EasyAndroidAnimations/blob/master/README.md
            @Override
            public void onClick(View view) {
                new ShakeAnimation(playGameButton)
                        .setShakeDistance(50)
                        .setNumOfShakes(2)
                        .setDuration(400)
                        .animate();
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent gameScreen = new Intent(MainMenu.this, dogeField.class);
                        startActivity(gameScreen);
                    }
                }, 1000);
            }
        });
    }

    private void modifyOptions(final Button optionsButton) {
        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ShakeAnimation(optionsButton).animate();
            }
        });
    }






}
