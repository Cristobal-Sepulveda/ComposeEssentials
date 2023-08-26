package com.example.composetutorial.presentation.views.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetutorial.presentation.theme.ComposeTutorialTheme
import com.example.composetutorial.presentation.views.composables.ExpandableCards
import com.example.composetutorial.presentation.views.composables.Onboarding

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    //State hoisting
    var shouldShowOnboarding by remember { mutableStateOf(true) }
    Surface(modifier) {
        if (shouldShowOnboarding) {
            Onboarding(onContinueClicked = { shouldShowOnboarding = false })
        } else {
            ExpandableCards()
        }
    }
}

@Preview
@Composable
fun MyAppPreview() {
    ComposeTutorialTheme {
        MyApp(Modifier.fillMaxSize())
    }
}