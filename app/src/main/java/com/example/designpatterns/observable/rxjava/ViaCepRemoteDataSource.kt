package com.example.designpatterns.observable.rxjava

import io.reactivex.disposables.Disposable

interface ViaCepRemoteDataSource {

    fun getCep(cep: String, viaCepCallback: ViaCepCallback): Disposable?

}