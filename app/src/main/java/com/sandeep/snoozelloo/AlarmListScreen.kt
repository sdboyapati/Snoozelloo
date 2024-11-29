package com.sandeep.snoozelloo

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import com.sandeep.snoozelloo.ui.theme.components.AlarmListFab
import com.sandeep.snoozelloo.ui.theme.components.AlarmListItem
import com.sandeep.snoozelloo.ui.theme.components.AlarmListTopAppBar
import com.sandeep.snoozelloo.ui.theme.components.alarmUI

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlarmListScreen(
    modifier: Modifier = Modifier,
    alarms: List<AlarmUI> = emptyList(),
    onAddAlarmClick: () -> Unit,
) {
    val topAppBarState = rememberTopAppBarState()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(topAppBarState)

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = { AlarmListTopAppBar(scrollBehavior) },
        floatingActionButton = { AlarmListFab(onAddAlarmClick) },
        floatingActionButtonPosition = FabPosition.Center
    ) { innerPadding ->
        LazyColumn(modifier = modifier.padding(innerPadding)) {
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
}



@Preview
@Composable
fun AlarmListScreenPreview() {
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