package homeWorks.hw_5

// todo task1 - done

fun main() {
    //task 2
    println("Введите четырехзначное число")
    val num = readLine()?.toInt() ?: 0
    var sumOfFirsTwoDigits = 0
    var sumOfLastTwoDigits = 0

    sumOfFirsTwoDigits = num / 1000 + num % 1000 / 100
    sumOfLastTwoDigits = num % 100 / 10 + num % 10

    if (sumOfFirsTwoDigits == sumOfLastTwoDigits)
        println(true)
    else
        println(false)

    // todo Дополнительная Задание
    println("Введите ваш возраст")
    val age = readLine()?.toInt() ?: 0

    if (age in 2..199) {
        if (age in 5..19 || age in 105..119 ) {
            print("$age лет")
            return
        }
        when (age % 10) {
            1 -> println("$age год")
            in 2..4 -> println("$age года")
            0, in 5..9 -> print("$age лет")
        }

    } else
        println("Возраст не входит в диапозон 1<age<200")
}