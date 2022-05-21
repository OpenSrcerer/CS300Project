package personal.opensrcerer.bonkersmusic.server.requests

enum class RequestPath(
    val value: String
    )
{
    // System
    PING                ("ping"),

    // Browsing
    GET_MUSIC_FOLDERS   ("getMusicFolders"),
    GET_INDEXES         ("getIndexes"),
    GET_MUSIC_DIRECTORY ("getMusicDirectory"),
    GET_GENRES          ("getGenres"),
    GET_ARTISTS         ("getArtists"),
    GET_ARTIST          ("getArtist"),
    GET_ALBUM           ("getAlbum"),
    GET_SONG            ("getSong"),
    GET_VIDEOS          ("getVideos"),
    GET_VIDEO_INFO      ("getVideoInfo"),
    GET_ARTIST_INFO     ("getArtistInfo"),
    GET_ARTIST_INFO2    ("getArtistInfo2"),
    GET_ALBUM_INFO      ("getAlbumInfo"),
    GET_ALBUM_INFO2     ("getAlbumInfo2"),
    GET_SIMILAR_SONGS   ("getSimilarSongs"),
    GET_SIMILAR_SONGS2  ("getSimilarSongs2"),

    // Albums / Song Lists
    GET_TOP_SONGS       ("getTopSongs"),
    GET_ALBUM_LIST      ("getAlbumList"),
    GET_ALBUM_LIST2     ("getAlbumList2"),
    GET_RANDOM_SONGS    ("getRandomSongs"),
    GET_SONGS_BY_GENRE  ("getSongsByGenre"),
    GET_NOW_PLAYING     ("getNowPlaying"),
    GET_STARRED         ("getStarred"),
    GET_STARRED2        ("getStarred2"),

    // Search
    SEARCH2             ("search2"),
    SEARCH3             ("search3"),

    // Media
    STREAM              ("stream"),
    GET_COVER_ART       ("getCoverArt"),
    GET_LYRICS          ("getLyrics"),
    STAR                ("star"),
    UNSTAR              ("unstar"),
    SCROBBLE            ("scrobble");

    override fun toString(): String {
        return value
    }
}