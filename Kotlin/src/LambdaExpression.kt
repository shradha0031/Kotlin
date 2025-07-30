//Lambda - A function without a name
//lambda expression is basically a shorter  way of describing a function
//Example:
//        val sum: (Int, Int) -> Int = {a, b -> a +b}

fun  main() {
//    println(sum(12, 12))
//    println(add(12, 10))
    println(catAge(3))

    name("Shraddha")
}

fun sum(a:Int, b:Int): Int {
    return a + b     // This is function
}

// val lambdaName : Type = { ParameterList -> codeBody }
val  add: (Int, Int) -> Int = {a, b -> a+b}  // this is a Lambda expression for the same above function

fun calculaterAgeOfCat(age: Int ): Int {
    return age * 7
}

//val CatAge: (Int) -> Int = {age -> age* 7}

//Use of "it" lambda Keyword
//If your  lambda take one parameter, you don't need to explicitly name it- kotlin automatically provides"it" as the name.
//Syntax:
//val lambda = {it * 2}

val catAge: (Int) -> Int = {it * 7}

//Lambda Expression that Return Unit-Void
val name: (String) -> Unit = {print(it)}