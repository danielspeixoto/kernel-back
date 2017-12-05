package entities.user

class UserUseCases(private val repository: UserContract.Repository) : UserContract.UseCase {

    override fun login(user: User) {
        repository.insert(user)
    }
}