package homeWorks.hw_10

fun main() {
    // task 1 - done

    val itemCosts = mapOf("Хлеб" to 50.0, "Milk" to 30.0, "Egg" to 10.0)
    val shoppingList = listOf("Хлеб", "Milk", "Egg")

    var totalCost  = 0.0
    for (item in shoppingList) {
        val itemCost = itemCosts[item]
        if (itemCost != null) {
            totalCost += itemCost
        }
    }

    println("Стоимость покупки $totalCost")

    // task 3 - done

}