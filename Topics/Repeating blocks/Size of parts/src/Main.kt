fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var larger = 0
    var smaler = 0
    var perfect = 0
    repeat(n) {
        val temp = readLine()!!.toInt()
        larger += if (temp == 1) 1 else 0
        smaler += if (temp == -1) 1 else 0
        perfect += if (temp == 0) 1 else 0
    }
    println("$perfect $larger $smaler")
}