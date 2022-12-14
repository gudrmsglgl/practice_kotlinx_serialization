package advanced

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class ViewType

@Serializable
@SerialName("vt001")
data class VT001(
    val title: String,
    val data: List<String>
): ViewType()

@Serializable
@SerialName("vt002")
data class VT002(
    val title: String,
    val keyword: String
): ViewType()


@Serializable
@SerialName("vt003")
data class VT003(
    val title: String,
    val data: List<String>,
    val views: Int
): ViewType()
