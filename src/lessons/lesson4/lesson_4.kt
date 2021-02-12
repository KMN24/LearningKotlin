package lessons.lesson4

fun main(){

    var a = 10
    var b = 3

    println("a+b = ${a+b}")
    println("a-b = ${a-b}")
    println("a*b = ${a*b}")
    println("a/b = ${a/b}")
    println("a%b = ${a%b}")

    println("some math operations =  ${ 2 + 2 * 3 }")
    a+=2
    println("a +=2 = $a")
    a-=2
    println("a -=2 = $a")
    a*=2
    println("a *=2 = $a")
    a/=2
    println("a /=2 = $a")
    a%=2
    println("a %=2 = $a")

    a=10
    println("a++ = ${a++}") // 10 - сначала возвращает число потом увеличивает
    println(a) // 11

    println("++a = ${++a}") // 12 - сначала увеличивается потом воз-ся
    println(a) // 12

    println("a-- = ${a--}") // 12 - сначала возвращает число потом умень-ся
    println(a) // 11

    println("--a = ${--a}") // 10 - сначала умен-ся потом воз-ся
    println(a) // 10

println("-a = ${-a}")





}