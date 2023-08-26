package com.example.composetutorial.presentation.views.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetutorial.presentation.theme.ComposeTutorialTheme
import com.example.composetutorial.presentation.views.composables.NavigationRailBar

@Composable
fun HomeScreenLandscape() {
    ComposeTutorialTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Row {
                NavigationRailBar()
                HomeScreen()
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun HomeScreenLandscapePreview(){
    ComposeTutorialTheme {
        HomeScreenLandscape()
    }
}