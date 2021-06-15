package com.example.designpatterns.observable.observer

fun main() {

    val editor = Editor()
    editor.events.subscribe("open", LogOpenListener("/path/to/log/file.txt"))
    editor.events.subscribe("save", EmailNotificationListener("lucio@example.com"))

    editor.openFile("test.txt")
    editor.saveFile()

}