fun main() {
    // write your code here
    val result = Array(5) { readLine()!!.toInt() }.let {
        if (it[4] in it[0]..it[1] && it[4] in it[2]..it[3]) "true" else "false"
    }
    println(result)
}