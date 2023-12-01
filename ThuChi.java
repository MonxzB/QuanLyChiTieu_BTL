package com.example.btl_quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ThuChi extends AppCompatActivity {

    ImageButton imgback, imgcham, imgtrang, imgthuchi, imgcaidat;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thu_chi);

        imgback= findViewById(R.id.imgback);
        imgcham= findViewById(R.id.imgcham);
        imgtrang= findViewById(R.id.imgtrangchu);
        imgthuchi= findViewById(R.id.imgthuchi);
        imgcaidat= findViewById(R.id.imgcaidat);

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back= new Intent(ThuChi.this, TrangChu.class);
                startActivity(back);
            }
        });

        imgthuchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thuchi= new Intent(ThuChi.this, ThuChi.class);
                startActivity(thuchi);
            }
        });

        imgcaidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caidat= new Intent(ThuChi.this, CaiDat.class);
                startActivity(caidat);
            }
        });
    }
}