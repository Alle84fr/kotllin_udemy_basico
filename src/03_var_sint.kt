fun main (){
    val nomeInteger = 0 //aqui é int, receve valor
    var nomeFloat = 0.0
    var nomeString = " "

    val nomeSemValorI : Int    //aqui não receberá "agora"  a variável - o que por será inteira
    val nomeSemValorS : String
    var nomeSemValorD : Double

    nomeSemValorI = 10
    nomeSemValorD = 10.0
    nomeSemValorS = "dez"

    var nome:Char = 'A'

    println("inter $nomeSemValorI, Doble $nomeSemValorD e String $nomeSemValorS entre outros")
    println("int $nomeInteger, float $nomeFloat e, mas não apenas estes String 'vazio' $nomeString")
}

/*
criar variável em Java -> String x = 0
1° o tipo
2° nome
3° recebe
4° valor

kotlin criando variável

1° mutabilidade - var (rodada - imutável) ou val (leal - imutável)
2° nome
3° recebe (=)
4° valor
 quando não for atribuir valores

 1° mutabilidade
 2° nome
 3° dois pontos (:)
 4° tipo
     PODE

    var nomeSemValorD : Double
    nomeSemValorI = 10.0

    NÃO PODE - ACUSARÁ ERRO

    var nomeSemValorD : Double
    nomeSemValorI = 10.0
    nomeSemValorI = 10.9

quaddo foir criada com tipo var x : int, só será permitido recer valor um vez

CHAR - caracteres únicos, declarada COM ASPAS SIMPLES ' '
Char - ex '1' (não é considerado n°), 'A' (letras), '&' (caracteres especiais), '\u03a9' (caracteres de unicode - neste caso é Omega Ω)
Char ocupa 16 bits/2bytes

pode ser usada para
- verificar se é letra ou n° ou caracteres
- converter para maiúsculo ou minúsculo

obs, mais de um caractere vira String, que é declarada com " " aspas duplas
*/