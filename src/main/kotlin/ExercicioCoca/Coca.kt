package ExercicioCoca

class Coca(var tamanho: Int, var preco: Double) {

    override fun equals(other: Any?): Boolean {
        return (other is Coca && other.tamanho == tamanho)
    }

    override fun toString(): String {
        return "$tamanho $preco"
    }

    override fun hashCode(): Int {
        return tamanho;
    }
}