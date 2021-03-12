package lessons.lesson17

fun main(){
    sayHello("Kotlin", 3)
    sayHello("Java")
    sayHello()
    sayHello(name = "Dart")
    sayHello(reps = 4)
    sayHello(name = "python", reps = 5)
    val max = getMax(5, 6)
    println(max)

    //printIntsArr(1,2,3) // так нельзя если в качестве параметра нету vararg
    //printIntsArr(arrayOf(1,2,3)) // можно мы создаем новый массив
    printIntsArr(1,2,3)
}
fun printIntsArr(vararg ints: Int){
//fun printIntsArr(ints: Array<Int>){
    for (i in ints) println(i)
}

fun sayHello(name: String = "Kotlin", reps: Int = 1){ // значение по умол-ю
    var counter = reps // Мы не можем изменить значение reps так, как reps - immutable
    while (counter > 0){
        println("Hello $name. How are you?")
        counter--
    }
}

fun getMax(num1: Int, num2: Int): Int{
    return if (num1 > num2)
        num1
    else num2
}
