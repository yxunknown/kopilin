package datetime

import java.time.Instant
import java.util.*

object ago
object later

const val WEEK_IN_MILLISECOND = 604800000
const val DAY_IN_MILLISECOND = 86400000
const val HOUR_IN_MILLISECOND = 3600000
const val MINUTE_IN_MILLISECOND = 60000
const val SECOND_IN_MILLISECOND = 1000


infix fun Number.weeks(x: ago): Date =
        Date(Instant.now().toEpochMilli() - (this times WEEK_IN_MILLISECOND).toLong())

infix fun Number.days(x: ago): Date =
        Date(Instant.now().toEpochMilli() - (this times DAY_IN_MILLISECOND).toLong())


infix fun Number.hours(x: ago): Date =
        Date(Instant.now().toEpochMilli() - (this times HOUR_IN_MILLISECOND).toLong())

infix fun Number.minutes(x: ago): Date =
        Date(Instant.now().toEpochMilli() - (this times MINUTE_IN_MILLISECOND).toLong())

infix fun Number.seconds(x: ago): Date =
        Date(Instant.now().toEpochMilli() - (this times SECOND_IN_MILLISECOND).toLong())


infix fun Number.weeks(x: later): Date =
        Date(Instant.now().toEpochMilli() + (this times WEEK_IN_MILLISECOND).toLong())

infix fun Number.days(x: later): Date =
        Date(Instant.now().toEpochMilli() + (this times DAY_IN_MILLISECOND).toLong())


infix fun Number.hours(x: later): Date =
        Date(Instant.now().toEpochMilli() + (this times HOUR_IN_MILLISECOND).toLong())

infix fun Number.minutes(x: later): Date =
        Date(Instant.now().toEpochMilli() + (this times MINUTE_IN_MILLISECOND).toLong())

infix fun Number.seconds(x: later): Date =
        Date(Instant.now().toEpochMilli() + (this times SECOND_IN_MILLISECOND).toLong())