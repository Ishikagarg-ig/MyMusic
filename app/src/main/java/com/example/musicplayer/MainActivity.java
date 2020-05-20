package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.midi.MidiDeviceService;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


TextView music1,music2,music3,music4,music5,music6,music7,music8,music9,music10,music11,music12,music13,music14,music15,music16,music17,music18,
        music19,music20,music21,music22,music23;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       music1=findViewById(R.id.music1);
       music2=findViewById(R.id.music2);
       music3=findViewById(R.id.music3);
        music4=findViewById(R.id.music4);
        music5=findViewById(R.id.music5);
        music6=findViewById(R.id.music6);
        music7=findViewById(R.id.music7);
        music8=findViewById(R.id.music8);
        music9=findViewById(R.id.music9);
        music10=findViewById(R.id.music10);
        music11=findViewById(R.id.music11);
        music12=findViewById(R.id.music12);
        music13=findViewById(R.id.music13);
        music14=findViewById(R.id.music14);
        music15=findViewById(R.id.music15);
        music16=findViewById(R.id.music16);
        music17=findViewById(R.id.music17);
        music18=findViewById(R.id.music18);
        music19=findViewById(R.id.music19);
        music20=findViewById(R.id.music20);
        music21=findViewById(R.id.music21);
        music22=findViewById(R.id.music22);
        music23=findViewById(R.id.music23);




        music1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              startActivity(new Intent(MainActivity.this,Song1.class));
           }
       });
       music2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this,Song2.class));
           }
       });
     music3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             startActivity(new Intent(MainActivity.this,Song3.class));
         }
     });
        music4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song4.class));
            }
        });
        music5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song5.class));
            }
        });
        music6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song6.class));
            }
        });
        music7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song7.class));
            }
        });
        music8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song8.class));
            }
        });
        music9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song9.class));
            }
        });
        music10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song10.class));
            }
        });
        music11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song11.class));
            }
        });
        music12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song12.class));
            }
        });
        music13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song13.class));
            }
        });
        music14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song14.class));
            }
        });
        music15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song15.class));
            }
        });
        music16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song16.class));
            }
        });
        music17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song17.class));
            }
        });
        music18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song18.class));
            }
        });
        music19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song19.class));
            }
        });
        music20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song20.class));
            }
        });
        music21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song21.class));
            }
        });
        music22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song22.class));
            }
        });
        music23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Song23.class));
            }
        });

    }
}
