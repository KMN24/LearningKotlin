package homeWorks.hw_17

import kotlin.math.pow

fun main(){
    /*      Tasks
    1)  	Проделать все примеры что были в уроке
    2)	    Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
            Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
            Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
    3)  	Изучить функций в Kotlin
     */

    // task 1 - done

    // task 2
    // Существует формула для начисления сложного процента:
    //S=A*(1+R)^T
    //A- СУММА ВКЛАДА;
    //R- СТАВКА ПРОЦЕНТА;
    //T- КОЛИЧЕСТВО ПЕРИОДОВ;
    //S- ПОЛУЧАЕМАЯ СУММА.

    println("Enter amount and percent")
    val (amount, percent) = readLine()!!.split(' ')
    val s= deposit(amount.toDouble(), percent.toDouble())
    println(s)

    // task 3 - done

}

fun deposit(amount : Double, percent : Double ): Double{
    val rate = percent / 100.0
    return amount * (1.0 + rate).pow(3)
}
