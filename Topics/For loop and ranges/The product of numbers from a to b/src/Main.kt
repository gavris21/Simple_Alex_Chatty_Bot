fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt() - 1
    var product = 1L
    for (i in a..b) {
        product *= i
    }
    println(product)
}