package com.example.composetutorial.presentation.views.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.R
import com.example.composetutorial.presentation.theme.ComposeTutorialTheme
import com.example.composetutorial.presentation.views.composables.AlignYourBodyRow
import com.example.composetutorial.presentation.views.composables.BottomNavigationBar
import com.example.composetutorial.presentation.views.composables.FavoriteCollectionsGrid
import com.example.composetutorial.presentation.views.composables.HomeSection
import com.example.composetutorial.presentation.views.composables.SearchBar

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        bottomBar = { BottomNavigationBar() }
    ){ padding ->
        Surface(modifier = Modifier.fillMaxSize()){
            Column(
                modifier.verticalScroll(rememberScrollState())
            ) {
                Spacer(Modifier.height(16.dp))
                SearchBar(Modifier.padding(horizontal = 16.dp))
                HomeSection(title = R.string.align_your_body) {
                    AlignYourBodyRow()
                }
                HomeSection(title = R.string.favorite_collections) {
                    FavoriteCollectionsGrid()
                }
                Spacer(Modifier.height(16.dp))
            }
        }
    }

}
@Preview(
    showBackground = true,
    backgroundColor = 0xFFF5F0EE,
    heightDp = 180
)
@Composable
fun HomeScreenPreview(){
    ComposeTutorialTheme{
        HomeScreen()
    }
}