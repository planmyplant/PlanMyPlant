package com.app.planmyplant.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.tooling.preview.Preview
import com.app.planmyplant.ui.theme.PlanMyPlantTheme

val LocalUser = compositionLocalOf {
    "User not found"
}

@Preview
@Composable
fun ComposingDataExample() {
    PlanMyPlantTheme {
        Column {
            Text(LocalUser.current)
            CompositionLocalProvider(LocalUser provides "Donizete") {
                Text(LocalUser.current)
            }
            Text(LocalUser.current)
        }
    }
}