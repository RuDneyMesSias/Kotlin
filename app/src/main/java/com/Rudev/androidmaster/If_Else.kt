package com.Rudev.androidmaster

fun main(){
    ifMutipleOR()

}

fun ifMutipleOR(){
    var pet = "cat"
    var isHappy = true

    if(pet == "dog" || (pet == "cat" && isHappy)){
        println("É um gato ou passaro ")
    }
}

fun ifMuti(){
    var age = 18
    var parentPermission = false
    var ImFeliz = true

    if(age >= 18 && parentPermission && ImFeliz){
        println("Permitido beber cerveja")
    }

}

fun ifInt(){
    var age = 18

    if(age >= 18){
        println("Beber cerveja")
    }else{
        println("Beber suco de laranja")
    }
}

fun ifBoolean(){
    //Expressão verdadeira == true
    // com " ! " Expressão falsa == false

    var souFeliz:Boolean = false

    if(!souFeliz){
        println("Estou triste :( a expressão é falsa ")
    }else{
        println("Estou Feliz :) a expressão é verdadeira")
    }
}

fun ifAninhado() {
    val animal = "Rudev"

    if (animal == "dog") {
        println("é um cachorro!")

    }else if (animal == "cat") {
        println("É um gato")

    }else if (animal == "boi") {
        println("É um boi")
    }else{
        println("Não reconheço este animal $animal ")
    }

}

fun ifBasico(){
    val name = "Messias"

    if(name =="Messias"){
        println("Ola, A variavel nome é $name")
    }else{
        println("Este não é Pepe")
    }
}