package personal.opensrcerer.bonkersmusic.server.requests.subsonic

import personal.opensrcerer.bonkersmusic.server.requests.RequestPath
import java.io.Serializable

abstract class SubsonicRequest<out T> {

    abstract val path : RequestPath

    open val queryParams : Map<String, Serializable> = emptyMap()

    abstract fun getClazz() : Class<out T>
}