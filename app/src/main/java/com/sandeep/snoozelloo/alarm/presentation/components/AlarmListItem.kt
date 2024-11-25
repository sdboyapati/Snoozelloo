package com.sandeep.snoozelloo.alarm.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sandeep.snoozelloo.alarm.presentation.models.AlarmUI
import com.sandeep.snoozelloo.alarm.presentation.models.DisplayableTime
import com.sandeep.snoozelloo.ui.theme.SnoozellooTheme

@Composable
fun AlarmListItem(
    alarmUI: AlarmUI,
    modifier: Modifier = Modifier,
    onAlarmClick: () -> Unit = {},
    onToggleSwitch: (Boolean) -> Unit = {}
) {
    val contentColor = if (isSystemInDarkTheme()) {
        Color.White
    } else {
        Color.Black
    }

    Card(
        modifier = modifier
            .clickable(onClick = onAlarmClick)
            .padding(
                start = 16.dp,
                end = 16.dp,
                top = 16.dp
            )
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = alarmUI.label,
                    color = contentColor,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp
                )
                Row(
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = "10:00",
                        color = contentColor,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 38.sp,
                        modifier = Modifier.alignByBaseline(),
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "AM",
                        color = contentColor,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 22.sp,
                        modifier = Modifier.alignByBaseline(),
                    )
                }
                Text(
                    text = "Alarm in 30min",
                    color = contentColor,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                )
            }
            Switch(checked = alarmUI.isEnabled,
                onCheckedChange = onToggleSwitch
            )
        }
    }
}

@Composable
@PreviewLightDark
fun PreviewAlarmListItem() {
    SnoozellooTheme {
        AlarmListItem(
            alarmUI = alarmUI,
            modifier = Modifier.background(
                MaterialTheme.colorScheme.background
            )
        )
    }
}

val alarmUI = AlarmUI(
    label = "Wake Up",
    isEnabled = true,
    time = DisplayableTime(10, 20)
)