fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    var tempMin = Int.MAX_VALUE
    for (i in 1..n) {
        val temp = readLine()!!.toInt()
        if (temp < tempMin) tempMin = temp
    }
    println(tempMin)
}