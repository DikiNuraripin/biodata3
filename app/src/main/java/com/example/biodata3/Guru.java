package com.example.biodata3;

import java.util.List;

public class Guru {
 private String nama;
 private String alamat;
 private String jabatan;
 private List<String> kompetensi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public List<String> getKompetensi() {
        return kompetensi;
    }

    public void setKompetensi(List<String> kompetensi) {
        this.kompetensi = kompetensi;
    }
}

