package com.anmolthedeveloper.anmolsingh.examtimer;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    MediaPlayer m1;
    TextView mnumber, done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = MediaPlayer.create(this, R.raw.sixth);
        mnumber = findViewById(R.id.mnumber);
        done = findViewById(R.id.done);

        new CountDownTimer(10000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                mnumber.setText("Time : "+String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                mnumber.setText("0");
                done.setText("Done !!");
                m1.start();
            }
        }.start();
    }
}
