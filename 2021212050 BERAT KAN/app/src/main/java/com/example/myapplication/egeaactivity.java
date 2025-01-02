package com.example.myapplication;

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

public class egeaactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_egeaactivity);
        VideoView vw=findViewById(R.id.videoView3);
        String path = "https://thumbsnap.com/i/NtxzLDbk.mp4";
        Uri url = Uri.parse(path);
        vw.setVideoURI(url);
        vw.start();
        MediaController mc = new MediaController(this);
        vw.setMediaController(mc);
        TextView txt=findViewById(R.id.textView3);
        String egea = "FIAT Egea (Type 356), 2015 yılının Mayıs ayında İtalyan otomobil üreticisi FIAT tarafından 2015 İstanbul Motor Show'da tanıtılan ve Ekim 2015'te Türkiye'de satışa sunulan, C segmenti bir aile otomobilidir.[1] Ardından 2016 yılında, Avrupa'da Cenevre Otomobil Fuarı'nda,[2] Türkiye'de ise Samsun Otoshow Fuarı'nda Hatchback ve Station Wagon modelleri[3] tanıtılmıştır. Sonradan Cross modeli eklenmiştir.";
        txt.setText(egea);

    }
}