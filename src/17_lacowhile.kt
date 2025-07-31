fun main(args: Array<String>){

    /*
    Estrutura de repetição While
    1° verifica, se for true executa
     */

    val num = arrayListOf<Int>()
    var tam = 0

    //inicia com 1 e vai até 10, quando der 11 é false e sai do loop
    while (num.size != 10){
        num.add(tam ++)
        println(num.size)
    }
}