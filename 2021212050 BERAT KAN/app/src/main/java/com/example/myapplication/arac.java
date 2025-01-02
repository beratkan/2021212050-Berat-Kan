package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class arac extends BaseAdapter {
    Context context;
    String[] aracmarka;
    String[] aracmodel;
    String[] aracfiyat;
    int[] aracresim;
    LayoutInflater inflater;


    public arac(Context context, String[] aracmarka, String[] aracmodel, String[] aracfiyat, int[] aracresim) {
        this.context = context;
        this.aracmarka = aracmarka;
        this.aracmodel = aracmodel;
        this.aracfiyat = aracfiyat;
        this.aracresim = aracresim;
    }

    @Override
    public int getCount() {
        return aracmarka.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satir = LayoutInflater.from(context).inflate(R.layout.araclayout,parent,false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView img1=satir.findViewById(R.id.aracresim);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtmarka= satir.findViewById(R.id.aracmarka);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtmodel= satir.findViewById(R.id.aracmodel);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtfiyat = satir.findViewById(R.id.aracfiyat);
        img1.setBackgroundResource(aracresim[position]);
        txtmarka.setText(aracmarka[position]);
        txtmodel.setText(aracmodel[position]);
        txtfiyat.setText(aracfiyat[position]);




        return satir;
    }
}
