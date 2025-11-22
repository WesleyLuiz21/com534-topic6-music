fun main() {
    val s1 = Song("Track One", "Artist A", 3.5)
    val s2 = Song("Track Two", "Artist B", 3.7)
    val s3 = Song("Track Third", "Artist C", 3.2)

    val album = Album(listOf(s1, s2, s3))

    // call the method
    val artistASongs = album.filterSongsByArtist("Artist A")

    println("Songs by Artist A:")
    for (song in artistASongs) {
        println("_ ${song.title}")
    }
}