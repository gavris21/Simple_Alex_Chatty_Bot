import java.util.*

fun main() {
    // put your code here
    var sum = 0
    val scanner = Scanner(System.`in`)
    do {
        val temp = scanner.nextInt()
        sum += temp
    } while (temp != 0)
    /*while (scanner.hasNextInt()) {
        val temp = scanner.nextInt()
        sum += temp
        if (temp == 0) println(sum)
    }*/
    println(sum)
}