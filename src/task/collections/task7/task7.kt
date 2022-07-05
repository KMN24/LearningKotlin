package task.collections.task7

// task 7

/*

Задача 7.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .let { println(it) }//=72

 */

fun main() {
    println(task7())
}

fun task7() =
    listOf(1, 3, 3, 2, 4, 1)
        // i dont know
        .let { println(it) }

fun answer1() =
    listOf(1, 3, 3, 2, 4, 1)
        .fold(1) { acc, x -> acc * x }
        .let { println(it) }//=72

//or
fun answer2() =
    listOf(1, 3, 3, 2, 4, 1)
        .reduce { acc, x -> acc * x }
        .let { println(it) }//=72