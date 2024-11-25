package com.sandeep.snoozelloo

import java.time.LocalTime

data class Alarm(
    val id: String,
    val time: LocalTime,
    val label: String,
    val isEnabled: Boolean,
)