package com.learningkotlin.sumtuckyi

fun main() {
    var price = 5000
    // 스코프 함수 1 - apply
    // 인스턴스 자신을 반환함
    // main 함수와는 별도의 스코프에서 인스턴스의 변수와 함수를 조작
    var a = Book("kotlin", 25_000).apply {
        name = "[special price]" + name
        discount()
    }
    // 스코프 함수 2 - run
    val b = a.run {
        println(price) // 이 코드는 실행
        name// 이 값은 변수 b에 할당
    }
    a.run {
        println("상품명: ${name}, 가격: ${price}")
    }
    // 스코프 함수 3 - let
    a.let {
        println("상품명: ${it.name}, 가격: ${it.price}")
    }
    // 스코프 함수 3 - with
    with(a) {
        println("상품명: ${name}, 가격: ${price}")
    }
}

class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}