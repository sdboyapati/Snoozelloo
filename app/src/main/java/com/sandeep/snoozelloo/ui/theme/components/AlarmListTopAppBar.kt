package com.sandeep.snoozelloo.ui.theme.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sandeep.snoozelloo.ui.theme.Montserrat


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlarmListTopAppBar(scrollBehavior: TopAppBarScrollBehavior)
{
    TopAppBar(
        title = {
            Text(
                text = "Your Alarms",
                fontFamily = Montserrat,
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp
            )
        },
        scrollBehavior = scrollBehavior,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent,
            scrolledContainerColor = Color.Transparent,
        )
    )
}