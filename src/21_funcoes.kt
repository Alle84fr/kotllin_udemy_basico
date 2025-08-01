/*
fun para declarar função
nome da função
(parâmetro)
{ corpo }
elas podem retornar algo

para rodar DEVE TER A FUNÇÃO PRINCIPAL MAIN
 */

//fun soma(x: Int,  y: Int): Int {
//    val r = x + y
//    return r
//}

//fun soma(x: Int,  y: Int): Int {
//    return x + y
//}

// fun soma (x: Int, y: Int): Int = x+y

// bem resumida, como sabe que este restorno  é int, nem precisa por
fun soma (x: Int, y: Int) = x+y

fun multiplica(x: Double, y: Double) = y*x
fun main (args: Array<String>){

    val a = 10
    val b = 30
    var resultado = soma(a,b )
    val outro = soma(4, 15)

    val c = 1.5
    val d = 5.3
    val mult = multiplica(c, d)
    println("A soma de $a e $b é $resultado")
    println("A soma de 4 e 15 é $outro")
    println("A multiplcação tem como resultado ${"%.2f".format(mult)}")
    // ou ${String.format(%.2, mult)}
}