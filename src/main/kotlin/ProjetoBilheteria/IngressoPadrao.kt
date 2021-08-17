package ProjetoBilheteria

class IngressoPadrao(valor: Double):Ingresso(valor) {
    override fun imprimeValor(){
        println("O valor do ingresso padrao é $valor")
    }
}