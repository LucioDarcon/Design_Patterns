package com.example.designpatterns.observable.rxjava

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class ViaCepRemoteDataSourceImp(viaCepApiDataSource: ViaCepApiDataSource) : ViaCepRemoteDataSource {

    val mViaCepApiDataSource = viaCepApiDataSource

    companion object {

        private var INSTANCE: ViaCepRemoteDataSourceImp? = null

        @JvmStatic
        fun getInstance(apiDataSource: ViaCepApiDataSource): ViaCepRemoteDataSource? {
            if (INSTANCE == null) {
                INSTANCE = ViaCepRemoteDataSourceImp(apiDataSource)
            }
            return INSTANCE
        }
    }

    override fun getCep(cep: String, viaCepCallback: ViaCepCallback): Disposable? {
        return mViaCepApiDataSource.getCep(cep)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ viaCepResponse ->
                viaCepCallback.onSuccess(viaCepResponse)
            }, { throwable ->
                viaCepCallback.onFailure(throwable)
            })

    }
}