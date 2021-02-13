package homeWorks.hw_6

import kotlin.math.pow

//task 1 -done

fun main(){

    // task 2
    println("Введите номер месяца")
    when(val month = readLine()?.toInt() ?: 0){
        1, 3, 5, 7, 8, 10, 12 -> println("Месяц $month - дней 31")
        2 -> println("Месяц $month - дней 28")
        4, 6, 9, 11 -> println("Месяц $month - дней 30")
        else -> println("Нету такого месяца")
    }

    // task 3 - done
    // todo Дополнительное задание

    println("Введите Х координату")
    val x = readLine()?.toFloat()
    println("Введите У координату")
    val y = readLine()?.toFloat()
    println("Введите радиус круга")
    val radius = readLine()?.toFloat()
    when{
        (x?.pow(2))!! + (y?.pow(2))!! <= radius!!.pow(2) -> println("Точки находятся внутри круга")
        else -> print("Точки не находтся внутри круга")
    }

}