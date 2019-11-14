package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.extensions.humanizeDiff
import java.util.*

class ImageMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean,
    date: Date,
    var image: String?
) : BaseMessage(id, from, chat, isIncoming, date) {

    override fun formatMessage(): String = "id:$id ${from?.firstName} + " +
            "${if(isIncoming) "received" else "sent"} + " +
            "image \"$image\" + " +
            "${date.humanizeDiff()}"
}