/*
AULA 8

usar um interface gráfica, usando  diálogo

JOptionPane = classe do javax usada para criar diálogo simples

showImputDialog() - método estático chamado diretamente pela classe, não cria objetos
com ele que aparece uma caixaciza com a mensagem desejada, local para digitar,
btn(botton)  de ok ou cancelar

*/


import  javax.swing.JOptionPane

fun main (args: Array<String>) {
    //a variável nome irá chamar a classe JOptionPane, dela o metodo showImputDialog

    val nome = JOptionPane.showInputDialog("Digite seu nome: ") // mostra no terminal

    val saidabox = String.format("%s %s","Aqui entra no %s", nome)

    // aqui mostra nome no terminal
    println(nome)

    // mostra a mensagem em uma caixa de diálogo
    JOptionPane.showMessageDialog(null,saidabox)
}