package com.example.designpatterns.composite

fun main() {
    val window = Window()
    window.mListItem.add(Button())
    window.mListItem.add(Text())
    window.mListItem.add(Text())
    window.mListItem.add(Window())
    window.showComponent()

    val button = Button()
    button.mListItem.add(Text())
    button.mListItem.add(Image())
    button.showComponent()
}