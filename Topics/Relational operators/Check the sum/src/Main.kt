fun main() {
    // put your code here
    val result = Array(3) { readLine()!!.toInt() }.let {
        it[0] + it[1] == 20 || it[1] + it[2] == 20 || it[0] + it[2] == 20
    }
    println(result)
}