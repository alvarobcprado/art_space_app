package com.example.artspaceapp.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.artspaceapp.R

@Composable
fun ArtworkActions(
    onTap: (Int) -> Unit,
    currentIndex: Int,
    maxIndex: Int,
) {
    val nextIndex = if (currentIndex < maxIndex - 1) currentIndex + 1 else 0
    val previousIndex = if (currentIndex > 0) currentIndex - 1 else maxIndex - 1

    Row(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(24.dp),
    ) {

        ArtworkActionButton(
            label = stringResource(R.string.previousActionBtn),
            onTap = { onTap.invoke(previousIndex) },
            modifier = Modifier.weight(1f)
        )
        ArtworkActionButton(
            label = stringResource(R.string.nextActionBtn),
            onTap = { onTap.invoke(nextIndex) },
            modifier = Modifier.weight(1f)
        )

    }
}

@Composable
private fun ArtworkActionButton(
    label: String,
    onTap: () -> Unit,
    modifier: Modifier,
) {
    Button(
        onClick = onTap, modifier = modifier.fillMaxWidth()
    ) {
        Text(label)
    }
}
