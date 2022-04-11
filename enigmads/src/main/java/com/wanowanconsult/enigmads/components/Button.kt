package com.wanowanconsult.enigmads.components

import androidx.compose.runtime.Composable
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.wanowanconsult.enigmads.ui.EnigmaDSTheme

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = EnigmaDSTheme.colors.primary,
            contentColor = EnigmaDSTheme.colors.textReverse
        ),
        contentPadding = PaddingValues(
            start = EnigmaDSTheme.sizes.large,
            top = EnigmaDSTheme.sizes.medium,
            end = EnigmaDSTheme.sizes.large,
            bottom = EnigmaDSTheme.sizes.medium
        )
    ) {
        Text(
            text = text,
            style = EnigmaDSTheme.typography.button
        )
    }
}

@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = EnigmaDSTheme.colors.primary
        ),
        border = BorderStroke(1.dp, EnigmaDSTheme.colors.primary),
        contentPadding = PaddingValues(
            start = EnigmaDSTheme.sizes.large,
            top = EnigmaDSTheme.sizes.medium,
            end = EnigmaDSTheme.sizes.large,
            bottom = EnigmaDSTheme.sizes.medium
        )
    ) {
        Text(
            text = text,
            style = EnigmaDSTheme.typography.button
        )
    }
}
