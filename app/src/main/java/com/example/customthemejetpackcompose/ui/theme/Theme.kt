package com.example.customthemejetpackcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

private val lightTheme = CustomThemeColors(
    textPrimary = Color.Black,
    textSecondary = Color.LightGray,
    background = Color.White,
    onBackground = Color.Black,
    error = Color.Red,
    white = Color.White,
    black = Color.Black
)

private val darkTheme = CustomThemeColors(
    textPrimary = Color.White,
    textSecondary = Color.LightGray,
    background = Color.Black,
    onBackground = Color.White,
    error = Color.Red,
    white = Color.White,
    black = Color.Black
)

private val typography = CustomThemeTypography()
private val shapes = CustomThemeShapes()

private val CustomThemeColorsProvider = staticCompositionLocalOf { lightTheme }
private val CustomThemeTypographyProvider = staticCompositionLocalOf { typography }
private val CustomThemeShapesProvider = staticCompositionLocalOf { shapes }

object CustomTheme {

    val colors: CustomThemeColors
        @Composable
        get() = CustomThemeColorsProvider.current

    val typography: CustomThemeTypography
        @Composable
        get() = CustomThemeTypographyProvider.current

    val shapes: CustomThemeShapes
        @Composable
        get() = CustomThemeShapesProvider.current
}

@Composable
fun CustomTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        CustomThemeColorsProvider provides if (isDarkTheme) darkTheme else lightTheme,
        CustomThemeTypographyProvider provides typography,
        CustomThemeShapesProvider provides shapes,
        content = content
    )
}