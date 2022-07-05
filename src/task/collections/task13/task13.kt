package task.collections.task13

// task 13

/*

Задача 13.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .sum()
       .let { println(it) }//=27

 */

fun main(){
    println(task13())
    answer()
}

fun task13() =
    listOf(1, 3, 3, 2, 4, 1)
        // i don't know
        .sum()
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .flatMap { 0.rangeTo(it) }
        .sum()
        .let { println(it) }//=27