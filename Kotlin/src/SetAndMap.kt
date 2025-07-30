fun main() {

                                          //Concept of  Set
//    | Feature                | `List`                                      | `Set`                                                          |
//    | ---------------------- | ------------------------------------------  | -------------------------------------------------------------  |
//    | **Duplicates Allowed** | ✅ Yes                                      | ❌ No (each element is unique)                                 |
//    | **Order Maintained**   | ✅ Yes (insertion order is preserved)       | ⚠️ Not necessarily (in `HashSet`)<br>✅ Yes in `LinkedHashSet` |
//    | **Access by Index**    | ✅ Yes (e.g., `list[0]`)                    | ❌ No (you can only iterate)                                   |
//    | **Use Case**           | When you need ordered data with duplicates  | When you need unique elements                                  |
//    | **Performance**        | Slightly slower lookup for large lists      | Faster lookup in `HashSet`


    //Immutable Set:
    val mySet = setOf("US", "MZ", "SS")
    println(mySet)
    for(i in mySet) {
        println(i)
    }

    //Mutable Set:
    val myMutableSet = mutableSetOf(1,3,4,5)
    myMutableSet.add(123)
    println(myMutableSet)
    for(i in myMutableSet) {
        println(i)
    }

                                          //Concept Of Map
    //Pair of key and value

    //Immutable Map:
    val  secretMap = mapOf("Up" to 1, "Down" to 2, "Left" to 3, "Right" to 4)
    println(secretMap)
    if("Up" in secretMap) println("Yes is in!")
    if(4 in secretMap.values) println("Yes is in!")

    //Mutable Map:
    val myMutableSecretMap = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3, "Four" to 4)
    myMutableSecretMap["Five"] = 5  //Adding new pair
    println(myMutableSecretMap)


    //We can add, remove and update key-value pair in mutable map


}