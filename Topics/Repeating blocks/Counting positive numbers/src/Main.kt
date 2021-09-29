fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var posN = 0
    repeat(n) {
        if (readLine()!!.toInt() > 0) posN++
    }
    println(posN)
}