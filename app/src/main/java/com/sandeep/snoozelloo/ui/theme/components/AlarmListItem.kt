package com.sandeep.snoozelloo.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sandeep.snoozelloo.AlarmUI
import com.sandeep.snoozelloo.ui.theme.SnoozellooTheme
import com.sandeep.snoozelloo.ui.theme.onCardColor
import com.sandeep.snoozelloo.ui.theme.timeLeftColor as timeLeftColor1

@Composable
fun AlarmListItem(
    alarmUI: AlarmUI,
    modifier: Modifier = Modifier,
    onAlarmClick: () -> Unit = {},
    onSwitchClick: (Boolean) -> Unit = {},
) {
    Card(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp)
            .clickable(onClick = onAlarmClick),
        colors = CardDefaults.cardColors().copy(
            containerColor = Color.White
        )
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(
                modifier = Modifier.alignByBaseline()
                    .weight(1f)
                ,verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = alarmUI.label,
                    color = onCardColor,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                )
                Row(modifier = Modifier.padding(top = 4.dp)) {
                    Text(
                        text = alarmUI.time,
                        color = onCardColor,
                        fontWeight = FontWeight.Medium,
                        fontSize = 40.sp,
                        modifier = Modifier.alignByBaseline(),
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = alarmUI.amOrPm,
                        color = onCardColor,
                        fontWeight = FontWeight.Medium,
                        fontSize = 24.sp,
                        modifier = Modifier.alignByBaseline(),
                    )
                }
                Text(
                    text = alarmUI.messageTimeLeft,
                    color = timeLeftColor1,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                )
            }

            Switch(
                checked = alarmUI.isEnabled,
                onCheckedChange = onSwitchClick,
            )
        }
    }
}

@Composable
@Preview
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

var alarmUI = AlarmUI(
    label = "Wake Up",
    isEnabled = true,
    time = "10:20",
    amOrPm = "AM",
    messageTimeLeft = "Alarm in 30min"

)