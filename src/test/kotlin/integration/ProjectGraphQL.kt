package integration

import graphql.GraphQLEndpoint
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class ProjectGraphQL : Spek({

    given("A project endpoint") {
        val endpoint = GraphQLEndpoint
        on("insertion") {
            it("should be able to retrieve the inserted project") {
                println(endpoint.execute(
                """query {
                        getProjects {
                            name
                        }
                }
                """.trimMargin()))
            }
        }
    }
})