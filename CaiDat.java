package com.example.btl_quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CaiDat extends AppCompatActivity {

    ImageButton imgback, imgvi, imgtien, imgxuat, imgtrang, imgthuchi, imgcaidat;
    Button btnvi, btntien, btnxuat;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat);

        imgback= findViewById(R.id.imgback);
        imgvi= findViewById(R.id.imgvi);
        imgtien= findViewById(R.id.imgtien);
        imgxuat= findViewById(R.id.imgdangxuat);
        imgtrang= findViewById(R.id.imgtrangchu);
        imgthuchi= findViewById(R.id.imgthuchi);
        imgcaidat= findViewById(R.id.imgcaidat);

        btnvi= findViewById(R.id.btnvi);
        btntien= findViewById(R.id.btntiente);
        btnxuat= findViewById(R.id.btndangxuat);

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back= new Intent(CaiDat.this, TrangChu.class);
                startActivity(back);
            }
        });

        imgthuchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thuchi= new Intent(CaiDat.this, ThuChi.class);
                startActivity(thuchi);
            }
        });

        imgcaidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caidat= new Intent(CaiDat.this, CaiDat.class);
                startActivity(caidat);
            }
        });

        btnxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    DialogExit();
            }
        });
    }
    private void DialogExit(){
        Dialog dialog= new Dialog(this);

        dialog.setContentView(R.layout.dangxuat);
        // Tắt click ngoài là tắt
        dialog.setCanceledOnTouchOutside(false);

        Button btnYes= dialog.findViewById(R.id.buttonYes);
        Button btnNo= dialog.findViewById(R.id.buttonNo);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(CaiDat.this, MainActivity.class);
                startActivity(intent);

                // Thoát
                Intent intent1= new Intent(Intent.ACTION_MAIN);
                intent1.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent1);
            }
        });
        // Nếu click No thì trở lại main đóng cửa sổ
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        // show dialog
        dialog.show();
    }
}