package com.sandeep.snoozelloo.alarm.domain

import java.time.LocalTime

data class Alarm(
    val id: String,
    val time: LocalTime,
    val label: String,
    val isEnabled: Boolean,
)