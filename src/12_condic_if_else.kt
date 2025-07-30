fun main (args: Array<String>){

    /*
    if(condição){
    bloco} condição VERDADEIRA
    else {} condição FALSA
    else if == elif no .py
     */

    println("Digite valor inteiro: ")
    var xx = readLine()?.toInt()!!

    if((xx % 2) == 0){
        println(" o valor $xx é par")
    }else{
        println("O valor $xx é ímpar")
    }

    println("\nNota1: ")
    var x = readLine()?.toInt()!!

    println("\nNota2: ")
    var y = readLine()?.toInt()!!

    var n = (x + y)/2

    println("sua nota é $n e vc está:")

    if(n<0 || n>10){
        println("\nNota inválida")
    }else if (n>6){
        println("\nAprovado")
    }else if (n>4){
        println("\nRecuperação")
    }else{
        println("\nReprovado")
    }

    /*
    && e ambos dedvem ser verdade
    || ou ao menos um deve ser verdade
    n<0 || n>10 ou o n é menor que zero ou é maior que dez
    n>4 && n<6 n deve ser maior que 4 e, também, deve ser menor que 6
     */
}