fun main() {
    val myNewList = mutableListOf<String>()
    myNewList.add("Hey")
    myNewList.add("There")
    for(i in 1..10){
        myNewList.add(i, "Hey $i")
    }
    println(myNewList)
}