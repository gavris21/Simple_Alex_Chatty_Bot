import java.util.*

fun main() {
    // put your code here
    var largest = Int.MIN_VALUE
    var pos = Int.MIN_VALUE
    var count = 0
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt()) {
        val temp = scanner.nextInt()
        count++
        if (temp > largest) {
            largest = temp
            pos = count
        }
    }
    print("$largest $pos")
}