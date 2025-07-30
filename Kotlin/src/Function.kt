//fun main() {
//    calculate()
//}
//
//fun calculate() {
//    for(i in 1..100) {
//        if(i%2 == 0) {
//            println("$i is divisible by 2")
//        }
//    }
//}

//Function with Int parameters
//fun main() {
//    calculate(1, 100, 3)
//}
//
//fun calculate(a: Int, b:Int, multipleOf: Int) {
//    for(i in a..b) {
//        if(i%multipleOf == 0) {
//            println("$i is the multiple of $multipleOf")
//        }
//    }
//
//
//}

//Function and Return Types
fun main() {
    val catAge = calculateCatAge(age = 12)
    println("this cat is $catAge years old")
}

fun calculateCatAge(age: Int ): Int {

    return age * 7
}