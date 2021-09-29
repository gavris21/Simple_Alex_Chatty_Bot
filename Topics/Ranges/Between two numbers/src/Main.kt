fun main() {
    // write your code here
    val result = Array(3) { readLine()!!.toInt() }.let {
        if (it[0] in it[1]..it[2]) "true" else "false"
    }
    println(result)
}