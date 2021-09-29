fun main() {
    // put your code here
    val sum = Array(3) { readLine()!!.toInt() }.let {
        it[0] / 2 + it[0] % 2 + it[1] / 2 + it[1] % 2 + it[2] / 2 + it[2] % 2
    }
    println(sum)
}