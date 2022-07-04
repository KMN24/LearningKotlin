package temp.high_order_functions

fun main(){

    val invoker : (Int) -> String = { number ->
        number.toString()
    }

    val invoker2 : (Int) -> String

    val numberAsString = invoker(14)

    invoker2 = {
        (it + 10).toString()
    }

    println(invoker2(15))



    println(numberAsString)

}