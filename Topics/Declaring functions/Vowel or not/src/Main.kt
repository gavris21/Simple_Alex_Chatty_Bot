// write your function here
fun isVowel(ch: Char): Boolean {
    val arr = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return arr.contains(ch)
}

fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}