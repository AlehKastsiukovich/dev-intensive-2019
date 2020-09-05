package ru.skillbranch.devintensive

import org.junit.Test
import ru.skillbranch.devintensive.models.User

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val user = User.makeUser("AlehKastsiukovich")
        val user2 = User.makeUser("AlehKastsiukovich2")

        print(user)
        print(user2)
    }
}