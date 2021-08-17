package ProjetoBilheteria

import java.util.*

fun main(){

    val scan = Scanner(System.`in`)
    val valorPadrao: Double = 5.00
    do {
        println("""
        Qual o ingresso desejado?
        
        1 - Ingresso Padrao
        2 - Ingresso Vip
        3 - Sair
        
        """.
        trimIndent())
        println("Digite o a opcao: ")
        var resultado = 0

        when(scan.nextInt()){
            1 -> {
                val ingressoPadrao = IngressoPadrao(valorPadrao)
                ingressoPadrao.imprimeValor()
            }
            2 -> {
                val ingressoVip = IngressoVip(valorPadrao)
                ingressoVip.imprimeValor()
            }
            else -> {
                resultado = 0
                println("Saindo da bilheteria...")
            }
        }

    }while (resultado != 0)
    println("Saiu!")
}