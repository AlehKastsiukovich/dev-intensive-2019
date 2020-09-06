package ru.skillbranch.devintensive.models

import java.util.*

class TextMessage(
    id: String,
    from: User?,
    chat: Chat,
    isInComing: Boolean = false,
    date: Date = Date(),
    var text: String?
) : BaseMessage(id, from, chat, isInComing, date) {

    override fun formatMessage(): String {
        TODO("Not yet implemented")
    }
}