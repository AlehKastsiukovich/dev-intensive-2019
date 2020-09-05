package ru.skillbranch.devintensive.utils

object Util {

    fun parseFullName(fullName: String?) : Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)

        when(firstName) {
            "" -> firstName = null
        }

        val lastName = parts?.getOrNull(1)

        return Pair(firstName, lastName);
    }
}