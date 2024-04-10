package com.learningkotlin.sumtuckyi

val a = "package scope"
class B {
    fun print() {
        println(a)
    }
}

fun main() {
    val a = "different scope"
    println(a)
    B().print()
}