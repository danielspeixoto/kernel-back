package entities.user

import com.mongodb.client.MongoCollection

class UserRepository(private val collection : MongoCollection<User>) : UserContract.Repository {

    override fun insert(user: User) {
        collection.insertOne(user)
    }
}