package basic

/**
 * Created by claudiug on 11/28/15.
 */

fun main(args: Array<String>) {

    val nr = 100
    val value1: Int = 100
    val stop: Double = 1000.00

    println(nr)
    println(value1)
    println(stop)
    "Claudiu".toCharArray().forEach { println(it) }

    val array = Array(5, { i -> (i * i).toString() })
    println(array)

    val str = "cAldu"
    println(str)

    if (nr > 10) {
        println(nr)
    } else {
        println("nn")
    }

    when(nr) {
        10 -> print("10")
        2, 101 -> print("121")
        100 -> print("number")

    }
    val nn = "claudiu"
    when(nn) {
        is String -> nn.startsWith("c")
        else -> false
    }


}