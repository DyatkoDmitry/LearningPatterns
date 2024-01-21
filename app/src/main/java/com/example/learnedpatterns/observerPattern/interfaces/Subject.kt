package com.example.learnedpatterns.observerPattern.interfaces

interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}