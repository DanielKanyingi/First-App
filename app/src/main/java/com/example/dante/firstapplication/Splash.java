package com.example.dante.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;


public class Splash extends Activity {

    MediaPlayer ourSong;
    @Override
    protected void onCreate(@Nullable Bundle danteLoveCoding) {
        super.onCreate(danteLoveCoding);
        //setting up the content view
        setContentView(R.layout.splash);
        ourSong = MediaPlayer.create(Splash.this, R.raw.njooni);
        ourSong.start();
        //setting up a thread
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(12000);

                }catch (InterruptedException e){
                    e.printStackTrace();

                } finally {
                    Intent openMainActivity = new Intent("com.example.dante.firstapplication.MENU");
                    startActivity(openMainActivity);


                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }
}
