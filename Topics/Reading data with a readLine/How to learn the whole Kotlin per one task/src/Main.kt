fun main() {
    // put your code here
/*    val input1 = readLine()!!
    val input2 = readLine()!!
    val input3 = readLine()!!
    val input4 = readLine()!!
    val input5 = readLine()!!
    println("$input1 $input2 $input3 $input4 $input5")
    val b11: Byte = 1
    val b22: Byte = 2
    val sb: Byte = (b11 + b22).toByte()
    val b1: Byte = 5         // Line 1
    val b2: Byte = 2 + 3     // Line 2
    //val s1: Short = 2 + b1   // Line 3
    //val s2: Short = 10 + 3L  // Line 4
 */
    println(Byte.MAX_VALUE)
    println(Int.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Float.MAX_VALUE)
    println(Double.MAX_VALUE)
    val longMax: Long = Long.MAX_VALUE - 156
    val float1: Float = longMax.toFloat()
    println(float1)
    val longMax1 = float1.toLong()
    println(longMax1)
    val b0: Byte = 2
    val s0: Short = 10
    val n0: Int = 5
    val l0: Long = 14
    val f0: Float = 11.4f

    val b: Byte = 5                 //1
    val s: Short = 2 + b0           //2
    val n: Int = s0.toByte() + 2    //3
    val l: Long = n0 + 4            //4
    val f: Float = l0.toFloat() + 1 //5
    val d: Double = f0 / 1          //6
}