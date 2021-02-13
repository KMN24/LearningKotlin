package lessons.lesson6

// when

fun main(){
    var score = 95
    when(score) {
        in 90..100 -> println("5")
        in 70..89 -> print("4")
        in 50..69 -> print("3")
        in 30..49 -> print("2")
        in 0..29 -> print("1")
        else -> print("score is invalid")
    }

    val a = 5
    val b =3

    val maxValue = when(a>b){
        true -> a
        false -> b
    }

    println("max value is $maxValue")

    when{
        3>2 -> println("3>2") // только эта часть сработает
        4>3 -> println("4>3")
    }
}