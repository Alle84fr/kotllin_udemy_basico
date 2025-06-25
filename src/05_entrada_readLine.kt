/*

 AULA 7

 Criando um calculadora

 ReadLine = função que lê a entrada do terminal (o que o usuário irá digitar)

 val x = readLine()?.toInt()!!
 variável imutável x que receberá a função readline, só executará a linha se valor não for nulo,só converterá
 o valor se não for nulo, e se for nulo irá enviar uma exception
 ?.toInt() - só converterá a entrada (que pode padrão é string) em int (.toInt() - função para converter para
 n°s inteiros) se o valor não for nulo(null)
 ? - Safe Call Operation - operador de chamada segura - executa uma ação apenas se valor NÃO FOR NULO
 evita NullPointerException
 !! - Non-null-Assertion - força valor nullable (null) - não-nullabel.
 Se for nulo lança exception (NullPointerException)

*/

fun main (args: Array<String>) {
    //Recebe dois valore, soma e mostra o resultado

    println("Digitar valor:")
    val numeroUm = readLine()?.toInt()!!

    println("Digitar valor:")
    val numeroDois = readLine()?.toInt()!!

    val somar = numeroUm + numeroDois

    println("A soma do valor $numeroUm e do $numeroDois é igual a $somar")
}