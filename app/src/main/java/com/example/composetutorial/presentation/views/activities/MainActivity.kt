package com.example.composetutorial.presentation.views.activities

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetutorial.presentation.theme.ComposeTutorialTheme
import com.example.composetutorial.presentation.views.screens.HomeScreen
import com.example.composetutorial.presentation.views.screens.HomeScreenLandscape
import com.example.composetutorial.presentation.views.screens.wellness.WellnessScreen

class MainActivity : ComponentActivity() {
    @OptIn(
        ExperimentalMaterial3Api::class,
        ExperimentalMaterial3WindowSizeClassApi::class
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme{
                //val windowSizeClass = calculateWindowSizeClass(this)
                //MainActivityContent(windowSizeClass)
                WellnessScreen()
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
fun WellnessScreenPreview(){
    ComposeTutorialTheme {
        WellnessScreen()
    }
}
