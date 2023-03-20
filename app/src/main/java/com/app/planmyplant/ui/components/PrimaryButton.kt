package com.app.planmyplant.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.planmyplant.ui.theme.PlanMyPlantTheme

@Composable
fun PrimaryButton(
    onClick: () -> Unit = {},
    content: @Composable () -> Unit
) {
    Surface(
        modifier = Modifier
            .clip(RoundedCornerShape(10))
            .clickable(onClick = onClick)
            .background(MaterialTheme.colors.primary)
            .padding(4.dp)
    ) {
        CompositionLocalProvider(LocalContentColor provides Color.White) {
            content()
        }
    }
}

@Preview
@Composable
fun PrimaryButtonPreview() {
    PlanMyPlantTheme {
        PrimaryButton {
            Text("Hello World")
        }
    }
}