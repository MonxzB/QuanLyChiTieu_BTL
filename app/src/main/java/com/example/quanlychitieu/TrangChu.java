package com.example.quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class TrangChu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        TextView tv_sovon = findViewById(R.id.SoTienHienCo);

        Button Btn_Pickdate = findViewById(R.id.buttonPickDate);
        Button Btn_addThuNhap = findViewById(R.id.Btn_addThuNhap);
        Button Btn_addChiTieu = findViewById(R.id.Btn_addChiTieu);
        Btn_Pickdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(TrangChu.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {

                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
        Btn_addThuNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Inte_AddThuNhap = new Intent(TrangChu.this, ThemKhoanThu.class);
                startActivity(Inte_AddThuNhap);
            }
        });
        Btn_addChiTieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Inte_AddChiTieu = new Intent(TrangChu.this, ThemKhoanChi.class);
                startActivity(Inte_AddChiTieu);
            }
        });
        Intent sotienconlai = getIntent();
        int sovon = sotienconlai.getIntExtra("SoTienConLai", 15000000);
        tv_sovon.setText(String.valueOf(sovon));
    }
}