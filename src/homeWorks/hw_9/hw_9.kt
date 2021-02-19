package homeWorks.hw_9

// task 1 - done

fun main() {
    // task 2

    for (i in 0..3){
        for (j in 0..4){
            print("* ")
        }
        println()
    }

    // task 3 - done

    // Дополнительное Задание
    // task 1

    println("Enter some number")
    //val number = readLine()!!.toCharArray()
    var num = readLine()!!.toInt()
    var temp = num
    var count = 0
    var k = true
    while (k){
        temp /= 10
        count++
        if (temp == 0)
            k = false
    }
    println("The number $num has $count digit")
    // код ниже закомментирован так, как в условии задачи было запрещено исп-ть оперции строк
//    for (i in number.indices){
//        if ( number[i].isDigit() )
//            count++
//    }
//    println("The number ${String(number)} has $count digit")

    // task 2

    var a = 2
    for ( i in 0..19){
        print("$a ")
        a*=2
    }
}