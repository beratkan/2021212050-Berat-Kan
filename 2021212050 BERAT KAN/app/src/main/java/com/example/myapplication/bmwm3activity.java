package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
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

public class bmwm3activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmwm3activity);
        String bmw = "BMW M3, BMW M tarafından 1985 yılından bu yana üretilen ve BMW 3 Serisi'nin yüksek performanslı modelidir.";
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        VideoView vw = findViewById(R.id.vw);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView txt= findViewById(R.id.textView);
        String bilgi = "BMW M3, BMW M tarafından 1985 yılından bu yana üretilen ve BMW 3 Serisi'nin yüksek performanslı modelidir.\n" +
                "\n" +
                "M3 modelleri, 3-Serisi'nin E30, E36, E46, E90 / E92 / E93 ve F80 nesilleri boyunca ve coupe, sedan ve cabriolet gövde stilleri ile üretilmiştir. M3, 3-Serisi'nin daha güçlü ve duyarlı motorlar, gelişmiş yol tutuş, süspansiyon ve fren sistemleri, aerodinamik gövde geliştirmeleri ve üç renkli \"M\" (Motorsport) amblemli iç ve dış tasarım ile donatılmış modelidir.";
        txt.setText(bilgi);
        MediaController mc = new MediaController(this);
        vw.setMediaController(mc);
String   path = "https://thumbsnap.com/i/Gp8V4pSJ.mp4";
Uri adres=Uri.parse(path);
vw.setVideoURI(adres);
vw.start();
        //  Intent git = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=KeXqm5tbLAk"));
       // startActivity(git);



    }
}