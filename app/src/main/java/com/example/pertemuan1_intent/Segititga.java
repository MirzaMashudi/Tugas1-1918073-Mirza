package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segititga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segititga);

        EditText alas, tinggi;
        Button btn_hitung;
        TextView hasilluas;

        alas=(EditText)findViewById(R.id.input_alas);
        tinggi=(EditText)findViewById(R.id.input_tinggi);
        hasilluas=(TextView) findViewById(R.id.output_hasil);
        btn_hitung=(Button) findViewById(R.id.btn_hitung);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a,t, hasil;
                a=Double.valueOf(alas.getText().toString()); t=Double.valueOf(tinggi.getText().toString());

                hasil = (a / 2) * t;
                String hasil1 = String.valueOf(hasil);
                hasilluas.setText(hasil1);
            }
        });
    }
}