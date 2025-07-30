fun main() {
    val amount = 1100
  if(amount == 1000) {
      println("You are wealthy")
  }
  else if(amount > 1000) {
      println("wow!...you are very wealthy")
  }
  else {
      println("You are getting by")
  }

  when (amount) {
      100 -> println("You have 100")
      125 -> println("You are getting there...")
      999 -> println("Really close")
      1000 -> println("Rich but not there")
      1100 -> println("You have made it")
      else -> {
          println("$amount is just not going to work")
      }
  }
}

