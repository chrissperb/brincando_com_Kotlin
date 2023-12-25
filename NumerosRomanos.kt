fun main() {
  val numeroRomano: String? = readLine()
  
  val numerosRomanos = mapOf(
      'I' to 1,
      'V' to 5,
      'X' to 10,
      'L' to 50,
      'C' to 100,
      'D' to 500,
      'M' to 1000
  )
  
  // Inicia a variável que recebe o valor final.
  var resultado: Int = 0
  
    
    // Recrieir a função inicial `for` colocando um `?.let` para evitar rodar o bloco caso o valor dado seja nulo.
    numeroRomano?.let {
        // Criei um novo laço de repetição da variavel $numeroRomano.
        for (i in it.indices) {
            // Criei as duas variáveis para o cálculo dos números: o que está sendo "traduzido" e o próximo, já add a regra de verificação do próximo.
            val atual = numerosRomanos.getValue(it[i])
            val proximo = if (i + 1 < it.length) numerosRomanos.getValue(it[i + 1]) else 0

            // Esta linha calcula o valor do número romano para adicionar ou subtrair ao resultado.
            resultado += if (atual < proximo) -atual else atual
        }
    }
  
  print(resultado)
}
