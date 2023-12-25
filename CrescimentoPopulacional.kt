data class Pais(val habitantes: Double, val taxaCrescimento: Double) {
  fun crescerPopulacaoAnual(): Double { 
    return habitantes * taxaCrescimento
    }
}

fun main() {
    val habitantesPaisA = readLine()!!.toDouble()
    val habitantesPaisB = readLine()!!.toDouble()
    val taxaCrescimentoPaisA = 3.0
    val taxaCrescimentoPaisB = 1.5

    var anos = 0
    var popA = habitantesPaisA
    var popB = habitantesPaisB

    while (popA < popB) {
        popA += popA * (taxaCrescimentoPaisA / 100)
        popB += popB * (taxaCrescimentoPaisB / 100)
        anos++
    }

    println("$anos anos")
}
