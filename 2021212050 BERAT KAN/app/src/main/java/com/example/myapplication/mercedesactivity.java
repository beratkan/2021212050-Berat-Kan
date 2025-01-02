package com.example.myapplication;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mercedesactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mercedesactivity);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
                String mercedes = "AMG C 63, Mercedes-AMG GT spor otomobiline benzer 4.0 litrelik çift turbolu V8 kullanır. Mercedes bunu iki çıkışla sunar: C 63 için 469 hp (350 kW) ve 650 N⋅m (479 lb⋅ft) tork ve daha güçlü C 63 S için 503 hp (375 kW) ve 700 N⋅m (516 lb⋅ft) tork.";

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        VideoView vw = findViewById(R.id.vw);
        MediaController mc=new MediaController(this);
        vw.setMediaController(mc);
        String path = "https://thumbsnap.com/i/JC21jXqs.mp4";
        Uri url = Uri.parse(path);
        vw.setVideoURI(url);
        vw.start();

    }
}