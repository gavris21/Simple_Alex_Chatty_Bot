import java.util.*

fun main() {
    // write your code here
    val a = Scanner(System.`in`)
    val b = Array(6) { a.nextInt() }.let {
        "${it[0]}:${it[1]}:${it[2]} ${it[3]}/${it[4]}/${it[5]}"
    }
    println(b)
}