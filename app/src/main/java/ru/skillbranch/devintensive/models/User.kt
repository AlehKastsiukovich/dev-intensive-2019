package ru.skillbranch.devintensive.models

import java.util.*

data class User (
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    var lastVisit: Date? = Date(),
    var isOnline: Boolean = false
) {

    constructor(id: String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar =  null
    )

    companion object Factory {
        private var userId: Int = -1

        fun makeUser(fullName: String?): User {
            userId++

            val parts: List<String>? = fullName?.split(" ")
            val firstName = parts?.getOrNull(0)
            val lastName = parts?.getOrNull(1)

            return User(id = "$userId", firstName = firstName, lastName = lastName)
        }
    }
}