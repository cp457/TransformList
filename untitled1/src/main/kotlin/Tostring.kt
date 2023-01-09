fun main(){

    val list  = listOf<Int>(53,56,56,78).map { it.toString() }

    list.forEach{ it -> println("Items ${it}") }
}