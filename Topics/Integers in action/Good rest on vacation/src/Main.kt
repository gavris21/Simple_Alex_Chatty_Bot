fun main() {
    // put your code here
    val sum = Array(4) { readLine()!!.toInt() }.let { it[0] * it[1] + it[2] * 2 + (it[0] - 1) * it[3] }
    println(sum)
}