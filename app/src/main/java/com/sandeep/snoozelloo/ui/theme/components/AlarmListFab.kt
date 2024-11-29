package com.sandeep.snoozelloo.ui.theme.components

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sandeep.snoozelloo.ui.theme.primaryLight

@Composable
fun AlarmListFab(onAddAlarmClick: () -> Unit) {
    FloatingActionButton(
        onClick = onAddAlarmClick,
        shape = CircleShape,
        containerColor = primaryLight
    ) {
        Icon(
            imageVector = Icons.Rounded.Add,
            contentDescription = "Add Alarm",
            tint = Color.White,
        )
    }
}