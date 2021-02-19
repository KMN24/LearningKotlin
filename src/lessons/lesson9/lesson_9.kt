package lessons.lesson9
// todo Loops
fun main() {

    val names = arrayListOf("Kotlin", "Java", "Dart")

    for ( i in 0 until names.size){ // [0, 3)
        println(names[i])
    }

    for (x in names){ // x - будут значения names
        println(x)
    }

    names.forEach{ println( it ) }

    names.forEachIndexed {index, name ->
        println("$index $name")
    }

    for ( i in 0..10 step 2){
        print("$i ") // 0 2 4 6 8 10
    }

    println()

    for ( i in 10 downTo 0 step 3){
        print("$i ") // 10 7 4 1
    }
    println()

    for(i in 0..10){
        if(i == 6){
            continue
            println("Hmm") // этот код не сработает, ПОСЛЕ continue ничего не сработает, переходит к сле-у итератору
        }
        print("$i ") // 0 1 2 3 4 5 7 8 9 10
    }
    println()

    for (i in 0..10){
        if(i == 5){
            break
        }
        print("$i ") // 0 1 2 3 4
    }
    println()

    // WHILE

    var j =0
    while( j < 10){
        print("$j ") // 0 1 2 3 4 5 6 7 8 9
        j++
    }
    println()

    // do-while

    j=0
    do {
        print("$j ") // 0 1 2 3 4 5 6 7 8 9
        j++
    }while (j<10)

    println()

    do {
        print("Hello") // Hello
    }while (false) // do-while все равно сработает 1 раз даже если условие false



    var sum = 0
    rowLoop@ for ( row in 0 until 8){ // @ - маркер ( маркировка )
        columnLoop@ for (column in 0 until  8){
            if (row == column){
                continue@rowLoop
            }
            sum += row * column
        }

    }
    println("sum = $sum")

}