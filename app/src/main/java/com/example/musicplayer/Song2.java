package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Song2 extends AppCompatActivity implements View.OnClickListener {

    Button play,pause,stop;
    MediaPlayer m1;
    int currentPositon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song1);

        play=findViewById(R.id.play);
        pause=findViewById(R.id.pause);
        stop=findViewById(R.id.stop);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.play:

                if(m1==null){
                    m1= MediaPlayer.create(getApplicationContext(),R.raw.jamila);
                    m1.start();
                }

                else if(!m1.isPlaying()){
                    m1.seekTo(currentPositon);
                    m1.start();
                }
                break;

            case R.id.pause:

                if(m1!=null){
                    m1.pause();

                    currentPositon=m1.getCurrentPosition();
                }

                break;

            case R.id.stop:

                if(m1!=null) {
                    m1.stop();
                    m1=null;
                }
                break;

        }

    }
}
