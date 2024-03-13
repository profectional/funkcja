import java.util.Scanner

class Person {
    var name: String = ""
    var age: Int = 0

    fun print() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    val p1 = Person()

    println("Enter person's name:")
    p1.name = scanner.nextLine()

    println("Enter person's age:")
    p1.age = scanner.nextInt()

    p1.print()
}
