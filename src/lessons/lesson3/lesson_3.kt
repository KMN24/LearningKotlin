package lessons.lesson3

fun main(){
    // TODO https://younglinux.info/kotlin/null-operators
    var text : String? = null

    //text = "Kotlin"
    // println(text)

    //TODO Safe call operator ( ?. )
    println(text?.length)

    // TODO Safe call with let ( ?.let )  - открывается лямбда ф-я
    // этот блок вызовится если переменная не null
    text?.let {
        println(it.length) // it - это у нас text. Внутри {} мы можем обращаться через it
    }

    // TODO Elvis operator ( ?: )
    /*
    Оператор, обозначаемый вопросительным знаком с двоеточием, подобен проверке на null в варианте if-else.
    Он возвращает значение слева от себя, если оно не null. И возвращает значение справа от себя, если то,
    что слева, – null.

    Оператор ?: используется для замены null, каким-либо значением, принадлежащим обычно зауженному типу.
    В результате выражение с "элвисом" позволяет не увеличивать в программе количество nullable-переменных.
     */

    val lengthOFText = if (text != null) {
        text!!.length // nullable assertion ( !! )
    }else{
        -1
    } // мы это все можем заменить Элвис оператором
    println(lengthOFText)
    text = "Hello"
    val lengthOfText2 = text?.length ?: -1
    println(lengthOfText2)

    // TODO Non null assertion ( !! ) - когда мы явно говорим что пере-я не null
    println(text!!.length) // мы уверены что пере-я не null
    // но если пере-я будет null то у нас выйдет ошибка NUllPointerException
    text = null
    try {
        println(text!!.length)
    }
    catch ( excep: NullPointerException){
        println("Вышла ошибка NullPointerException")
    }

    //TODO lateinit keyboard - это пред тем как использовать пере-ю мы говорим что обязательно присвоим ей значение
    lateinit var lateinitValue : String
    //println(lateinitValue.length) // выйдет ошибка UninitializedPropertyAccessException: lateinit property
    // потому что мы не проинициализировали переменную
    try {
        println(lateinitValue.length)
    }
    catch ( excep: UninitializedPropertyAccessException){
        println("Вышла ошибка UninitializedPropertyAccessException")
    }
    lateinitValue = "Java"
    println(lateinitValue.length) // вот здесь не выйдет ошибка так как мы добавили значение



}