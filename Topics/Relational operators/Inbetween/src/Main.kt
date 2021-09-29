fun main() {
    // put your code here
    val result = Array(3) { readLine()!!.toInt() }.let {
        it[0] in it[1]..it[2] || it[0] in it[2]..it[1]
    }
    println(result)
}