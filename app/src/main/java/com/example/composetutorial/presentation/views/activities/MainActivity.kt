package com.example.composetutorial.presentation.views.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetutorial.presentation.views.composables.ExpandableCards
import com.example.composetutorial.presentation.views.composables.Onboarding
import com.example.composetutorial.presentation.theme.ComposeTutorialTheme
import com.example.composetutorial.presentation.views.composables.AlignYourBodyRow
import com.example.composetutorial.presentation.views.composables.BottomNavigationBar
import com.example.composetutorial.presentation.views.screens.HomeScreen
import com.example.composetutorial.presentation.views.screens.HomeScreenLandscape

class MainActivity : ComponentActivity() {
    @OptIn(
        ExperimentalMaterial3Api::class,
        ExperimentalMaterial3WindowSizeClassApi::class
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme{
                val windowSizeClass = calculateWindowSizeClass(this)
                MainActivityContent(windowSizeClass)
            }
        }
    }
}

@Composable
fun MainActivityContent(windowSize: WindowSizeClass) {
    when (windowSize.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            HomeScreen()
        }
        WindowWidthSizeClass.Expanded -> {
            HomeScreenLandscape()
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun HomeScreenPreview(){
    ComposeTutorialTheme {
        HomeScreen()
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