package task.collections.task8

// task 8

/*

Задача 8.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .let { println(it) }//=null

 */

fun main(){
    println(task8())
}

fun task8() =
    listOf(1, 3, 3, 2, 4, 1)
        .find { it == -1 }
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .getOrNull(7)
        .let { println(it) }//=null