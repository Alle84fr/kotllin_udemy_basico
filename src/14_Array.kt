import java.util.Arrays

fun main(args: Array<String>){
    /*
    Array [] - estrutura de dados com:
    Tamanho fixo - não altera n° de elementos depois de criado
    Homogênio - só aceita mesmo tipo de dados
    Acesso por índice

                CRIAR

     String[] nome = new String []
     tipo de mutabilidade nome variável = arrayOf(valores)
     ex: val paises = arrayOf("Angôla","Brasil","Portugal","Timor-Leste","Cabo Verde","Guiné-Bissau" )

     Criar colocando tamanho do array
     ex: val paises = Array(12, {it})
          it = convênção para um único parâmetro implícito em lambda - aqui cada elemnto é seu próprio índice

          Array(12) - quando todos elementos tem o mesmo valor
          ex:val nomesPadrao = Array(5) { "Desconhecido" }
          Todos os elementos são "Desconhecido"

     */


    val paises = arrayOf("Angôla","Brasil","Portugal","Timor-Leste","Cabo Verde","Guiné-Bissau")

    val indic3 = paises[3]

    // joinToString - usa para converter a array e poder acessar seus elemntos
    // usar com separador
    println(paises.joinToString(" - "))

    println("Índice zero/ 1° posição temos o ${paises[0]}")
    println("Índice três/ 4° posição temos o $indic3")

    // pega último índice
    println("\nÚltimo índice é ${paises.last()}")

    //ordena em ordem alfabética
    // eu fiz assim para pular linhas, não sei se é o usual
    paises.sort()
    println("\n ${paises.joinToString("\n")}\n")

    //ordena pegando alguma referência
    //lengt = tamamho da String em caracteres - vê o tamanho por caracteres
    paises.sortBy { it.length }
    paises.forEach {
        println("$it")
    }

    //ordena pegando alguma referência
    //analisa quantidade de caracteres, se for maior que 10 (it.lenght > 10) == false, vem depois
    // se for menor que 10 (it.lenght <=10) == true e vem antes
    println()
    paises.sortBy { it.length > 10 }
    paises.forEach {
        println("$it")
    }

    //conta quantos elementos têm
    println()
    println(paises.count())
    println()

    //orda do último ao primeiro
    paises.reverse()
    //para cada país, imprima-o
    paises.forEach {
        println("$it")
    }

    //antes de qualquer coisa ordenar o array (ex: sort())
    paises.sort()

    //quero encontrar Cabo Verde e não sei qual é a posição
    //deve importar java.util.Arrays
    val posicao = Arrays.binarySearch(paises, "Cabo Verde")
    println("\nCabo Verde é o ${posicao+1}° elemento no índice é $posicao")


    //alterações/ correção
    val indice = Arrays.binarySearch(paises, "Brasil")
    println(indice)
    paises[indice] = "Brasilll"
    println(paises[indice])
}

/*
    //alterações/ correção
    val indice = Arrays.binarySearch(paises, "Brasil")
    paises[indice] = "Brasilll"
    println(paises[indice])

    erro
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
	at _14_ArrayKt.main(14_Array.kt:80)

	índice seria -1 == não existe/não econtrada - falta de por o array em ordem
 */