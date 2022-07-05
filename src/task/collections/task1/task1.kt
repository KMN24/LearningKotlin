package task.collections.task1

// task 1

/*

Задача 1.
listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .let { println(it) }//=6

 */

fun main(){
    println(task1())
}

fun task1() =
    listOf(1, 3, 3, 2, 4, 1)
        .filter { it == 3 }
        .sum()
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .count()
        .let { println(it) }//=6