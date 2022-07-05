package task.collections.task9

// task 9

/*

Задача 9.

listOf(1, 3, 3, 2, 4, 1)
       //missed operator
       .let { println(it) }//=kotlin.Unit

 */

fun main(){
    println(task9())
}

fun task9() =
    listOf(1, 3, 3, 2, 4, 1)
        .forEach {  }
        .let { println(it) }

fun answer() =
    listOf(1, 3, 3, 2, 4, 1)
        .forEach { }
        .let { println(it) }//=kotlin.Unit