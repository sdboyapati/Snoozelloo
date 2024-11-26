package com.sandeep.snoozelloo

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sandeep.snoozelloo.ui.theme.components.AlarmListItem

@Composable
fun AlarmListScreen(
    modifier: Modifier = Modifier,
    alarms: List<AlarmUI> = emptyList()
) {
    LazyColumn(modifier = modifier) {
        items(alarms) { alarmUI ->
            AlarmListItem(
                alarmUI = alarmUI,
                onAlarmClick = {
                    //Navigate to alarm screen
                },
                onSwitchClick = {
                    //Toggle alarm
                }
            )
        }
    }
}