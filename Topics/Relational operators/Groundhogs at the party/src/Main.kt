fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    val day = readLine()!!.toBoolean()
    if (day) println(n in 15..25) else println(n in 10..20)
}