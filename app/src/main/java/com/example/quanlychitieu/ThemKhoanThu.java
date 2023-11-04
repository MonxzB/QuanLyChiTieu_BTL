package com.example.quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThemKhoanThu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_khoan_thu);
        Button Btn_cfThunhap = findViewById(R.id.Btn_CfThuNhap);
        Btn_cfThunhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThemKhoanThu.this, "Thêm thành công", Toast.LENGTH_SHORT).show();
                Intent Inte_cfThuNhap = new Intent(ThemKhoanThu.this, TrangChu.class);
                startActivity(Inte_cfThuNhap);
            }
        });
    }
}