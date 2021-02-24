package homeWorks.hw_11

fun main() {

    val names = arrayOf("KG", "RU", "USA", "TR")
    val codes = arrayOf("+996", "+7", "+1", "+98")

    var myMap: HashMap<String, String> ?= null

    myMap = hashMapOf()

    for ( i in names.indices){
        myMap?.put(names[i], codes[i])
    }
    myMap?.let {
        println(it)
    }
}


