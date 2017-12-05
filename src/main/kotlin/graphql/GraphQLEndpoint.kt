package graphql

import com.coxautodev.graphql.tools.SchemaParser
import graphql.schema.GraphQLSchema

object GraphQLEndpoint {

    private val SCHEMA_FILE = "schema.graphqls"

    private val schema : GraphQLSchema =
            SchemaParser.newParser()
                    .file(SCHEMA_FILE)
                    .resolvers(
                            Query(),
                            Mutation()
                    )
                    .build()
                    .makeExecutableSchema()

    private val graphQL = GraphQL.newGraphQL(schema).build()

    fun  execute(query : String)  =
        // Returning a json format string, check if it is possible
        // to return as json
         graphQL.execute(query).getData<Map<String, Any>>() ?: null



}