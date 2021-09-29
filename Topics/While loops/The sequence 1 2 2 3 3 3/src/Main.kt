fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var count = 0
    var count1 = 0
    while (n > count) {
        count++
        for (z in 1..count) {
            if (count1 < n) {
                print("$count ")
                count1++
            }
        }
    }
}