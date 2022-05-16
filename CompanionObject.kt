package Fundamentals

class ContaPoupanca(var name: String, var agencia: Int, var conta: Int){
    companion object{
        fun createDefaultCP(): ContaPoupanca{
            return ContaPoupanca("Individuo", 123, 222)
        }
    }


    override fun toString(): String {
        return "name: ${name}, agencia: ${agencia}, conta: ${conta}"
    }

}

class ContaCorrente(var name: String, var agencia: Int, var conta: Int){
    companion object{
        fun createCCByCP(referenceCP: ContaPoupanca): ContaCorrente{
            return ContaCorrente(referenceCP.name, referenceCP.agencia, referenceCP.conta)
        }
    }

    override fun toString(): String {
        return "name: ${name}, agencia: ${agencia}, conta: ${conta}"
    }

}

fun main(){
    // with companionObject I can use the method before stance (like java static methods)
    // without companionObject I can't because it's necessary to past the parameters
    val jonesAccount = ContaPoupanca.createDefaultCP()
    val jayAccount = ContaCorrente.createCCByCP(jonesAccount)
    println(jayAccount)
    println(jonesAccount)
}
