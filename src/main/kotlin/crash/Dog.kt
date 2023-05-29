package crash

class Dog : Animal("Zoro", 4) {
    fun bark() {
        println("WUFF!!!")
    }

    override fun makeSound() {
        println("WUFF")
    }
}