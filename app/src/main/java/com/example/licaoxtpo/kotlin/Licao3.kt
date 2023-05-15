package com.example.licaoxtpo.kotlin

/**
 * exercicio 3
 */
fun main() {
    lesson1()
    lesson2()
    lesson3()
}

private fun lesson1() {
    var numbers: IntArray = IntArray(40)

    for (i in numbers.indices) {
        numbers[i] = i * 1
        println(numbers[i])
    }

}

private fun lesson2() {
    var numbers: MutableList<Int> = mutableListOf()

    for (i in 0..99) {
        numbers.add(i)
        println(numbers[i])
    }
}

private fun lesson3() {
    var soma = 0
    var numbers: MutableList<Int> = mutableListOf()

    for (i in 0..99) {
        numbers.add(i)
        println(numbers[i])
    }
    for (i in numbers.indices) {
        soma += i
        println(soma)
    }

}