package lessons.lesson18_classes

fun main() {

    val person = Person("Meder", "Kanatbekov", 20, "Bishkek")
    println(person.name) // Meder
    println(person.surname)
    println(person.age)
    println(person.address)


    val employee = Employee("Elon", "Musk", 40, "New-York", 20)
    employee.aboutMyself()

    // todo All classes in Kotlin inheritance from class Any

}
// чтобы наследоваться класс должен быть open
open class Person(val name: String, val surname: String, val age: Int){ // наш главный конструктор
    var address : String ?= null

//    var name : String = "John"
//    var surname : String = "Doe"
//    var age : Int = 24
//
//    init {// этот блок будет вызыватся каждый раз когда мы будем создавать наш экземпляр
//        this.name = name
//        this.surname = surname
//        this.age = age
//    }

    // можем сразу же сделать properties в главном конструкторе, для этого пишем перед параметрами var or val
    // Если не передадим значения на главный конструктор то выйдет ОШИБКА:  Primary constructor call expected

    constructor(name: String, surname: String, age: Int, address: String ): this(name, surname, age){
        this.address = address
    }

    // чтобы переопределять метод в нследованных классов нужно чтобы метод был open
    open fun aboutMyself(){
        println("I am ${this.name} ${this.surname}")
    }
}

class Employee(name:String, surname:String, age:Int, address:String, val experience: Int) : Person(name, surname, age, address){
    override fun aboutMyself() {
        println("My name is ${this.name}. I have ${this.experience}")
    }
}