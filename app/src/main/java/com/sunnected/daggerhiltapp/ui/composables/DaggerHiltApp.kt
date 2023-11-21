package com.sunnected.daggerhiltapp.ui.composables

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DaggerHiltApp() {
    Scaffold(
        topBar = { DaggerHiltTopBar() },
    ) {paddingValues ->
        DaggerHiltMainScreen(paddingValues)
    }
}