import basic.Person
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main() {
    val json = Json {
        encodeDefaults = true
        ignoreUnknownKeys = true
    }

    encodePersonToJson(json)
    println()
    decodeJsonToPerson(json)
}


private fun encodePersonToJson(json: Json) {
    val person = Person(
        name = "david"
    )
    println("=======================Encode=======================")
    println("person: $person")
    println("Encode process")
    println("json: ${json.encodeToString(person)}")
    println("====================================================")

}

private fun decodeJsonToPerson(json: Json) {
    val jsonPerson = """
        {
            "name" : "david"
            "age" : 32
            "address" : "incheon"
        }
    """
    val person = json.decodeFromString<Person>(jsonPerson)
    println("=======================Decode=======================")
    println("json: $jsonPerson")
    println("Decode process")
    println("person: $person")
    println("====================================================")
}