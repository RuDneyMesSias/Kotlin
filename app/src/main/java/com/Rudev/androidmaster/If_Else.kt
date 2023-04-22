package com.Rudev.androidmaster

/**
 *      Use uma instrução **if**  para definir uma condição e executar algumas ações.
 * Por exemplo, se o usuário tirar o número da sorte, exiba uma mensagem vencedora.*/

/**
Os dados do ** tipo Boolean têm os valores true e false ** e podem ser usados para tomar decisões.
Compare valores usando operadores como "maior que" (>), "menor que" (<) e "igual a" (==).*/

/**
 *  Use uma **cadeia de instruções else if** para definir várias condições. Por exemplo, exiba
uma mensagem diferente para cada resultado possível do dado.*/

/**
 * Use uma instrução **else** no final de uma cadeia de condições para abranger casos que
podem não estar cobertos de forma explícita.

Caso você estivesse cobrindo as possibilidades de um dado de seis lados,uma ** instrução else
abrangeria os números 7 e 8 tirados em um dado de 8 lados. ***/

/**
 * Use uma instrução when como uma forma compacta de executar o código com base na
comparação de um valor.*/

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