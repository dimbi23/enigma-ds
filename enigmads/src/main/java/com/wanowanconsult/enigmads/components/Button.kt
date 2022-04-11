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
import com.wanowanconsult.enigmads.ui.EnigmaTheme

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = EnigmaTheme.colors.primary,
            contentColor = EnigmaTheme.colors.textReverse
        ),
        contentPadding = PaddingValues(
            start = EnigmaTheme.sizes.large,
            top = EnigmaTheme.sizes.medium,
            end = EnigmaTheme.sizes.large,
            bottom = EnigmaTheme.sizes.medium
        )
    ) {
        Text(
            text = text,
            style = EnigmaTheme.typography.button
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
            contentColor = EnigmaTheme.colors.primary
        ),
        border = BorderStroke(1.dp, EnigmaTheme.colors.primary),
        contentPadding = PaddingValues(
            start = EnigmaTheme.sizes.large,
            top = EnigmaTheme.sizes.medium,
            end = EnigmaTheme.sizes.large,
            bottom = EnigmaTheme.sizes.medium
        )
    ) {
        Text(
            text = text,
            style = EnigmaTheme.typography.button
        )
    }
}
