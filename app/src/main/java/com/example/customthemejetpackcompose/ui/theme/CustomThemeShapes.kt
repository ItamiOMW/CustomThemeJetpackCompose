package com.example.customthemejetpackcompose.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Immutable
data class CustomThemeShapes(
    val default: Shape = RoundedCornerShape(10.dp)
)
