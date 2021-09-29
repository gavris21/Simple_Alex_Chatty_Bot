fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0
    repeat(n) {
        val temp = readLine()!!.toInt()
        if (temp == 2) d++
        if (temp == 3) c++
        if (temp == 4) b++
        if (temp == 5) a++
    }
    println("$d $c $b $a")
}