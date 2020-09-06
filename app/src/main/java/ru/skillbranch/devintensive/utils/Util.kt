package ru.skillbranch.devintensive.utils

import java.util.*

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
        val result: StringBuffer = StringBuffer()

        if (
            firstName != null
            && firstName != ""
            && firstName != " "
            && lastName != null
            && lastName != ""
            && lastName != " "
        ) {
            result.append(firstName[0].toString().toUpperCase(Locale.ROOT))
            result.append(lastName[0].toString().toUpperCase(Locale.ROOT))

        } else if (
            (firstName == null
                    || firstName == ""
                    || firstName == " ")
            &&
            (lastName != null
                    && lastName != ""
                    && lastName != " ")
        ) {
            result.append(lastName[0].toString().toUpperCase(Locale.getDefault()))

        } else if (
            (firstName == null || firstName == "" || firstName == " ")
            && (lastName == null || lastName == "" || lastName == " ")
        ) {
            result.append("null")

        } else if (
            (firstName != null && firstName != "" && firstName != " ")
            &&
            (lastName == null || lastName == "" || lastName == " ")
        ) {
            result.append(firstName[0].toString().toUpperCase(Locale.getDefault()))
        }

        return result.toString()
    }
}