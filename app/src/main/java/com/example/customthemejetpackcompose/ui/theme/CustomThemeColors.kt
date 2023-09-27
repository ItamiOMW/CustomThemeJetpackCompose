package com.example.customthemejetpackcompose.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color


@Immutable
data class CustomThemeColors(
    val textPrimary: Color,
    val textSecondary: Color,

    val background: Color,
    val onBackground: Color,

    val error: Color,

    val white: Color,
    val black: Color,
)
