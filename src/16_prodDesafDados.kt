import kotlin.random.Random

/*
do professor
 */

fun main(args: Array<String>){
    println("Qual n° do \uD83C\uDFB2 cairá? ")
    val palp = readLine()?.toInt()!!



    // chama o inteiro de 0 a 6
    // se não passar limite, vai todos n°a
    //como no dado não tem 0, será o n° mais 1 - 0 a 5 porque o último não pega
    val dado = Random.nextInt(6)+1

    when(palp == dado){
        true -> println("Acertou $palp")
        false -> println("Errou, é $dado e vc disse $palp")
    }
}