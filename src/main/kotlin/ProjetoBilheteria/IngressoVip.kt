package ProjetoBilheteria

class IngressoVip(valor: Double, var taxa: Double = 0.20): Ingresso(valor) {

    override fun imprimeValor(){
        println("O valor do ingresso e ${valor * (1 + taxa)}")
    }
}