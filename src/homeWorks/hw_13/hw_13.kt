package homeWorks.hw_13
// task 1. Sorting with Bubble Sort
fun main(){
    var arr = arrayOf(10, 2, 10, 3, 1, 2, 5, 2, -1, 3)
    var temp : Int
    var isChanged = true
    println("The array before sorting")
    println(arr.contentToString())
    while( isChanged ){
        isChanged = false
        for(i in 0..arr.size - 2) {
            if (arr[i] > arr[i + 1])
            {
                temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i+1] = temp
                isChanged = true
            }
        }
        if ( !isChanged ){
            break
        }
    }
    println("The array after sorting")
    println(arr.contentToString())
}