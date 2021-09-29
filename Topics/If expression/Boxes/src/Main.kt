import java.util.*

fun main() {
    // write your code here
    val scan1 = Scanner(System.`in`)
    val ar1 = Array(3) { scan1.nextInt() }
    val ar2 = Array(3) { scan1.nextInt() }
    ar1.sort()
    ar2.sort()
    if (ar1[0] == ar2[0] && ar1[1] == ar2[1] && ar1[2] == ar2[2]) println("Box 1 = Box 2") else {
        if (ar1[0] <= ar2[0] && ar1[1] <= ar2[1] && ar1[2] <= ar2[2]) println("Box 1 < Box 2") else {
            if (ar1[0] >= ar2[0] && ar1[1] >= ar2[1] && ar1[2] >= ar2[2]) println("Box 1 > Box 2") else {
                println("Incomparable")
            }
        }
    }
    val a = if (true) 125 else { if (true) println() else '1'}
    if (true) println() else { if (true) println()}


}