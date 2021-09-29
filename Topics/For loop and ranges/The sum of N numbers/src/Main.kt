fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    var sum = 0
    for (i in 1..n) {
        val temp = readLine()!!.toInt()
        sum += temp
    }
    println(sum)
}