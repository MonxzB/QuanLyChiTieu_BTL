package com.example.quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ThuChi extends AppCompatActivity {

    ImageButton imgan, imgmua, imgluong, imgthuong, imgtrangchu, imgthuchi, imgcaidat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thu_chi);

        imgan= findViewById(R.id.imgan);
        imgmua= findViewById(R.id.imgmua);
        imgluong= findViewById(R.id.imgluong);
        imgthuong= findViewById(R.id.imgthuong);
        imgtrangchu= findViewById(R.id.imgtrangchu);
        imgthuchi= findViewById(R.id.imgthuchi);
        imgcaidat= findViewById(R.id.imgcaidat);

        imgan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentan= new Intent(ThuChi.this, CapNhat.class);
                Bundle bundlean= new Bundle();
                intentan.putExtra("Cập nhật", bundlean);
                startActivity(intentan);
            }
        });
    }
}