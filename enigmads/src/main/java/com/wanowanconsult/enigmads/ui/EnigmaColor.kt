package com.wanowanconsult.enigmads.ui

import android.annotation.SuppressLint
import androidx.compose.ui.graphics.Color
import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors

object EnigmaColors {
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

interface EnigmaColorPalette {
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


fun enigmaLightColorPalette(): EnigmaColorPalette = object : EnigmaColorPalette {
    override val primary: Color = EnigmaColors.primary
    override val background: Color = EnigmaColors.background
    override val basic: Color = EnigmaColors.basic
    override val disable: Color = EnigmaColors.disable
    override val text: Color = EnigmaColors.text
    override val textReverse: Color = EnigmaColors.textReverse
    override val success: Color = EnigmaColors.success
    override val link: Color = EnigmaColors.link
    override val warning: Color = EnigmaColors.warning
    override val error: Color = EnigmaColors.error

    @SuppressLint("ConflictingOnColor")
    override val materialColors: Colors = lightColors(
        primary = EnigmaColors.primary,
        background = EnigmaColors.background,
        surface = EnigmaColors.background,
        onSurface = EnigmaColors.text,
    )
}

fun enigmaDarkColorPalette(): EnigmaColorPalette = object : EnigmaColorPalette {
    override val primary: Color = EnigmaColors.primary
    override val background: Color = EnigmaColors.backgroundReverse
    override val basic: Color = EnigmaColors.basic
    override val disable: Color = EnigmaColors.disable
    override val text: Color = EnigmaColors.textReverse
    override val textReverse: Color = EnigmaColors.text
    override val success: Color = EnigmaColors.success
    override val link: Color = EnigmaColors.link
    override val warning: Color = EnigmaColors.warning
    override val error: Color = EnigmaColors.error

    @SuppressLint("ConflictingOnColor")
    override val materialColors: Colors = darkColors(
        primary = EnigmaColors.primary,
        background = EnigmaColors.backgroundReverse,
        surface = EnigmaColors.backgroundReverse,
        onSurface = EnigmaColors.textReverse
    )
}