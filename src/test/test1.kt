package test

fun main() {

    var i : Int = 42


    val a : String ?= null
    val b = "Hello "

    println(a == b)

val l : Long = "42".toLong()

    //val l2 : Long = (Long)"42"
    //val l3 : Long = Long.parseLong("42")

    // var number : Float = 45 // 45F

    val test = 33 to 42
    println(test) // (33, 42) pair

    val list1 = mutableListOf(1, 2, 3)
    val list2 = list1.add(4)
    println(list2) // true

}