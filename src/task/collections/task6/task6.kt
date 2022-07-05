package task.collections.task6

// task 6

/*

Задача 6.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .sum()
       .let { println(it) }//=8

 */

fun main(){
    println(task6())
}

fun task6() =
    listOf(1, 3, 3, 2, 4, 1)
        .filter { it in 2..3 }
        .sum()
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .filterIndexed { index, value ->
            index % 2 == 0
        }
        .sum()
        .let { println(it) }//=8