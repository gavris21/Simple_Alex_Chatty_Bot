fun main() {
    // put your code here
    val result = Array(2) { readLine()!!.toInt() }.let {
        "${it[0]} ${it[1]}"
    }
    println(result)
}