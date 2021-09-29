import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    do {
        val temp = scanner.nextInt()
        if (max < temp && temp != 0) max = temp
    } while (temp != 0)
    println(max)
}