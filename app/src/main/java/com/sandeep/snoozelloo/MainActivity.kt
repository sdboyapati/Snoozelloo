package com.sandeep.snoozelloo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sandeep.snoozelloo.ui.theme.SnoozellooTheme
import com.sandeep.snoozelloo.ui.theme.components.AlarmListItem
import com.sandeep.snoozelloo.ui.theme.components.alarmUI

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SnoozellooTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    AlarmListItem(
                        modifier = Modifier.padding(innerPadding),
                        alarmUI = alarmUI,
                        onAlarmClick = {},
                        onSwitchClick = {
                            alarmUI = alarmUI.copy(isEnabled = it)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SnoozellooTheme {
        Greeting("Android")
    }
}