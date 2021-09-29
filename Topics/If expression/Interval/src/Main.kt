fun main() {
    // write your code here
    val input = readLine()!!.toInt()
    if (input in -14..12 || input in 15..16 || input >= 19) println("True") else println("False")
}