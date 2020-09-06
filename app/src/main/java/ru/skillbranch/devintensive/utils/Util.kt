package ru.skillbranch.devintensive.utils

object Util {

    fun parseFullName(fullName: String?) : Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)

        when(firstName) {
            "" -> firstName = null
        }

        when(lastName) {
            "" -> lastName = null
        }

        return Pair(firstName, lastName);
    }

    fun transliteration(payload: String, divider: String = " "): String {
        return ""
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        return ""
    }
}