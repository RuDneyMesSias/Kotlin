package com.Rudev.androidmaster

fun main() {
    //variaveis Nulas

    var name: String? = "Rudev É real "

    println(name?.get(3) ?: "é nulo sim ")

}

fun Nu1(){
    //variaveis Nulas

    var name: String? = null

    println(name?.get(3) )

}

fun Nu(){
    //variaveis Nulas

    var name: String? = null

    println(name!![3]!! )
}
