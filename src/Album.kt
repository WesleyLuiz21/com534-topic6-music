class Album(
    val songs: List<Song>
) {
    fun filterSongsByArtist(artist: String): List<Song> {
        // filter to keep only songs where song.artist == artist
        return songs.filter { song -> song.artist.contains(artist) }
    }
}