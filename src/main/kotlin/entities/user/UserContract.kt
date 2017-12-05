package entities.user

class UserContract {

    interface UseCase {
        fun login(user : User)
    }

    interface Controller {
        fun login(user : User)
    }

    interface Repository {
        fun insert(user : User)
    }
}
