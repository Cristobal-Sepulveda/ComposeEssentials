package com.example.composetutorial.presentation.views.screens.wellness

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composetutorial.presentation.theme.ComposeTutorialTheme
import com.example.composetutorial.presentation.views.composables.WaterStatefulCounter
import com.example.composetutorial.presentation.views.composables.WellnessTasksList
import com.example.composetutorial.utils.getWellnessTasksData

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        WaterStatefulCounter()
        WellnessTasksList(
            list = wellnessViewModel.tasks,
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task ->
                wellnessViewModel.remove(task)
            }
        )
    }
}

@Preview
@Composable
fun WellnessScreenPreview() {
    ComposeTutorialTheme {
        WellnessScreen()
    }
}