package homeWorks.hw_7

fun main(){
    println("Enter some number ")

    val a = readLine()!!.toInt()
    val message1 =
            if (a % 2 == 0){
                "a is even"
            }else if(a % 5 == 0){
                "a is divisible by 5"
            }else{
                "a is not even and not divisible by 5"
            }

    val message2 =
            when {
                a % 2 == 0 -> {
                    "a is even"
                }
                a % 5 == 0 -> {
                    "a is divisible by 5"
                }
                else -> {
                    "a is not even and not divisible by 5"
                }
            }
    println(message1)
    println(message2)
}

