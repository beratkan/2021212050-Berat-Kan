package com.example.myapplication;

import static com.example.myapplication.R.id.*;
import static com.example.myapplication.R.id.btn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView img1=findViewById(R.id.img1);
        Button btn;
        btn = findViewById(R.id.btn);
        Animation anim1 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animasyon);
        img1.startAnimation(anim1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent git = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(git);
            }
        });




    }
}