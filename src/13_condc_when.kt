fun main (args: Array<String>){

    /*
    verificar se x pertence a algo
    atalho escrever
    in 0..5, o programada compreta com resto
     */

    println("Qual sua idade?")
    var idade = readLine()?.toInt()!!

    when(idade) {
        in 0..5 -> println("Com $idade vc é um Bebê")
        in 6..11 -> println("Com $idade vc é uma Criança")
        in 12..17 -> println("Com $idade vc é um Adolecente")
        in 18..60 -> println("Com $idade vc é um Adulto")
        in 61..90 -> println("Com $idade vc é um Idoso")
        else -> {println("Com $idade vc é um Mumm-rá")
            println("Cuidado com o He-man")}
    }

    /*
    when, quando, é controle de fluxo, com diferentes condições
    -> separador de condições, um intervalo, e depois da seta executa o bloco da condição
    seria "então faça"
    Aqui tem apenas uma única expressão, instrução, como se fossem duas linhas
    observa que
    ex: lambda- funções anônimas/ funções anominadas
    { a: Int, b: Int -> a + b }
    val somar = { a: Int, b: Int -> a + b }
    val resultado = somar(5, 3)

    Executa a lambda: resultado será 8
    'a' e 'b' são entradas, 'a + b' é a ação-método/resultado

     = é atribuição, e neste caso não está "pondo" valor a nada, está rodando o cód
     {} é usado quando se tem bloco de cód com multiplas linhas ou funções

     corpo de expressão - single-expression function:
     Retorno do resultado de uma única expressão
     método -> resultado
     ex: fun multiplicarExpressao(a: Int, b: Int): Int = a * b
          println(multiplicarExpressao(4, 2))
     'a * b' é a única expressão de resultado, que é 8
     */
}