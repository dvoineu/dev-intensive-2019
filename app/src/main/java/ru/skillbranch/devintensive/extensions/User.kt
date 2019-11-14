package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView
import ru.skillbranch.devintensive.utils.Utils
import java.util.*

fun User.toUserView(): UserView{

    val nickName = Utils.transliteration("")
    val initials = Utils.toInitials(firstName, lastName)
    val status = if(lastVisit == null) "Have never been here"
                    else if (isOnline) "online"
                    else "Last seen ${lastVisit.humanizeDiff()}"

    return UserView(
        id,
        fullName = "$firstName $lastName",
        avatar = avatar,
        nickName = nickName,
        initials = initials,
        status = status)
}

