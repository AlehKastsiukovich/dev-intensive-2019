package ru.skillbranch.devintensive.models

import java.util.*

class ImageMessage (
    id: String,
    from: User?,
    chat: Chat,
    isInComing: Boolean = false,
    date: Date = Date(),
    var image: String?
) : BaseMessage(id, from, chat, isInComing, date) {

    override fun formatMessage(): String {
        TODO("Not yet implemented")
    }
}