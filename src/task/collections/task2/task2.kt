package task.collections.task2

// task 2

/*

Задача 2.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .sum()
       .let { println(it) }//=5

 */

fun main(){
    println(task2())
}

fun task2() =
    listOf(1, 3, 3, 2, 4, 1)
        .dropWhile { it != 4 }
        .sum()
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .takeLast(2)
        .sum()
        .let { println(it) }//=5