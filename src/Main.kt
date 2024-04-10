package com.learningkotlin.sumtuckyi

fun main() {
    var d = Dog()
    d.eat()
    d.run()
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

class Dog : Runner, Eater {
    override fun run() {
        println("열심히 뜁니다")
    }

    override fun eat() {
        println("천천히 음식을 먹습니다")
    }
}