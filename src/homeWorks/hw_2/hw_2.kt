package homeWorks.hw_2

fun main(){
    println("Enter your name and surname")
    val (name, surname) = readLine()!!.split(' ' ) // !! this operator use for NPE(NullPointerException).
    print("$name $surname")
}

