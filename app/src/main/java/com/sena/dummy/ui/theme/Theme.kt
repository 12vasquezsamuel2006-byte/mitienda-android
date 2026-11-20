package com.sena.dummy.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Green80,
    secondary = GreenGrey80,
    tertiary = Orange80,
    background = DarkBackground,
    surface = DarkBackground,
    surfaceVariant = DarkSurfaceVariant,
    primaryContainer = Color(0xFF005138),
    onPrimaryContainer = Color(0xFFA0F5CB),
    onPrimary = Color(0xFF00382A)
)

private val LightColorScheme = lightColorScheme(
    primary = Green40,
    secondary = GreenGrey40,
    tertiary = Orange40,
    background = LightBackground,
    surface = LightBackground,
    surfaceVariant = LightSurfaceVariant,
    primaryContainer = Color(0xFFA0F5CB),
    onPrimaryContainer = Color(0xFF002114),
    onPrimary = Color.White
)

@Composable
fun MiTiendaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // false = usa nuestra paleta fija (true tomaría los colores del fondo de pantalla)
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}