package com.example.artspaceapp

data class Artwork(
    val title: String,
    val artist: String,
    val year: String,
    val image: Int,
)

fun getArtworkList(): List<Artwork> {
    return listOf(
        Artwork(
            title = "Space",
            artist = "Pablo Amaringo",
            year = "2020",
            image = R.drawable.space,
        ),
        Artwork(
            title = "City",
            artist = "Fernando Llano",
            year = "2020",
            image = R.drawable.city,
        ),
        Artwork(
            title = "Flowers",
            artist = "John Doe",
            year = "2021",
            image = R.drawable.flowers,
        ),
        Artwork(
            title = "Ocean",
            artist = "Jane Austen",
            year = "2018",
            image = R.drawable.ocean,
        ),
    )
}