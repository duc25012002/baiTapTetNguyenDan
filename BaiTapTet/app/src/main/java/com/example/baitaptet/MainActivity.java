package com.example.baitaptet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText edtHoVaTen, edtNgaySinh, edtTruongHoc;
    RadioButton radio_nam, radio_nu;
    CheckBox chkTheThao, chkDuLich, chkDocSach;
    Button btnNhapLieu, btnNhapLai;

    String gioiTinh, soThich;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();
        xuLySuKien();


    }

    private void xuLySuKien() {
        btnNhapLieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radio_nam.isChecked()) {
                    gioiTinh = "Nam";
                } else {
                    gioiTinh = "Nữ";
                }
                if (chkTheThao.isChecked()) {
                    soThich = "The Thao";
                }
                if (chkDuLich.isChecked()) {
                    soThich = soThich + " Du Lich";
                }
                if (chkDocSach.isChecked()) {
                    soThich = soThich + " Doc Sach";
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("hoTen", edtHoVaTen.getText().toString());
                bundle.putString("ngaySinh", edtNgaySinh.getText().toString());
                bundle.putString("truongHoc", edtTruongHoc.getText().toString());
                bundle.putString("gioiTinh", gioiTinh);
                bundle.putString("soThich", soThich);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnNhapLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtHoVaTen.setText("");
                edtNgaySinh.setText("");
                edtTruongHoc.setText("");
            }
        });


    }

    private void anhXa() {
        edtHoVaTen = findViewById(R.id.edtHoVaTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtTruongHoc = findViewById(R.id.edtTruongHoc);

        radio_nam = findViewById(R.id.radio_nam);
        radio_nu = findViewById(R.id.radio_nu);

        chkDocSach = findViewById(R.id.chkDocSach);
        chkDuLich = findViewById(R.id.chkDuLich);
        chkTheThao = findViewById(R.id.chkTheThao);

        btnNhapLai = findViewById(R.id.btnNhapLai);
        btnNhapLieu = findViewById(R.id.btnNhapLieu);

    }
}