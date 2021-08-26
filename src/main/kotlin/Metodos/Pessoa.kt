package Metodos

class Pessoa(var nome:String, var rg: Int) {

    override fun equals(other: Any?): Boolean {
        return (other is Pessoa && this.rg == other.rg)
    }

    override fun toString(): String {
        return "${this.nome} [rg=${this.rg}]"
    }

    override fun hashCode(): Int {
        return this.rg
    }
}