package com.sandeep.snoozelloo.alarm.presentation.models

data class AlarmUI(
    val label: String,
    val isEnabled: Boolean,
    val time: DisplayableTime,
)

data class DisplayableTime(
    val hours: Int,
    val minutes: Int,
)
