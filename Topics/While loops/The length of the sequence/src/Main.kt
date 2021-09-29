import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    var count = 0
    while (scanner.hasNextInt()) {
        val temp = scanner.nextInt()
        if (temp != 0) count++ else println(count)
    }
}