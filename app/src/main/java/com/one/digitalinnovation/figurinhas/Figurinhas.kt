package com.one.digitalinnovation.figurinhas

fun main(args: Array<String>) {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        var num1 = 0

        lista.add(mdc(input[0], input[1]))
    }
    var tama = lista.size
    tama--
    for (i in 0..tama) { println(lista[i]) }
}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    var resto = 0
    var num1 = n1
    var num2 = n2
    while (num2 != 0) {
        resto = num1 % num2
        num1 = num2
        num2 = resto
    }
    return num1
}


