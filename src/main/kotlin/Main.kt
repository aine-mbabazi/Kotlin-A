fun main() {
//    val friends = arrayOf("Ben", "Paul", "Ken", "Mary", "Susan")
//    println(friends.contentToString())
//        println(friends[2])
//
//    val nums = arrayOf(1,2,3,4,5)
//    val data:Array<Any> = arrayOf("Kenya", 5100, true,4.5, 7.2F,479272917996719)
//    println(nums.contentToString())
//    println(data.contentToString())
//
////    doSomething(data)
//    println(friends[3])
//    println(friends.get(3))
//    println(friends.slice(1..3))
//
//    friends.set(1, "Nancy")
//    println(friends.contentToString())
//
//    friends[1] = "Nancy"
//    println(friends.contentToString())
//
//
////nullifying variables: applies to all data types
//
//    var x:Int? = 5
//    x = null
//    println(x)
//
//
//
//    var d :Int? = null
//    x = 5
//    println(x)

//    How to create an array of arrays

//    val numbers = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6))

//    adding an element to an array
    var friends = arrayOf("Ben", "Paul", "Ken", "Mary", "Susan")
    friends = friends.plus(arrayOf("Natalie","Gitahi","Gatwer"))
    println(friends.contentToString())

//    Array Indexing: used to find an index of an element in an array.
//    will print ouf -1 if the element does not exist
    var friend = arrayOf("Ben", "Paul", "Ken", "Mary", "Susan")
    println(friend.indexOf("Ken"))
    println(friend.indexOf("ken"))

//Inbuilt Array functions
val statistics = arrayOf(21,14,56,18,9,32,5,6,32,67,88,43)
    println(statistics.maxOrNull())
    println(statistics.min())
    println(statistics.minOrNull())
//    how to know the number of elements in an array
    println(statistics.count())
//    .size is an attribute /property while .count is a function
//    length property does not exist in arrays.

//    how to find average of the array
    println(statistics.average())

//    OR(This returns an Int because the division between Ints
   println(statistics.sum()/statistics.count())

// sorting in Arrays(Arranging in order)(can only sort if the elements of the array is reassigned/ if not it will be
//    sorted in memory but not printed out.
    var adalab = arrayOf("Patricia","Pearl","Gloria","Hannah")
    adalab = adalab.sortedArray()
    println(adalab.contentToString())

//    Looping through array
//    There are different ways of looping
//
    adalab= arrayOf("Patricia","Pearl","Gloria","Hannah")
    adalab.forEach { f ->
        println(f)
//        The above method is called "for each", the "f" is a variable and can be changed according to preference

    }
    statistics.forEach { t->
    println(t*t)
    }


//    for each function using indices
    adalab.forEachIndexed{idx, f ->
//        if (idx==1 || idx==2)

            println(f)
    }

//    Fore loop looping
    for (f in adalab){
        println(f)
    }
    for (t in statistics){
        println(t*t)
    }

//    creating emoty array
    var arr = Array(5){""}
    arr[0]= "Hi"
    arr[1]="world"
    arr[2]="Keep"
    arr[3]="Happy"
    println(arr.contentToString())

}

//fun myFriends(friends:Array<String>){
//    val friends = arrayOf("Ben", "Paul", "Ken", "Mary", "Susan")
//    println(friends.contentToString())
//    println(friends[2])
//}
//fun doSomething(arr:Array<Any>){
//
//}
//A function that takes in the names of my friends and returns  names with 3 letters
