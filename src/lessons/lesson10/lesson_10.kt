package lessons.lesson10
// todo Структура данных Map и Set

fun main() {
    val arrayList = arrayListOf("12345", "onepunchman_01", "John")

    // Map

    val hashMap = hashMapOf<String, String>() // Key, Value

    hashMap.put("password", "12345")
    hashMap.put("username", "onepunchman_01")
    hashMap.put("name", "John")

    println(hashMap) // {password=12345, name=John, username=onepunchman_01}
    println(hashMap.entries) // [password=12345, name=John, username=onepunchman_01]
    println(hashMap.get("password")) // 12345

    hashMap.remove("name")

    println(hashMap.entries) // [password=12345, username=onepunchman_01]

    hashMap.put("password", "qwerty")
    hashMap.put("username", "kanatbekov")
    // Значения просто перепишутся если ключи совподаются
    println(hashMap.entries) //  [password=qwerty, username=kanatbekov]

    // Set - хранит себе только уникальные значения и еще отсортированные по естественному порядку

    val hashSet = HashSet<Int>() // Value
    hashSet.add(1)
    hashSet.add(1)
    hashSet.add(3)
    hashSet.add(3)
    hashSet.add(2)

    println(hashSet) // [1, 2, 3]

    val arrayList2 = arrayListOf(1,1, 3,2,3,3,3,4,4,5,5)
    hashSet.addAll(arrayList2)

    println(hashSet) // [1, 2, 3, 4, 5] все дубликаты исчезнут



}