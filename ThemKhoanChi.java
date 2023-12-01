package com.example.btl_quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ThemKhoanChi extends AppCompatActivity {

    ImageButton imgback, imgan, imgmua, imgtrang, imgthuchi, imgcaidat;
    Button btnpl, btnchi, btnan, btnmua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_khoan_chi);

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back= new Intent(ThemKhoanChi.this, TrangChu.class);
                startActivity(back);
            }
        });

        imgan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnmua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        imgtrang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trang= new Intent(ThemKhoanChi.this, TrangChu.class);
                startActivity(trang);
            }
        });

        imgthuchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thuchi= new Intent(ThemKhoanChi.this, ThuChi.class);
                startActivity(thuchi);
            }
        });

        imgcaidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caidat= new Intent(ThemKhoanChi.this, CaiDat.class);
                startActivity(caidat);
            }
        });
    }
}