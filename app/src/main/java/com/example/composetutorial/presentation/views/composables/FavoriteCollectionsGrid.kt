package com.example.composetutorial.presentation.views.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.presentation.theme.ComposeTutorialTheme
import com.example.composetutorial.utils.favoriteCollectionsData

@Composable
fun FavoriteCollectionsGrid(
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.height(169.dp)
    ) {
        items(favoriteCollectionsData) { item ->
            FavoriteCollectionCard(
                item.drawable,
                item.text,
                Modifier.height(80.dp)
            )
        }
    }
}


@Preview(
    showBackground = true,
)
@Composable
fun FavoriteCollectionsGridPreview(){
    ComposeTutorialTheme {
        FavoriteCollectionsGrid()
    }
}