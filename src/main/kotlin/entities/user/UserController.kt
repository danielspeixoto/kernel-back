package entities.user

class UserController(private val useCase : UserContract.UseCase) : UserContract.Controller {

    override fun login(user: User) {
        useCase.login(user)
    }
}