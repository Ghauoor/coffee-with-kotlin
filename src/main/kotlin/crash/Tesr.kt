package crash

fun main() {
    val dog = Dog()
    dog.bark()
    val cat = Cat()
    cat.meow()

    //Anonymous Classes
    val bear = object : Animal("BearGills", 2) {
        override fun makeSound() {
            println("ROOAR!!!!!")
        }

    }
}
