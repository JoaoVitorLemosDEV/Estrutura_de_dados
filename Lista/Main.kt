fun main() {
    var lista = ListaEstaticaCircular()
    lista.anexar("A")  
    lista.anexar("B")   
    lista.inserir(2,"C")
    println("${lista.imprimir()}") 
    lista.anexar("D")   
    lista.apagar(0) 
    lista.inserir(0,"E")   
    lista.inserir(2,"F");	
    println("${lista.imprimir()}") 
    println("${lista.selecionar(1)}") 
    lista.atualizar(1,"G")
    println("${lista.imprimir()}")  
}