fun main() {
    // put your code here
    val input = readLine()!!.toInt()
    val output = input / 100 + input / 10 % 10 + input % 10 // sum of digits
    println(output)
}