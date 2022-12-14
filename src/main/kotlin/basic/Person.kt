package basic

import kotlinx.serialization.Serializable

@Serializable
data class Person(
    val name: String,
    val age: Int = 31,
    val sex: Char = 'M',
    val hobby: String = "Game of League of Legends"
)
