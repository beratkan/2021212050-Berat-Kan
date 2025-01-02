package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView.OnItemClickListener;
public class MainActivity2 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    String[] aracmodel = {"BMW","MERCEDES","TESLA","FIAT"};
    String[] aracmarka = {"M3","C63S","MODEL Y","EGEA"};
    String[] aracfiyat = {"300.000","350.000","250.000","100.000"};
    int[] aracresimler = {R.drawable.bmwm3,R.drawable.c63s,R.drawable.modely,R.drawable.egea,R.drawable.lambo,R.drawable.scirocco};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ListView lstv1 = findViewById(R.id.lstv1);



       arac adap = new arac(MainActivity2.this,aracmarka,aracmodel,aracfiyat,aracresimler);
        lstv1.setAdapter(adap);
        lstv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent git = new Intent(MainActivity2.this, bmwm3activity.class);
                    startActivity(git);
                    finish();
                }
                if (position ==1)
                {
                    Intent git1 = new Intent(MainActivity2.this, mercedesactivity.class);
                    startActivity(git1);
                    finish();
                }
if (position==2)
{
    Intent git2 = new Intent(MainActivity2.this, modelyactivity.class);
    startActivity(git2);
    finish();
}
if(position==3)
{
    Intent git3 = new Intent(MainActivity2.this, egeaactivity.class);
    startActivity(git3);
    finish();
}
            }
        });








    }
}