fun main(){
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(decorations.filter{it[0] == 'p'})

    val eager = decorations.filter { it[1] == 'l' }
    println("eager: $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("first: ${lazyMap.first()}")

    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter { it[1] == 'l' }.map() {
        println("access: $it")
        it
    }

    println("all: ${lazyMap2.toList()}")

}