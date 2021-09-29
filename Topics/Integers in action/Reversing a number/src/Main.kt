fun main() {
    // put your code here
    val input = readLine()!!.toInt()
    val output = input % 10 * 100 + input / 10 % 10 * 10 + input / 100
    println(output)
}