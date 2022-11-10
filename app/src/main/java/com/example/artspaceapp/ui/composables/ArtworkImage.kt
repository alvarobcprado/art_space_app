package com.example.artspaceapp.ui.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ArtworkImage(
    @DrawableRes imageId: Int,
    author: String,
) {

    Card(
        elevation = 8.dp, border = BorderStroke(
            width = 4.dp,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f),
        ), modifier = Modifier
            .heightIn(max = 400.dp)
            .widthIn(max = 300.dp)

    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = "A artwork by $author",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(32.dp)
                .fillMaxSize(),
        )
    }
}