import kotlin.math.abs

const val CONST_TEN = 10
// write your code here
fun getLastDigit(l: Int): Int {
    return abs(l % CONST_TEN)
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}