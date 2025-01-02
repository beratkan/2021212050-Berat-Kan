package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class butondetay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_butondetay);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
                String bmw = "BMW M3, BMW M tarafından 1985 yılından bu yana üretilen ve BMW 3 Serisi'nin yüksek performanslı modelidir.";
        TextView txtbmw = findViewById(R.id.m3text);
        txtbmw.setText(bmw);


    }
}