package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView
import ru.skillbranch.devintensive.utils.Util

fun User.toUserView() : UserView {
    val initials = Util.toInitials(firstName, lastName)
    val nickName = Util.transliteration("$firstName $lastName")

    val status =
        if (lastVisit == null)
            "Еще ни разу не был"
        else if (isOnline) "online"
        else "Последний раз был ${lastVisit!!.humanizeDiff()}"


    return UserView(
        id,
        fullName = "$firstName $lastName",
        nickName = nickName,
        initials = initials,
        avatar = avatar,
        status = status
    )
}