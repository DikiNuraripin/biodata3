package com.example.biodata3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterpace {
    @GET("ad58fef0")
    Call<List<Guru>> getDaftarGuru();
}
