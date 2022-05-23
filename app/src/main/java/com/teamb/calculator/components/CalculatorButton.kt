package com.teamb.calculator.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    backgroundColor: Color,
    textColor: Color,
    onClick: () -> Unit
) {

    Box(
        modifier = Modifier
            .clip(CircleShape)
            .background(backgroundColor)
            .clickable {
                onClick()
            }
            .then(modifier),
        contentAlignment = Alignment.Center
    ) {

        Text(text = symbol, style = MaterialTheme.typography.displaySmall, color = textColor)

    }
}

