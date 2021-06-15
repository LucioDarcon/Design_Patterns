package com.example.designpatterns.observable.rxjava

import io.reactivex.Observable

fun main() {
//
//    val example = Observable.just("Hello RX")
//        .subscribe { valor -> println(valor)
//        }

//    val example2 = Observable.fromIterable(listOf("Google", "Microsoft", "Apple"))
//        .subscribe(
//            { println(it) },          // onNext
//            { e -> println("Erro") }, // onError
//            { println("Complete") }   // onComplete
//        )

    getObservableFromList(listOf("Carro", "Moto"))
}

fun getObservableFromList(lista: List<String>) =
    Observable.create<String> { emitter ->
        lista.forEach { nome ->
            if (nome == "") {
                emitter.onError(Exception("Valor em branco"))
            }
            emitter.onNext(nome)
        }
        emitter.onComplete()
    }