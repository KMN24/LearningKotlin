package task.collections.task11

// task 11

/*

Задача 11.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .first()
       .let { println(it) }//=java.util.NoSuchElementException

 */

fun main(){
    println(task11())
}

fun task11() =
    listOf(1, 3, 3, 2, 4, 1)
        .drop(6)
        .first()
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .take(0)
        .first()
        .let { println(it) }//=java.util.NoSuchElementException