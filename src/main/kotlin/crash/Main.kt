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

    val numberOne = readLine() ?: "0"
    val numberTwo = readLine() ?: "0"

    // Bad practice
    // val result = numberOne!!.toInt() + numberTwo!!.toInt()

    //Better way
    val result = numberOne.toInt() + numberTwo.toInt()
    print(result)


}
