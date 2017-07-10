package com.continentaltechsolutions.dell.mytestapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicActivity extends AppCompatActivity {

    MediaPlayer mpButtonClick1;
    MediaPlayer mpButtonClick2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        mpButtonClick1 = MediaPlayer.create(this, R.raw.intrusion_alert);
        //mpButtonClick2 = MediaPlayer.create(this, R.raw.intrusion_alert);

        Button dugme = (Button) findViewById(R.id.button2);
        dugme.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mpButtonClick1.isPlaying()) {
                    mpButtonClick1.stop();
                }
                else {
                    mpButtonClick1.start();
                }
            }

        });
    }
}
