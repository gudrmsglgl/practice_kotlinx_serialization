import advanced.VT001
import advanced.VT002
import advanced.ViewType
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

fun main() {
    val json = Json {
        encodeDefaults = true
        ignoreUnknownKeys = true
        classDiscriminator = "viewType"
    }
    expectJsonDecodeLog<VT001>(json) {
        """
            {
                "viewType" : "vt001",
                "title" : "관심사 항목",
                "data" : [
                    "data1", "data2", "data3"
                ]
            } 
        """
    }

    expectJsonDecodeLog<VT002>(json) {
        """
            {
                "viewType" : "vt002",
                "title" : "이번주 키워드",
                "keyword" : "재발집 막내 아들"
            } 
        """
    }
    expectJsonDecodeLog<VT002>(json) {
        """
            {
                "viewType" : "vt003",
                "title" : "인기 콘텐츠",
                "data" : [
                    "연애참견", "재벌집 막내 아들", "종이의 집"
                ],
                "views" : 200
            } 
        """
    }

}


private fun decodeJsonToViewType(json: Json, param: String): ViewType {
    return json.decodeFromString(param)
}


private inline fun <reified T> expectJsonDecodeLog(json: Json, data: () -> String){
    val decodeClass = decodeJsonToViewType(json, data.invoke())

    println(
        "expect type[${T::class.java.simpleName}] \n" +
        "JsonDecode type[${decodeClass::class.java.simpleName}] \n" +
        "JsonDecode classInfo > $decodeClass \n"
    )
}