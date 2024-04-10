package com.learningkotlin.sumtuckyi

fun main() {
    // 일반 함수를 고차함수로 변환해주는 연산자
    b(::a)
    val c = {str:String-> println("$str 람다함수")}
    b(c) // 람다함수는 그 자체로 고차함수
}

// 인자로 넘겨지는 함수 -> 굳이 이렇게 길게 코드를 쓸 필요가 있을까?
fun a(str:String) {
    println("$str 함수 a")
}

fun b(function: (String)->Unit) {
    function("called by b")
}
