package datetime

import number.A
import java.time.Instant

fun main(args: Array<String>) {
    val now = Instant.now()
    val oneDayAgo = A days ago
    val oneDayLater = A days later

    println(now)
    println(oneDayAgo)
    println(oneDayLater)
}