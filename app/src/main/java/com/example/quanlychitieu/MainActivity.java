package com.example.quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_dangy = findViewById(R.id.Btn_dangky);
        btn_dangy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Inte_DangKy = new Intent(MainActivity.this, TrangChu.class);
                startActivity(Inte_DangKy);
            }
        });
    }
}