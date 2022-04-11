package com.wanowanconsult.enigmads.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
fun DlsTheme(
    colors: EnigmaColorPalette = enigmaLightColorPalette(),
    typography: EnigmaTypography = EnigmaTypography(),
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

object EnigmaTheme {
    val colors: EnigmaColorPalette
        @Composable
        @ReadOnlyComposable
        get() = LocalEnigmaColors.current

    val typography: EnigmaTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalEnigmaTypography.current

    val sizes: EnigmaSize
        @Composable
        @ReadOnlyComposable
        get() = EnigmaSize()
}

internal val LocalEnigmaColors = staticCompositionLocalOf { enigmaLightColorPalette() }
internal val LocalEnigmaTypography = staticCompositionLocalOf { EnigmaTypography() }