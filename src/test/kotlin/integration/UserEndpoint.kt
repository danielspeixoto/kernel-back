package integration


import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class UserEndpoint : Spek({

    given("A user Database") {
        on("insertion") {
            it("should be able to retrieve the inserted user") {
            }
        }
    }
})