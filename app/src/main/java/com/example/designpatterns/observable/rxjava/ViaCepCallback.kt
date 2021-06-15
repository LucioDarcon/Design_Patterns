package com.example.designpatterns.observable.rxjava

interface ViaCepCallback {

    fun onSuccess(viaCepResponse: ViaCepResponse)

    fun onFailure(throwable: Throwable)

}