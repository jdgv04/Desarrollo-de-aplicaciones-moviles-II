package com.example.ringtones;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class viewActivity extends AppCompatActivity {

    Button play1, play2, play3, play4, play5, compartir1, compartir2, compartir3, compartir4, compartir5, blue1, blue2, blue3, blue4, blue5;
    MediaPlayer mp1, mp2, mp3, mp4, mp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        setContentView(R.layout.activity_view);
        play1 = (Button)findViewById(R.id.play1);
        play2 = (Button)findViewById(R.id.play2);
        play3 = (Button)findViewById(R.id.play3);
        play4 = (Button)findViewById(R.id.play4);
        play5 = (Button)findViewById(R.id.play5);
        compartir1 = (Button)findViewById(R.id.compartir1);
        compartir2 = (Button)findViewById(R.id.compartir2);
        compartir3 = (Button)findViewById(R.id.compartir3);
        compartir4 = (Button)findViewById(R.id.compartir4);
        compartir5 = (Button)findViewById(R.id.compartir5);
        blue1 = (Button)findViewById(R.id.blue1);
        blue2 = (Button)findViewById(R.id.blue2);
        blue3 = (Button)findViewById(R.id.blue3);
        blue4 = (Button)findViewById(R.id.blue4);
        blue5 = (Button)findViewById(R.id.blue5);
        mp1 = MediaPlayer.create(this, R.raw.aves_24);
        mp2 = MediaPlayer.create(this, R.raw.campana_whatsapp);
        mp3 = MediaPlayer.create(this, R.raw.iphone_notificacion);
        mp4 = MediaPlayer.create(this, R.raw.mario_bros_vida);
        mp5 = MediaPlayer.create(this, R.raw.mario_coin);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp1.isPlaying()){
                    mp1.pause();
                    Toast.makeText(viewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp1.start();
                    Toast.makeText(viewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp2.isPlaying()){
                    mp2.pause();
                    Toast.makeText(viewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp2.start();
                    Toast.makeText(viewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp3.isPlaying()){
                    mp3.pause();
                    Toast.makeText(viewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp3.start();
                    Toast.makeText(viewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp4.isPlaying()){
                    mp4.pause();
                    Toast.makeText(viewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp4.start();
                    Toast.makeText(viewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });
        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp5.isPlaying()){
                    mp5.pause();
                    Toast.makeText(viewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp5.start();
                    Toast.makeText(viewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}















