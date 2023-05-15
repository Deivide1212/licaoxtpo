package com.example.licaoxtpo.kotlin

/**
 * exercicio 2
 */
fun main() {
    lesson1()
    lesson2()

}

private fun lesson1() {
    //alterar o valor para um "numero impar" ou par
    val numero = 6
    if (numero % 2 == 0) {
        println("o numero é par")
    } else {
        println("o numero é impar")
    }
}


private fun lesson2() {

    val numero = 6
    val resultado = when (numero % 2) {
        0 -> "par"
        else -> "impar"
    }
    println("$numero é $resultado")
}

