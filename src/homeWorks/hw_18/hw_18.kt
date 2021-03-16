package homeWorks.hw_18

// task - 1 - легкое сделал устно

// task - 2

class Cat {
    var name : String ?= null
    var age = 0
    var fullLevel = 0
    var waterLevel = 0

    fun aboutCat(){
        println("name: $name \nage: $age \nуровень сытости: $fullLevel \nуровень воды: $waterLevel")
    }

    fun changeData(newFullLevel : Int , newWaterLevel: Int){
        this.fullLevel = newFullLevel
        this.waterLevel = newWaterLevel

        println("new full level: $fullLevel \nnew water level: $waterLevel")
    }
}

fun main(){
    val cat = Cat();
    cat.name = "Tom"
    cat.age = 5
    cat.fullLevel = 3
    cat.waterLevel = 2
    cat.aboutCat()

    cat.changeData(2, 1)

}