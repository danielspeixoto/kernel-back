package entities.user

import com.coxautodev.graphql.tools.GraphQLResolver

class UserController(
        private val useCase : UserContract.UseCase
) : UserContract.Controller, GraphQLResolver<User> {

    override fun login(user: User) {
        useCase.login(user)
    }
}