package com.example.composetutorial.utils

import com.example.composetutorial.domain.WellnessTask

fun getWellnessTasksData() = List(30) { i -> WellnessTask(i, "Task # $i") }