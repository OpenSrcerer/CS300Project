package personal.opensrcerer.bonkersmusic.server.client.cache

data class SubsonicConfig (
        val host: String,
        val port: Int,
        val username: String,
        val password: String,
        val version: String
)