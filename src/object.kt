package com.learningkotlin.sumtuckyi

fun main() {
//    println(Counter.count)
//    Counter.countUp()
//    Counter.countUp()
//
//    println(Counter.count)
//    Counter.clear()
//    println(Counter.count)
    var a = FoodPoll("짜장면")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name}:${a.count}")
    println("${b.name}:${b.count}")
    println("총계:${FoodPoll.total}")
}

object Counter {
    var count = 0

    fun countUp() {
        count ++
    }

    fun clear() {
        count = 0
    }
}

class FoodPoll(val name: String) {
    companion object{
        var total = 0
    }
    // 일반 속성
    var count = 0
    fun vote() {
        total++
        count++
    }
}