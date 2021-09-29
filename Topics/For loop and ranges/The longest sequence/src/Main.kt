fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    var max = 0
    var maxTemp = 1
    var temp1 = readLine()!!.toInt()
    for (i in 2..n) {
        val temp2 = readLine()!!.toInt()
        if (temp2 >= temp1) {
            maxTemp++
            if (maxTemp > max) max = maxTemp
        } else maxTemp = 1
        temp1 = temp2
    }
    if (n == 1) max = 1
    println(max)
}