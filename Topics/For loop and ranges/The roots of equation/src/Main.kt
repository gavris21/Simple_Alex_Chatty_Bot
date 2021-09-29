fun main() {
    // put your code here
    val (a, b, c, d) = Array(4) { readLine()!!.toInt() }
    for (x in 0..1000) {
        if (a * x * x * x + b * x * x + c * x + d == 0) println(x)
    }
}