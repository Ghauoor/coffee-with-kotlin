package crash

abstract class Animal(val name: String, val legCount: Int) {
    init {
        println("Hello My Name is $name")
    }

    abstract fun makeSound()

}