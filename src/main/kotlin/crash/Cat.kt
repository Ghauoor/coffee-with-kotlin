package crash

class Cat : Animal("Koko", 4) {
    fun meow() {
        println("MEOW!!!")
    }

    override fun makeSound() {
        println("MEOW")
    }
}