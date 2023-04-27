package com.Rudev.androidmaster
//Lista imuntavel
fun main(){
    mutavelList()
}

fun mutavelList(){
    var weekDavs:MutableList<String> = mutableListOf("Luana", "Mario", "João","Luis", "hiago", "Sabado", "Domingo")
    weekDavs.add(5,"Tozimmmm")
    println(weekDavs)

    if(weekDavs.isEmpty()){
        //Não printar nada
    }else{
        weekDavs.forEach { println(it) }
    }

    if(weekDavs.isNotEmpty()){
        weekDavs.forEach { println(it) }
    }

    weekDavs.last()
}

fun imuntavelList(){
    val readOnly:List<String> = listOf("Luana", "Mario", "João","Luis", "hiago", "Sabado", "Domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

//Filtrar
    val exemplo = readOnly.filter{  it.contains("A") }
    println(exemplo)
    
//Percorrer

    readOnly.forEach { weekDay -> println(weekDay) }


}

