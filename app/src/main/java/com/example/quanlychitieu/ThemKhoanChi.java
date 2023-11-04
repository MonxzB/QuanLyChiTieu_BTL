package com.example.quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class ThemKhoanChi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_khoan_chi);
        Button Btn_cfChiTieu = findViewById(R.id.Btn_CfChiTieu);
        Btn_cfChiTieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = LayoutInflater.from(getApplication()).inflate(R.layout.activity_trang_chu, null);

                TextView tv_sovon = view.findViewById(R.id.SoTienHienCo);

                String txt_sovon = tv_sovon.getText().toString();
                int sovon = Integer.parseInt(txt_sovon);
                EditText edt_SoChi = findViewById(R.id.edtsochi);
                String txt_soChi = edt_SoChi.getText().toString();
                int SoChi;
                if(!txt_soChi.isEmpty()){
                    SoChi = Integer.parseInt(txt_soChi);
                }else{
                    SoChi = 0;
                }
                sovon = sovon - SoChi;
                Toast.makeText(ThemKhoanChi.this, "Thêm thành công", Toast.LENGTH_SHORT).show();
                Intent Inte_cfChiTieu = new Intent(ThemKhoanChi.this, TrangChu.class);

                sovon += Inte_cfChiTieu.getIntExtra("SoTienConLai", 1500000);

                Inte_cfChiTieu.putExtra("SoTienConLai", sovon);
                startActivity(Inte_cfChiTieu);
            }
        });
    }

}