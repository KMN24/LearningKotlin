package homeWorks.hw_19

// task 1 - сделал устно, так как было легко

// task - 2

fun main() {
    val book1 = Book("Самурай без меча", "Китами Масао", 2005)
    val book2 = Book("Богатый Папа, Бедный Папа", "Роберт Кийосаки", 1997)

    val book3 = book1.copy()

    book3.title = "Квадрант денежного потока"
    book3.year = 1998

    println(book1)
    println(book2)
    println(book3)
    println(book2) // book3 doesn't change values of book2

    println(book1 == book2) // false - cause hashcodes aren't equals
    println(book1 == book3) // false
}

data class Book(var title : String, var author: String, var year: Int) {

}
