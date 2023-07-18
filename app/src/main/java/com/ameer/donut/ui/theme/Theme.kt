package com.ameer.donut.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val localSpacing = compositionLocalOf { Spacing() }

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = lightPrimary,
    onPrimary = Color.White,

    secondary = lightSecondary,
    onSecondary = lightPrimary,

    tertiary = Pink40,


    background = Color.White,
    surface = Color(0xFFFFFBFE),
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),

    )

val MaterialTheme.spacing: Spacing
    @Composable
    @ReadOnlyComposable
    get() = localSpacing.current

@Composable
fun DonutTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val systemUiController = rememberSystemUiController()

    val colorsTheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    systemUiController.setSystemBarsColor(
        color = colorsTheme.background,
        darkIcons = !darkTheme
    )

    CompositionLocalProvider(localSpacing provides Spacing()) {
        MaterialTheme(
            colorScheme = colorsTheme,
            typography = Typography,
            shapes = Shapes,
            content = content,

            )
    }


}