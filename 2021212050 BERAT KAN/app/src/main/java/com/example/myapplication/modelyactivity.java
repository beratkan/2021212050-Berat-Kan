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

public class modelyactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_modelyactivity);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        VideoView vw=findViewById(R.id.videoView2);
        MediaController mc=new MediaController(this);
        String tesla = "Tesla Model Y, Tesla, Inc. tarafından 2020 yılından beri üretilen, pil ile çalışan kompakt crossover SUV'dir.[5] Araç, Roadster, Model S, Model X ve Model 3'ten sonra şirketin kuruluşundan bu yana beşinci üretim modeli olarak Mart 2019'da tanıtıldı.";
String path="https://thumbsnap.com/i/bmSGxy6o.mp4";
@SuppressLint({"MissingInflatedId", "LocalSuppress"})
TextView txt=findViewById(R.id.textView2);
txt.setText(tesla);
Uri url= Uri.parse(path);
vw.setMediaController(mc);
vw.setVideoURI(url);
vw.start();
    }
}