fun main() {
    val amount = 1000
    when (amount) {
        in 1..100 -> println("this amount is between 1 and 100")
        !in 1 .. 100 -> println("this  is out of range")
        999 -> println("Really close")
        1000 -> println("Rich but not there")
        1100 -> println("You have made it")
        else -> {
            println("$amount is just not going to work")
        }
    }
}