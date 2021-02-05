package homeWorks.hw_3

fun main(){
    var result :Int? = 0
    print("Введите первое число  ")
    var num1 = readLine()?.toInt()
    print("Введите второе число  ")
    var num2 = readLine()?.toInt()
    if (num1 != null && num2 != null) {
        result = num1 + num2
    }
    println("Ответ a+b = $result")
    //println("a+b = ${ num1!! + num2!! }")
    print("Введите первое число  ")
    num1 = readLine()?.toInt()
    print("Введите второе число  ")
    num2 = readLine()?.toInt()
    if (num1 != null && num2 != null){
        result = num1 - num2
    }
    println("Ответ a-b = $result")
}