package com.Rudev.androidmaster

fun main(){
    var name:String = "Rudev"
    var name2:String = "Rudev"
    var name3:String = "Rudev"
    var name4:String = "Rudev"



    val weekDays = arrayOf("Luana", "Mario", "João","Luis", "hiago", "Sabado", "Domingo")
//Tamanho do Array: print(weekDays.size)size
// No Array temos tamanho fixo.

    //println(weekDays[0])
    //println(weekDays.size)

//Tamanhos:
    if(weekDays.size >= 8) {
        //print(weekDays.size)
    }else{
        //println("Não existe este dados no Array")
    }

//Modificando valores:
    weekDays[0] = "Messias"
    //println(weekDays[0])


//Loops
    for(position in weekDays.indices){
        //println("Paasando por aqui $position")
        //println(weekDays[position])

    }
    for((position, value )in weekDays.withIndex()){
        println("A posição $position, cliente $value ")
    }
//for variavel in Array:
    for (weekDay in weekDays){
        println("Hora és $weekDay")
    }
}