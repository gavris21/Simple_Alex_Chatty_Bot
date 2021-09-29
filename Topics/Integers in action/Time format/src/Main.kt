fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code
    val hours = totalSeconds / 3600 % 24
    val minutes = totalSeconds / 60 % 60
    val seconds = totalSeconds % 60
    println("$hours:$minutes:$seconds")
}