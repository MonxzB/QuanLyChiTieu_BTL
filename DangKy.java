package com.example.btl_quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.btl_quanlychitieu.database.database;

public class DangKy extends AppCompatActivity {

    ImageButton imgback;
    Button btndangky;
    EditText edtten, edtmk1, edtmk2;

    database DATABASE_NAME ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        imgback = findViewById(R.id.imgback11);
        btndangky = findViewById(R.id.btndangky);
        edtten = findViewById(R.id.edtName);
        edtmk1 = findViewById(R.id.edtpass1);
        edtmk2 = findViewById(R.id.edtpass);
        DATABASE_NAME= new database(this);


        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tennguoidung, matkhau, matkhau1;
                tennguoidung = edtten.getText().toString();
                matkhau = edtmk1.getText().toString();
                matkhau1 = edtmk2.getText().toString();

                if (tennguoidung.isEmpty() || matkhau.isEmpty() || matkhau1.isEmpty()) {
                    Toast.makeText(DangKy.this, "Vui lòng nhập đủ các trường...", Toast.LENGTH_SHORT).show();
                } else{
                    if (matkhau1.equals(matkhau)) {
                        Boolean kiemtranguoidung = DATABASE_NAME.kiemtraNguoidung(tennguoidung);
                        if (kiemtranguoidung == false) {
                            Boolean them = DATABASE_NAME.themNguoidung(tennguoidung, matkhau);
                            if (them == true) {
                                Toast.makeText(DangKy.this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                                Intent dangky = new Intent( getApplicationContext(), TrangChu.class);
                                startActivity(dangky);
                            } else {
                                Toast.makeText(DangKy.this, "Đăng ký không thành công!", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(DangKy.this, "Người dùng đã tồn tại!", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(DangKy.this, "Mật khẩu không khớp!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(DangKy.this, MainActivity.class);
                startActivity(back);
            }
        });

    }
}


                /*if (tennguoidung.length() < 8) {
                    Toast.makeText(DangKy.this, "Tên người dùng phải >= 8 ký tự", Toast.LENGTH_SHORT).show();
                    edtten.requestFocus();
                    edtten.selectAll();
                    return;
                }

                if (matkhau.length() != 8) {
                    Toast.makeText(DangKy.this, "Mật khẩu phải có ít nhất 8 ký tự bao gm cả chữ và số", Toast.LENGTH_SHORT).show();
                    edtmk1.requestFocus();
                    edtmk1.selectAll();
                    return;
                }*/



