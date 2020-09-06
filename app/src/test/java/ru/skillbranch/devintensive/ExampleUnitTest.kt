package ru.skillbranch.devintensive

import org.junit.Test
import ru.skillbranch.devintensive.extensions.format
import ru.skillbranch.devintensive.extensions.toUserView
import ru.skillbranch.devintensive.models.*
import java.util.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val user = User.makeUser("AK ")
        val user2 = User.makeUser("AlehKastsiukovich2")

        print(user.lastVisit?.format())
    }

    @Test
    fun test_user_mapping() {
        val user2 = User.makeUser("Aleh Kastsiukovich")
        user2.toUserView().printMe()
    }

    @Test
    fun test_abstract_factory() {
        val user = User.makeUser("Aleh Kastsiukovich")
        val baseTextMessage = BaseMessage.makeMessage(user, Chat("1"), Date(), payload = "any text message", type = "text")
        val baseImageMessage = BaseMessage.makeMessage(user, Chat("1"), Date(), payload = "any image url", type = "image")

        when(baseTextMessage) {
            is TextMessage -> println("Text")
            is ImageMessage -> println("Image")
        }
    }
}