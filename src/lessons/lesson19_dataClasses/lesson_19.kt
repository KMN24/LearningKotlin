package lessons.lesson19_dataClasses

data class Employee(val name: String, val surname: String, val age: Int, val experience: Int){


//    override fun equals(other: Any?): Boolean {
//        return this.name == (other as Employee).name
//    }
//
//    override fun toString(): String {
//        return "$name $surname $age $experience"
//    }

    // Но что если у нас будет очень много полей и все поля мы должны будем сравнивать, но это очень долго
    // Для этого придумали data classes
    // Просто перед классом должны добавить ключевое слово data

    // todo data класс сами переопределять все методы toString(), equals(), hashCode()
    //  data classes сначала будет смотреть поля(properties) и если значения полей будет равны то
    // для 2 объектов значения хэш-кодов будут одинаковыми
    // А как мы знаем equals() сравнивает по хэш-коду и объекты будут равны если поля будут одинаковыми

}

fun main(){

    val person1 = Employee("Asan", "Asanov", 24, 2)
    val person2 = Employee("Asan", "Asanov", 24, 2)

    println(person1.toString())
    println(person1.hashCode())
    println(person2.hashCode())
    println(person1.equals(person2)) // сравнивает по hash-коду  / true, если

    val person3 = person2.copy()
    // copy() - можем вызвать только если класс data class
    println(person3)

}