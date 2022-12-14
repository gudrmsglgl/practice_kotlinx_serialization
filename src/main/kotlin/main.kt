import basic.Person
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main() {
    val json = Json {
        encodeDefaults = true
        ignoreUnknownKeys = true
    }

    println(encodePersonToJson(json))
    println(decodeJsonToPerson(json))
}


private fun encodePersonToJson(json: Json): String {
    val person = Person(
        name = "david"
    )
    return json.encodeToString(person)
}

private fun decodeJsonToPerson(json: Json): Person {
    val jsonPerson = """
        {
            "name" : "david"
            "age" : 32
            "address" : "incheon"
        }
    """
    return json.decodeFromString(jsonPerson)
}