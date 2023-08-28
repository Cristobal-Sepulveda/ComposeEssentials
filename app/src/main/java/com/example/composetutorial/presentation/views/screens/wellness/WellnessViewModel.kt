package com.example.composetutorial.presentation.views.screens.wellness

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.composetutorial.domain.WellnessTask
import com.example.composetutorial.utils.getWellnessTasksData

class WellnessViewModel : ViewModel() {

    private val _tasks = getWellnessTasksData().toMutableStateList()

    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean){
        tasks.find { it.id == item.id }?.let { task ->
            task.checked.value = checked
        }
    }
}
