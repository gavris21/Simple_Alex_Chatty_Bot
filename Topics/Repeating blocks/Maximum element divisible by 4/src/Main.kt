fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var tempMax = 0
    repeat(n) {
        val temp = readLine()!!.toInt()
        if (temp % 4 == 0 && temp > tempMax) tempMax = temp
    }
    println(tempMax)
}