package personal.opensrcerer.bonkersmusic.server.responses.browsing

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import personal.opensrcerer.bonkersmusic.server.responses.subsonic.SubsonicResponse

class MusicFolders : SubsonicResponse() {
    @JacksonXmlElementWrapper
    val musicFolders: Array<MusicFolder>? = null

    data class MusicFolder (
        @JsonProperty("id") val id: Long,
        @JsonProperty("name") val name: String?
    )
}