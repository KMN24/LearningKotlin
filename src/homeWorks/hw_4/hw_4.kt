package homeWorks.hw_4

import kotlin.math.pow
import kotlin.math.sqrt


// TODO task1 - done
// https://github.com/KMN24/LearningKotlin.git

fun main(){
    //TODO task2
    var a :Float? = 0.0F
    var b :Float? = 0.0F
    var c :Float?= 0.0F
    println("ax^2 + bx + c = 0\nEnter a, b and c:")
    a = readLine()?.toFloat() ?: 0.0F
    b = readLine()?.toFloat() ?: 0.0F
    c = readLine()?.toFloat() ?: 0.0F
    var x1 : Float
    var x2 : Float
    var discriminant = b.pow(2) - 4 * a * c
   if (discriminant > 0 ){
       x1 = (-b - sqrt(discriminant)) / (2*a)
       x2 = (-b + sqrt(discriminant)) / (2*a)
       println("The roots: x1 = $x1, x2 = $x2")
   }
    else if (discriminant.toInt() == 0){
       x1 = -b / (2*a)
       println("The root x1 = $x1")
   }
    else{
       println("There aren't roots")
   }


    // TODO task 3 - done

    // TODO Дополнительное задание
    //TODO task 1

    println("Enter the start hour ")
    val h1 = readLine()?.toInt() ?: 0
    println("Enter the start minute ")
    val m1 = readLine()?.toInt() ?: 0
    println("Enter the arrived hour ")
    val h2 = readLine()?.toInt() ?: 0
    println("Enter the arrived minute ")
    val m2 = readLine()?.toInt() ?: 0

    val hourToMin = (h2 - h1) * 60
    var min = 0
    min = if (hourToMin != 0){
        60 - m1 + m2 - 60
    } else{
        m2 - m1
    }
    min += hourToMin
    println("Время пути в минутах = $min")

    // TODO Task2
    println("Enter the first number")
    var num1 = readLine()?.toInt() ?: 0
    println("Enter the second number")
    var num2 = readLine()?.toInt() ?: 1
    var temp = num1
    num1 = num2
    num2 = temp
    println("First number is $num1")
    println("Second number is $num2")
}

