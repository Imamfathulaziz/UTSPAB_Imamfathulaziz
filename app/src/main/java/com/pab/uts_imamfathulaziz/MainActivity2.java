package com.pab.uts_imamfathulaziz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvNama, tvNomor, tvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNama = findViewById(R.id.tv_nama);
        tvNomor = findViewById(R.id.tv_nomor);
        tvInfo = findViewById(R.id.tv_info);

        Intent ambilIntent = getIntent();
        tvNama.setText(ambilIntent.getStringExtra("aNama"));
        tvNomor.setText(ambilIntent.getStringExtra("aNomor"));
        tvInfo.setText(ambilIntent.getStringExtra("aInfo"));
    }
}