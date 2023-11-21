package com.sunnected.daggerhiltapp.ui.composables

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun DaggerHiltMainScreen(it: PaddingValues) {

    val context = LocalContext.current
    val toaster = { Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show() }

    Column(modifier = Modifier.padding(it)) {
        Text(text = "Hello World")
        IconButton(onClick = { toaster() }) {
            Icon(
                imageVector = Icons.Filled.Done,
                contentDescription = null
            )
        }
    }
}