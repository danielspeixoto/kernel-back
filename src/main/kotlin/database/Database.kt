package database

import entities.user.User
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection

object Database {

    private val DB_NAME = "kernel"
    private val db = KMongo.createClient().getDatabase(DB_NAME)
    val users = db.getCollection<User>()
}