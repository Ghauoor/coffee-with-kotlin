package crash

fun main() {
    var x: Int = 9
    print("The value of x is $x\n")
    x = 10
    print("The value of x now $x\n")

    val n: Int = 2
    //// Val cannot reassign
    //// Var can be reassigned
    //// n = 3

    val wholeNumber = 3;
    val amIAnAdult = true;
    val amIProgrammer = true;
    val amIAdultProgrammer = amIProgrammer && amIAnAdult
    val amIAdultOrProgrammer = amIProgrammer || amIAnAdult
    val amIAdultProgrammerCheck = (amIProgrammer != amIAnAdult)

    val string: String = "Kt is good"
    print(string.uppercase())

    val number = 3 + 1

    if (number == 2) {
        println("The $number is 2")
    } else if (number == 3) {
        println("The value of $number is 3")
    } else {
        println("Value of $number is neither 2 and 3")
    }

    val t = if (number == 3) 5 else 10

    // NULLS----------------------------------

    val nulls: Int? = null

//    val numberOne = readlnOrNull() ?: "0"
//    val numberTwo = readlnOrNull() ?: "0"

    // Bad practice
    // val result = numberOne!!.toInt() + numberTwo!!.toInt()

    //Better way
//    val result = numberOne.toInt() + numberTwo.toInt()
//    print(result)

    // Lists
    val shoppingList = listOf<String>("Rolex", "Lambo", "Jinnah House")
    println(shoppingList[0])

    // Mutable List
    val shoppingMutableList = mutableListOf<String>("BMW", "Mehran", "v8")
    shoppingMutableList.add("Ferrari")

    println(shoppingMutableList[3])

    // Loops
    var counter = 0;
    while (counter < shoppingList.size) {
        println(shoppingList[counter])
        counter++;
    }

    for (shoppingItem in shoppingMutableList) {
        println(shoppingItem)
    }

    // Loop with range

//    for (i in 1..100) {
//        println(i)
//    }

    // When Expression
    val a = 3
    when (x) {
        in 1..2 -> print("x is between one and two")
        in 3..10 -> print("x is between three and ten")
        else -> {
            println("x is not in the range")
        }
    }

    printNumber()
    val isEve = isEven()
    val isOdd = 3
    println(isOdd.isOdd())
    println(isEve)
    println()
}

// Functions
fun printNumber() {
    for (i in 1..10)
        println(i)
}

fun isEven(number: Int = 2): Boolean {
    return number % 2 == 0
}

// Extension  func
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}
