package personal.opensrcerer.bonkersmusic.server.responses.entities

import com.fasterxml.jackson.annotation.JsonProperty
import personal.opensrcerer.bonkersmusic.server.responses.enum.Unknown
import personal.opensrcerer.bonkersmusic.ui.dto.EmbeddableEntity

class Album(
    @JsonProperty("id")       id: String?,
    @JsonProperty("parent")   parent: String?,
    @JsonProperty("name")     name: String?,
    @JsonProperty("artist")   artist: String?,
    @JsonProperty("isDir")    isDir: String?,
    @JsonProperty("coverArt") coverArt: String?
) : EmbeddableEntity {

    val id = id ?: Unknown.ID.value
    val parent = parent ?: Unknown.PARENT.value
    val name = name ?: Unknown.TITLE.value
    val artist = artist ?: Unknown.ARTIST.value
    val isDir = isDir ?: Unknown.IS_DIRECTORY.value
    val coverArt = coverArt ?: Unknown.COVER_ART.value

    override fun id(): String {
        return id
    }

    override fun embedName(): String {
        return name
    }

    override fun embedValue(): String {
        return artist
    }
}