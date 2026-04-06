package com.example.ringtones;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShareActivity extends AppCompatActivity {

    Button back, face, wsp, twit, insta;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        back = (Button) findViewById(R.id.back);
        face = (Button) findViewById(R.id.face);
        wsp = (Button) findViewById(R.id.wsp);
        twit = (Button) findViewById(R.id.twit);
        insta = (Button) findViewById(R.id.insta);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ShareActivity.this, viewActivity.class);
                startActivity(i);
            }
        });

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage("com.facebook.katana");
                startActivity(Intent.createChooser(share, "compartir"));
            }
        });

        wsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(share, "compartir"));
            }
        });

        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage("com.twitter.android");
                startActivity(Intent.createChooser(share, "compartir"));
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage("com.instagram");
                startActivity(Intent.createChooser(share, "compartir"));
            }
        });
    }


}



