package database

import entities.user.User
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class UserTest : Spek({

    given("A user Database") {
        val usersDB = Database.users
        beforeEachTest {
            usersDB.drop()
        }
        on("insertion") {
            val user = User(name = "inserted", email = "test@t.com")
            usersDB.insertOne(user)
            it("should be able to retrieve the inserted user") {
                usersDB.find().first() shouldEqual user
            }
        }
    }
})