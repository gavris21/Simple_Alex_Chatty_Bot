fun main() {
    // put your code here
    val (a, b, n) = Array(3) { readLine()!!.toInt() }
    var sum = 0
    for (i in a..b) {
        if (i % n == 0) sum++
    }
    println(sum)
}