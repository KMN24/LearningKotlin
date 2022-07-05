package task.collections.task3

// task 3

/*

Задача 3.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .sum()
       .let { println(it) }//=14

 */

fun main(){
    println(task3())
}

fun task3() =
    listOf(1, 3, 3, 2, 4, 1)
        .toList()
        .sum()
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .map { it }
        .sum()
        .let { println(it) }//=14