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
    result(2)
}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) println("Olá mundo")
    }
}

fun getSemestre3(meses:Int) = when(meses){
        in 1..6 -> "Primeiro Semestre"
        in 7..12 -> "Primeiro Semestre"
        !in 1..12 -> "Semestre não valido "
        else -> "Nada!!!"
    }

fun getSemestre2(meses:Int):String{
    return when(meses){
        in 1..6 -> "Primeiro Semestre"
        in 7..12 -> "Primeiro Semestre"
        !in 1..12 -> "Semestre não valido "
        else -> return  "Nada!!!"
    }
}

fun getSemestre1(meses:Int):String{
    val result = when(meses){
        in 1..6 -> "Primeiro Semestre"
        in 7..12 -> "Primeiro Semestre"
        !in 1..12 -> "Semestre não valido "
        else -> return  "Nada!!!"
    }

    return result
}

fun getSemestre(meses:Int){
    when(meses){
        in 1..6 -> println("Primeiro Semestre")
        in 7..12 -> println("Primeiro Semestre")
        !in 1..12 -> print("Semestre não valido ")
    }

}

fun getTrimestre(meses:Int){
    when(meses){
        1, 2, 3 -> println("Primeiro Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Terceiro Trimestre")
        10,11, 12 -> println("Quarto Trimestre")
        else -> print("Não existe este Trimeste")
    }
}

fun get1Meses(mes:Int){
    when(mes){
        1 -> println("IIIJaneiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> {
            println("Novembro")
            println("Novembro_Duplicidade")
        }
        12 -> println("Dezembro")
        else -> print("Não existe este mês")
    }

}

fun getMonth(meses:Int){
        if(meses == 1 ){
            println("Janeiro")
        }else if (meses == 2){
            println("Fevereiro")
        }else if (meses == 3){
            println("Março")
        }else if (meses == 4){
            println("Abril")
        }else if (meses == 5){
            println("Maio")
        }else if (meses == 6){
            println("Junho")
        }else if (meses == 7){
            println("Julho")
        }else if (meses == 8){
            println("Agosto")
        }else if (meses == 9){
            println("Setembro")
        }else if (meses == 10){
            println("Outubro")
        }else if (meses == 11){
            println("Novembro")
        }else if (meses == 12){
            println("Dezembro")
        }else{
            println("Este mês não existe")
        }
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