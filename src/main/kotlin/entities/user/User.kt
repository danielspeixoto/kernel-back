package entities.user

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

data class User(

        val name : String,
        val email : String,
        @BsonId val _id : ObjectId? = null

)