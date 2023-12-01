package com.example.btl_quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.btl_quanlychitieu.database.database;
import com.example.btl_quanlychitieu.model.User;

public class MainActivity extends AppCompatActivity {

    EditText tenDN, pass;
    Button btndn, btntao;
    database DATABASE_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;


        tenDN= findViewById(R.id.TenDn);
        pass= findViewById(R.id.password);
        btndn= findViewById(R.id.btn_dangnhap);
        btntao= findViewById(R.id.btn_taoTK);
        DATABASE_NAME= new database(this);

        btndn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tennguoidung = tenDN.getText().toString();
                String matkhau = pass.getText().toString();

                if (tennguoidung.isEmpty() || matkhau.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ các trường...", Toast.LENGTH_SHORT).show();
                } else {
                    Boolean kiemtraUserPass = DATABASE_NAME.kiemtraNguoiMatkhau(tennguoidung, matkhau);
                    if (kiemtraUserPass == true) {
                        Toast.makeText(MainActivity.this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                        Intent dangnhap = new Intent(getApplicationContext(), TrangChu.class);
                        startActivity(dangnhap);
                    } else {
                        Toast.makeText(MainActivity.this, "Đăng nhập không thành công! Bạn chua có tài khoản", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btntao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tao = new Intent(MainActivity.this, DangKy.class);
                startActivity(tao);
            }
        });
    }
}