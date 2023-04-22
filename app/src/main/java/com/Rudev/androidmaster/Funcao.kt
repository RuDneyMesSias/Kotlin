package com.Rudev.androidmaster

/**
 *  Antes de conhecer mais a fundo as funções, vamos revisar alguns termos básicos.

        A declaração (ou definição) de uma função usa a palavra-chave fun e inclui o código entre
chaves, que contém as instruções necessárias para executar uma tarefa.
        Chamar uma função faz com que todo o código contido nessa função seja executado.*/

/**
 * A criação de funções separadas para tarefas específicas oferece vários benefícios.

        Código reutilizável: em vez de copiar e colar códigos que você precisa usar mais de uma vez,
basta chamar uma função sempre que necessário.
        Legibilidade: garantir que funções realizem apenas uma tarefa específica ajuda outros
desenvolvedores, colegas de equipe e até mesmo você no futuro a saber exatamente o que um
código faz.*/

/**
 * Para definir uma função, comece com a palavra-chave fun, seguida pelo nome da função,
 * um conjunto de parênteses de abertura e fechamento e um conjunto de chaves de abertura e
 * fechamento. O código entre chaves é aquele que vai ser executado quando a função for chamada.
 */

fun main() {
        showMyName()
        showMyAge()
        add(25, 25)
        val mySubtracao = subtracao(10, 5)
        println(mySubtracao)

}
//Função com parâmetro de entrada:
fun showMyName(){
        println("Me chamo Rudev ")
}

fun showMyAge(currentAge:Int = 30){
        println("Tenho $currentAge de idade")
}

fun add(firstNumber: Int, secondNumber: Int){
        println(firstNumber + secondNumber)
}
//Função com parâmetro de saída:
fun subtracao(firstNumber: Int, secondNumber: Int):Int {
        return firstNumber - secondNumber
}


//Função com parâmetro de saída Simplificada:
fun subtracaoCool(firstNumber: Int, secondNumber: Int):Int = firstNumber - secondNumber



fun variavelAlfaNumericas(){

        /**
         * Variables Alfauméricos
         */

        //Char
        val charExamplo1:Char = 'e'
        val charExamplo2:Char = '2'
        val charExamplo3:Char = '@'

        //String
        val stringExamplo:String = "Rudev Messias "
        val stringExampl2:String = "RUDNEY MESSIAS "
        val stringExampl3:String = "4"
        val stringExampl4:String = "23"

        var stringConcatenada:String = "Olá "
        stringConcatenada = "Olá Me chamo $stringExampl2 tenho $age anos "
        println(stringConcatenada)
        val examplo123:String = age.toString()

}

fun variavelBoolena(){
        /**
         * Variables Booleanas
         */

        //Boolean
        val booleanExemplo:Boolean =  true
        val booleanExemplo2:Boolean =  false
        val booleanExemplo3:Boolean =  false

}

fun variaveisNumericas1(){
        /**
         * Variables Numéricas
         */

        //Int -2,147,483,647 a 2,147,483,647
        var age2:Int = 30
        age2 = 29

        //Long -9,223,372,036,854,775,887 a 9,223,372,036,854,775,887
        val exemplo:Long = 30
        val exemplo2: Long = 30

        //Float
        val floatExemplo:Float  = 30.5f

        //Double
        val doubleExamplo:Double = 3241.3123123


        println("Somado: ")
        println(age + age2)

        println("Restar")
        println(age-age2)

        println("Mutiplicar")
        println(age*age2)

        println("Divisão")
        println(age/age2)

        println("Módulo")
        println(age % age2)

        var exemploSuma = age + floatExemplo.toInt()

}