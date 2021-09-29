import java.util.*
import kotlin.math.abs

fun main() {
    // write your code here
    val scan1 = Scanner(System.`in`)
    val (x1, y1, x2, y2) = Array(4) { scan1.nextInt() }
    val dx = abs(x2 - x1)
    val dy = abs(y2 - y1)
    if (dx == 2 && dy == 1 || dx == 1 && dy == 2) println("YES") else println("NO")
}