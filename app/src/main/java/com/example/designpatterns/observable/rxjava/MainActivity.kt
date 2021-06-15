package com.example.designpatterns.observable.rxjava

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.designpatterns.R
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private var viaCepRemoteDataSourceImp : ViaCepRemoteDataSource? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viaCepRemoteDataSourceImp =
            ViaCepRemoteDataSourceImp.getInstance(buildRetrofit().create(ViaCepApiDataSource::class.java))

        viaCepRemoteDataSourceImp?.getCep("57062001", object : ViaCepCallback {

            override fun onSuccess(viaCepResponse: ViaCepResponse) {
                progressBar.visibility = View.GONE
                cep.text = viaCepResponse.cep
                logradouro.text = viaCepResponse.logradouro
            }

            override fun onFailure(throwable: Throwable) {
                progressBar.visibility = View.GONE
            }

        })

    }


    private fun buildRetrofit(): Retrofit {
        val okHttpClient = OkHttpClient().newBuilder()
            .build()

        val gson = GsonBuilder()
            .setLenient()
            .create()

        return Retrofit.Builder()
            .baseUrl("https://viacep.com.br/ws/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }




}
