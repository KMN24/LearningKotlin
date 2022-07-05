package task.collections.task14

// task 14

/*

Задача 14.

listOf(1, 3, 3, 2, 4, 1)
       // missed operator
       .sum()
       .let { println(it) }//=6

 */

fun main(){
    println(task14())
    answer()
}

fun task14() =
    listOf(1, 3, 3, 2, 4, 1)
        // i don't know
        .sum()
        .let { println(it) }//=6

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .distinctBy { it % 3 }
        .sum()
        .let { println(it) }//6