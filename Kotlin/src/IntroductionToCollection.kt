//Concept of List

fun main() {

    //1-this is immutable list:
    val myListOfName = listOf("Shraddha", "Vandana", "Dolly", "Tanu")

    //printing the whole list as it is:
    println(myListOfName)

    //printing list members:
    for(i in myListOfName){
        println(i)
    }

    //2-this is mutable list:
    val myMutableList = mutableListOf(12,34,45,123)

    //adding element:
    myMutableList.add(214)
    println(myMutableList)

    //removing element:
    myMutableList.remove(214)
    println(myMutableList)

    myMutableList.removeAt(0)
    println(myMutableList)

    //printing whole list as it is:
    println(myMutableList)
    
    //printing list members :
    for(i in myMutableList) {
        println(i)
    }


}