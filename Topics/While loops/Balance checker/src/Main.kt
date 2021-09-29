import java.util.*

fun main() {
    // write your code here
    /*val n1: Int = readLine()!!.toInt()
    val n2: String = readLine()!!.toString()
    val list: List<String> = n2.split(" ")
    var sum:Int=0
    var sumTemp:Int=0
    for (item in list){
        sum += item.trim().toInt()
    }
    if (sum<=n1){
        println("Thank you for choosing us to manage your account! You have ${n1-sum} money.")
    }
    else {
        for (item in list){
            if (sumTemp + item.trim().toInt() <=n1) {
                sumTemp += item.trim().toInt()
            }
        }
        println("Error, insufficient funds for the purchase. You have $sumTemp, but you need $sum.")
    }*/
    val scanner = Scanner(System.`in`)
    var balance = scanner.nextInt()
    var pay = 0
    while (scanner.hasNextInt() && balance >= pay) {
        pay = scanner.nextInt()
        if (balance >= pay) {
            balance -= pay
            pay = 0
        }
    }
    if (pay > 0) {
        println("Error, insufficient funds for the purchase. You have $balance, but you need $pay.")
    } else {
        println("Thank you for choosing us to manage your account! You have $balance money.")
    }
}