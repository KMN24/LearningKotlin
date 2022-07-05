package task.collections.task10

// task 10

/*

Задача 10.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .sum()
       .let { println(it) }//=15

 */

fun main(){
    println(task10())
}

fun task10() =
    listOf(1, 3, 3, 2, 4, 1)
            // I don't know how to solve the problem
        .sum()
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .indices // берет индексы
        .sum()
        .let { println(it) }//=15