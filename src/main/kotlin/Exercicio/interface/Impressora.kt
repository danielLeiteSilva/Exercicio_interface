package Exercicio.`interface`

class Impressora(var listaImprimida: MutableList<Imprimivel>) {


    fun adicionaLista(imprime: Imprimivel){
        listaImprimida.add(imprime)
    }

    fun imprimirLista(){
        for(imp in listaImprimida){
            imp.imprimir()
        }
    }

}