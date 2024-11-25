package com.sandeep.snoozelloo

data class AlarmUI(
    val label: String,
    val isEnabled: Boolean,
    val time: String,
    val amOrPm: String,
    val messageTimeLeft: String
)
