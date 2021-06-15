package com.example.designpatterns.observable.rxjava

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface ViaCepApiDataSource {

    @GET("{cep}/json/")
    fun getCep(@Path("cep") cep: String): Observable<ViaCepResponse>

}