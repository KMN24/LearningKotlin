package task.collections.task4

// task 4

/*

Задача 4.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .average()
       .let { println(it) }//=2.5

 */

fun main(){
    println(task4())
}

fun task4() =
    listOf(1, 3, 3, 2, 4, 1)
        .dropWhile { it != 4 }
        .average()
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .distinct()
        .average()
        .let { println(it) }//=2.5