package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECONDS = 1000L
const val MINUTES = SECONDS * 60
const val HOURS = MINUTES * 60
const val DAYS = HOURS * 24

fun Date.format(pattern: String = "HH:mm:ss dd:MM:yy") : String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value: Int, units: TimeUnit) : Date{
    var time = this.time

    time += when(units) {
        TimeUnit.SECONDS -> value * SECONDS
        TimeUnit.MINUTES -> value * MINUTES
        TimeUnit.HOURS -> value * HOURS
        TimeUnit.DAYS -> value * DAYS
    }

    this.time = time

    return this
}

public fun Date.humanizeDiff(date: Date = Date()): String {
    return ""
}

enum class TimeUnit {
    SECONDS,
    MINUTES,
    HOURS,
    DAYS
}