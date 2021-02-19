package lessons.lesson8

// todo Array and Array List

fun main() {
    val arr = Array(5){0} // у 5 элементов изначальные элементы будут 0
    val arr2 = arrayOf(1,2,3,4,5,6,7)
    val numbers = Array(3, {5}) // [5, 5, 5]
    // Здесь размеры константные

    arr[0] = 1
    arr[1] = 2
    arr[2] = 3
    arr[3] = 4
    arr[4] = 5

    for( x in arr){
        println(x)
    }

    for (x in arr2){
        print("$x ")
    }
    println()

    // Array List

    val arrayList = ArrayList<Int>() // Пустой array list
    val arrayList3 = arrayListOf<String>() // Пустой array list
    val arrayList4 = arrayListOf<Any>("C++", "C#") // Первоначальные элементы


    println(arrayList.size) // 0
    arrayList.add(10) // added a new element to the array list
    println(arrayList[0]) // 10
    println(arrayList.get(0)) // 10

    val arrayList2 = ArrayList<String>()
    arrayList2.add("Kontlin")
    arrayList2.add("Java")
    arrayList2.add("Dart")

    println(arrayList2) // [Kontlin, Java, Dart]

    arrayList2.add(1, "Python") // Добавили Python в 1 индекс, -> [Kontlin, Python, Java, Dart]
    arrayList2.set(0, "J") // set - просто перезаписывает новое значение в индексе 0 -> [J, Python, Java, Dart]

    println(arrayList2)

    arrayList2.remove("Java") // Нужно писать сам элемент а не индекс



}