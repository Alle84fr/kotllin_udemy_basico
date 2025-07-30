fun main(array: Array<String>){

    /*
    != diferente
    == igual
    ! inverte
    is se os tipos são iguais (em java é instanceof)
    retorno sempre booleano -> true or false
     */

    val x = 2
    val y = 4
    val t = true

    println(x != y)
    println(x == y)
    println(!t)
    println(t is Int)
    println(t is Boolean)
}