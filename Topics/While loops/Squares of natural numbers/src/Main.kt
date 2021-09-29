fun main() {
    // put your code here
    val input = readLine()!!.toInt()
    var temp = 1
    while (temp * temp <= input) {
        println(temp * temp)
        temp++
    }
}