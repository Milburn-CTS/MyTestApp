package com.continentaltechsolutions.dell.mytestapp;

import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button);
        //btn.setOnClickListener(handleClick);
        Pattern.compile(Pattern.quote("Intrusion Detection"), Pattern.CASE_INSENSITIVE).matcher("Intrusion").find();
    }

    private void stopPlaying() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    private View.OnClickListener handleClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button:
                    try {
                        stopPlaying();
                        int resID=getResources().getIdentifier("intrusion_alert", "raw", getPackageName());
                        mediaPlayer=MediaPlayer.create(MainActivity.this,resID);
                        mediaPlayer.start();
                        //mediaPlayer.setLooping(true);

                    }
                    catch (Exception e)
                    {

                    }
                    break;

            }
        }
    };
}
