package com.example.biodata3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView txtNama,txtAlamat,txtJabatan,txtKomp1,txtKomp2,txtKomp3;
    ApiInterpace apiInterpace;
    List<Guru> daftarGuru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNama=(TextView)findViewById(R.id.txt_Nama);
        txtAlamat=(TextView)findViewById(R.id.txt_Alamat);
        txtJabatan=(TextView)findViewById(R.id.txt_Jabatan);
        txtKomp1=(TextView)findViewById(R.id.txt_Komp1);
        txtKomp2=(TextView)findViewById(R.id.txt_Komp2);
        txtKomp3=(TextView)findViewById(R.id.txt_Komp3);
        apiInterpace=Apiclient.ambilGuru().create(ApiInterpace.class);
        Call<List<Guru>>call=apiInterpace.getDaftarGuru();
        call.enqueue(new Callback<List<Guru>>() {
            @Override
            public void onResponse(Call<List<Guru>> call, Response<List<Guru>> response) {
                daftarGuru=response.body();
                txtNama.setText(daftarGuru.get(0).getNama());
                txtAlamat.setText(daftarGuru.get(0).getAlamat());
                txtJabatan.setText(daftarGuru.get(0).getJabatan());
                txtKomp1.setText(daftarGuru.get(0).getKompetensi().get(0));
                txtKomp2.setText(daftarGuru.get(0).getKompetensi().get(1));
                txtKomp3.setText(daftarGuru.get(0).getKompetensi().get(2));
            }

            @Override
            public void onFailure(Call<List<Guru>> call, Throwable t) {

            }
        });

    }
}