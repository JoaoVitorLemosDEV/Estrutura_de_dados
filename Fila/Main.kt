fun main() {
    var fila: Enfileiravel = FilaEstatica()
    fila.enfileirar("J");
    println("Frente: ${fila.frente()}")	
    fila.enfileirar("O")
    fila.enfileirar("A")
    fila.enfileirar("U")
    fila.desenfileirar()
    fila.enfileirar("O")
    val conteudo = fila.desenfileirar()
    fila.enfileirar("V")
    println("Frente: ${fila.frente()}")
    fila.enfileirar(conteudo)				
    println("Fila=${fila.imprimir()}")
}