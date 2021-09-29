fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    val arr = Array(n) { readLine()!!.toInt() }
    var max = 0
    for (i in 0 until n) {
        for (z in 0 until n) {
            var temp = 0
            if (i != z) {
                temp = arr[i] * arr[z]
            }
            if (max < temp) max = temp
        }
    }
    if (n == 1) println(arr[0]) else println(max)
}