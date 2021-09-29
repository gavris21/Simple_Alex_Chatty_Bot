import java.lang.Math.abs
import java.util.*

fun main() {
    // write your code here
    val scan1 = Scanner(System.`in`)
    val (x1, y1, x2, y2) = Array(4) { scan1.nextInt() }
    val dx = abs(x2 - x1)
    val dy = abs(y2 - y1)
    if (dx == dy || x1 == x2 || y1 == y2) println("YES") else println("NO")
}