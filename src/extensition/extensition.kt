package extensition

import java.time.Instant
import java.util.*

operator fun Date.plus(other: Date): Date {
    return if (this.time + other.time > Instant.MAX.toEpochMilli()) {
        Date(Instant.MAX.toEpochMilli())
    } else {
        Date(this.time + other.time)
    }
}

operator fun Date.minus(other: Date): Date {
    return if (this < other) {
        Date(Instant.MIN.toEpochMilli())
    } else {
        Date(this.time - other.time)
    }
}

operator fun Date.compareTo(other: Date): Int = when {
    (time - other.time > 0) -> 1
    (time - other.time < 0) -> -1
    else -> 0
}