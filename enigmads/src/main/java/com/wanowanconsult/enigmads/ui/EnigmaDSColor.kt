package com.wanowanconsult.enigmads.ui

import android.annotation.SuppressLint
import androidx.compose.ui.graphics.Color
import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors

object EnigmaDSColors {
    val primary = Color(0xFF3366FF)
    val background = Color(0xFFFFFFFF)
    val backgroundReverse = Color(0xFF192038)
    val basic = Color(0xFF8F9BB3)
    val disable = basic.copy(alpha = 0.24f)
    val text = Color(0xFF192038)
    val textReverse = Color(0xFFFFFFFF)
    val success = Color(0xFF00E096)
    val link = Color(0xFF0095FF)
    val warning = Color(0xFFFFAA00)
    val error = Color(0xFFFF3D71)
}

interface EnigmaDSColorPalette {
    val primary: Color
    val background: Color
    val basic: Color
    val disable: Color
    val text: Color
    val textReverse: Color
    val success: Color
    val link: Color
    val warning: Color
    val error: Color

    val materialColors: Colors
}


fun enigmaDSLightColorPalette(): EnigmaDSColorPalette = object : EnigmaDSColorPalette {
    override val primary: Color = EnigmaDSColors.primary
    override val background: Color = EnigmaDSColors.background
    override val basic: Color = EnigmaDSColors.basic
    override val disable: Color = EnigmaDSColors.disable
    override val text: Color = EnigmaDSColors.text
    override val textReverse: Color = EnigmaDSColors.textReverse
    override val success: Color = EnigmaDSColors.success
    override val link: Color = EnigmaDSColors.link
    override val warning: Color = EnigmaDSColors.warning
    override val error: Color = EnigmaDSColors.error

    @SuppressLint("ConflictingOnColor")
    override val materialColors: Colors = lightColors(
        primary = EnigmaDSColors.primary,
        background = EnigmaDSColors.background,
        surface = EnigmaDSColors.background,
        onSurface = EnigmaDSColors.text,
    )
}

fun enigmaDSDarkColorPalette(): EnigmaDSColorPalette = object : EnigmaDSColorPalette {
    override val primary: Color = EnigmaDSColors.primary
    override val background: Color = EnigmaDSColors.backgroundReverse
    override val basic: Color = EnigmaDSColors.basic
    override val disable: Color = EnigmaDSColors.disable
    override val text: Color = EnigmaDSColors.textReverse
    override val textReverse: Color = EnigmaDSColors.text
    override val success: Color = EnigmaDSColors.success
    override val link: Color = EnigmaDSColors.link
    override val warning: Color = EnigmaDSColors.warning
    override val error: Color = EnigmaDSColors.error

    @SuppressLint("ConflictingOnColor")
    override val materialColors: Colors = darkColors(
        primary = EnigmaDSColors.primary,
        background = EnigmaDSColors.backgroundReverse,
        surface = EnigmaDSColors.backgroundReverse,
        onSurface = EnigmaDSColors.textReverse
    )
}