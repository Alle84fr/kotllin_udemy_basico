fun main(args: Array<String>){
    /*
    > maior
    >= maior igual
    < menor
    <= menor igual
     */

    val x = 70
    val y = 50
    val t = 70

    println("Digite qualquer coisa")
    val inputx = readLine()

    println("Digite qualquer coisa")
    val inputy = readLine()?.toInt()

    println(x>y)
    println(x<y)
    println(x>=t)
    println(y>=t)
    println("Você digitou $inputx e é ${inputx is String} que é String")
    println("Você digitou $inputy e é ${inputy is String} que é String")

    /*
    readline é função de input, e seu retorno, natural é string
    .toInt é método para converter string em inteiro, equivale ao int(input())  do .py
    ? operador (safe call operator/operador de chamada segura) se readline() não for null, vai para toInto,se for
    null, apenas retorna null
     */
}