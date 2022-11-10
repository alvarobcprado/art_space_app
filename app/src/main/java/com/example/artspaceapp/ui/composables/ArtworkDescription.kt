package com.example.artspaceapp.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspaceapp.Artwork

@Composable
fun ArtworkDescription(
    artwork: Artwork,
) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            ArtworkDescriptionTitle(artwork.title)
            ArtworkDescriptionSubtitle(artwork.artist, artwork.year)
        }
    }
}

@Composable
private fun ArtworkDescriptionSubtitle(artworkAuthor: String, artworkYear: String) {
    Text(
        text = buildAnnotatedString {
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                append(artworkAuthor)
            }
            append(" $artworkYear")
        },
        fontSize = 14.sp,
    )
}

@Composable
private fun ArtworkDescriptionTitle(artworkTitle: String) {
    Text(text = artworkTitle, fontSize = 32.sp)
}