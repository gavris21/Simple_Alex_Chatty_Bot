fun main() {
    // write your code here
    val (a, b) = Array(2) { readLine()!!.toInt() }
    for (i in a..b) {
        if (i % 3 == 0 && i % 5 == 0) println("FizzBuzz") else {
            if (i % 3 == 0) println("Fizz") else {
                if (i % 5 == 0) println("Buzz") else println(i)
            }
        }
    }
}
