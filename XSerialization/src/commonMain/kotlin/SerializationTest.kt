package XSerializations

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlin.js.JsExport

@Serializable
class Project(val name: String, val language: String)

@JsExport
class SerializationTest(val name: String) {

    fun main() {
        val data = Project("kotlinx.serialization", "Kotlin")
        println(Json.encodeToString(data))
    }
}