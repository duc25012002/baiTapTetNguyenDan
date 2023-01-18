package com.example.baitaptet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtTongHop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtTongHop = findViewById(R.id.txtTongHop);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {

            String hoTen = bundle.getString("hoTen", "");
            String ngaySinh = bundle.getString("ngaySinh", "");
            String truongHoc = bundle.getString("truongHoc", "");
            String gioiTinh = bundle.getString("gioiTinh", "");
            String soThich = bundle.getString("soThich", "");

            txtTongHop.setText(hoTen + "||" + ngaySinh + "||" + truongHoc + "||" + gioiTinh + "||" + soThich);
        }
    }
}