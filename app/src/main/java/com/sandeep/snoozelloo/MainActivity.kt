package com.sandeep.snoozelloo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sandeep.snoozelloo.ui.theme.SnoozellooTheme
import com.sandeep.snoozelloo.ui.theme.components.alarmUI

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SnoozellooTheme {
                AlarmListScreen(
                    alarms = listOf(
                        alarmUI,
                        alarmUI.copy(isEnabled = false),
                        alarmUI,
                        alarmUI.copy(isEnabled = false),
                        alarmUI,
                        alarmUI,
                    )
                ) {}
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview(modifier: Modifier = Modifier) {
    SnoozellooTheme {
        AlarmListScreen {}
    }
}