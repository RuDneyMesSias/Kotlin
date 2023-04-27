package com.Rudev.androidmaster

/**
 *      Variaveis: Em Kotlin temos duas formas de declarar variáveis, utilizando as palavras-chave
 * val ou var e precisamos conhecer o sígnificado de ambas.*/

/**     Variável é um mecanismo das linguagens de programação que facilita colocar, remover, acessar e
 * modificar um ou mais dados na memória do computador.*/

 /**  A sintaxe para declaração  de variáveis usa pascal notation, onde informamos nome: tipo.*/


 val age:Int = 30

fun main(){

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
     stringConcatenada = "Olá Me chamo $stringExampl2 tenho $age2 anos "
     println(stringConcatenada)

     val examplo123:String = age.toString()

     /**
      * Variables Booleanas
      */

     //Boolean
     val booleanExemplo:Boolean =  true
     val booleanExemplo2:Boolean =  false
     val booleanExemplo3:Boolean =  false

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

fun variaveisNumericas(){
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
    stringConcatenada = "Olá Me chamo $stringExampl2 tenho $age2 anos "
    println(stringConcatenada)

    val examplo123:String = age.toString()

    /**
     * Variables Booleanas
     */

    //Boolean
    val booleanExemplo:Boolean =  true
    val booleanExemplo2:Boolean =  false
    val booleanExemplo3:Boolean =  false

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

/**
 *  VAL - Essa é a forma mais utilizada e recomendada para declarar  uma variável. Com val a
*   variável recebe valor uma única vez, podendo ser utilizada somente para a leitura de valores.
*/

/**
 *      Caso se tente alterar o valor de uma variável declarada com val, um erro de compilação será
 * emitido. Com a mensagem Val cannot be reassigned.
 */

/**
 *      Var - Casp uma variável deva mudar de valor, usamos var em sua declaração, não requer que a
 *      variável seja iniciada com um valor. Embora possamos omitir o valor quando usamos var, o
 *      *** tipo da variável ainda é obrigadotorio neste caso. *** Um erro de compilação é emitido
 *      caso tipo e valor estejam ausentes na declaração de uma variável.*/

/**
 *      O primeiro erro possui a mensagem *** THIS VARIABLE MUST EITHER HAVE A TYPE ANNOTATION OR
 *      BE INITIALIZED. que diz respeito a ausência de valor e tipo de valor.*/

/**
 *      A segunda mensagem de erro é VARIABLE '*****' MUST BE INITIALIZED, que se refere a aus~encia
 *      de um valor especificamente, porque se um valor está presente o compilador consegue inferir
 *      o tipo de uma variável.
 */

/**
 *      A linguagem Kotlin suporta a declaração de variáveis de nível elevado (top-level),
 *      imediatamente dentro de um pacote, sendo possível declarar uma variável fora de uma função
 *      ou classe.
 */

/**
 *      Casp uma variável local, declarada dentro de uma função , tenha o mesmo nome de uma variável
 *      de nível elevado, a variável de nível elevado será ofuscada dentro da função.
 */

/**
 *     //Variável numerica:

//Int -2,147,483,647 a 2,147,483,647
val age:Int = 30

//Long -9,223,372,036,854,775,887 a 9,223,372,036,854,775,887
val exemplo:Long = 30

//Float
val floatExemplo:Float  = 30.5f

//Double
val doubleExamplo:
val doubleExample:Double = 3241.3123123
 */

/**
 * variables Alfaumérocos
 */





