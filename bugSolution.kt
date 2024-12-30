fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val itemsToRemove = listOf(3, 4, 5)
    list.removeAll(itemsToRemove)
    println(list) // Output: [1, 2]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.retainAll { it <=2 }
    println(list2) // Output: [1, 2]

    val list3 = mutableListOf(1, 2, 3, 4, 5)
    list3.removeIf { it > 2 }
    println(list3) // Output: [1, 2]
    
    //More robust example
    val list4 = mutableListOf(1,2,3,4,5)
    val predicate = { it: Int -> it % 2 == 0 }
    val evenNumbers = list4.filter(predicate)
    list4.removeAll(evenNumbers) 
    println(list4) //Output: [1,3,5] 
}