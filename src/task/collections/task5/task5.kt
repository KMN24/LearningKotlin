package task.collections.task5

// task 5

/*

Задача 5.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .average()
       .let { println(it) }//=8.0

 */

fun main(){
    println(task5())
    answerByAnotherUsersFromHabr()
}

fun task5() =
    listOf(1, 3, 3, 2, 4, 1)
        .map { 8 }
        .average()
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .map { 8 }
        .average()
        .let { println(it) }//=8.0

fun answerByAnotherUsersFromHabr() =
    listOf(1, 3, 3, 2, 4, 1)
        .runningReduce { acc, e -> acc + e }
        .average()
        .let { println(it) }//=8.0

// running reduce
// 1, 4, 7, 9, 13, 14
// average -> 48
// 48 / 6 -> 8.0