fun main() {
    // put your code here
    val hours1 = readLine()!!.toInt()
    val minutes1 = readLine()!!.toInt()
    val seconds1 = readLine()!!.toInt()
    val hours2 = readLine()!!.toInt()
    val minutes2 = readLine()!!.toInt()
    val seconds2 = readLine()!!.toInt()
    val secondsPast = hours2 * 60 * 60 + minutes2 * 60 + seconds2 - hours1 * 60 * 60 - minutes1 * 60 - seconds1
    println(secondsPast)
}