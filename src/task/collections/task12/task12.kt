package task.collections.task12

// task 12

/*

Задача 12.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .sum()
       .let { println(it) }//=29

 */

fun main(){
    println(task12())
}

fun task12() =
    listOf(1, 3, 3, 2, 4, 1)
            // I don't know
        .sum()
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .mapIndexed { index, value ->
            index + value
        }
        .sum()
        .let { println(it) }//=29