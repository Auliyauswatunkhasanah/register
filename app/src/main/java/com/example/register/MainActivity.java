package com.example.register;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edNama, edAlamat, edNo;
    Button bDaftar;
    String Nama, Alamat, Nomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.editNa);
        edAlamat = findViewById(R.id.editAl);
        edNo = findViewById(R.id.editNo);
        bDaftar = findViewById(R.id.btnok);

        bDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                //Membaca input dari edittext
                Nama = edNama.getText().toString();
                Alamat = edAlamat.getText().toString();
                Nomor = edNo.getText().toString();

                //Menampilkan pesan
                if (!Nama.isEmpty() && !Alamat.isEmpty() && !Nomor.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Data Harus Diisi",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
