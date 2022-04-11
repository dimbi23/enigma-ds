package com.wanowanconsult.enigmads.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
fun EnigmaDSTheme(
    colors: EnigmaDSColorPalette = enigmaDSLightColorPalette(),
    typography: EnigmaDSTypography = EnigmaDSTypography(),
    children: @Composable() () -> Unit
) {
    CompositionLocalProvider(
        LocalEnigmaColors provides colors,
        LocalEnigmaTypography provides typography,
    ) {
        MaterialTheme(
            colors = colors.materialColors,
            typography = typography.materialTypography
        ) {
            children()
        }
    }
}

object EnigmaDSTheme {
    val colors: EnigmaDSColorPalette
        @Composable
        @ReadOnlyComposable
        get() = LocalEnigmaColors.current

    val typography: EnigmaDSTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalEnigmaTypography.current

    val sizes: EnigmaDSSize
        @Composable
        @ReadOnlyComposable
        get() = EnigmaDSSize()
}

internal val LocalEnigmaColors = staticCompositionLocalOf { enigmaDSLightColorPalette() }
internal val LocalEnigmaTypography = staticCompositionLocalOf { EnigmaDSTypography() }