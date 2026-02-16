package com.lince23.expedition33editor.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import expedition33editor.composeapp.generated.resources.Cinzel_VariableFont_wght
import expedition33editor.composeapp.generated.resources.IMFellDoublePica_Regular
import expedition33editor.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

val baseline = Typography()

@Composable
fun Cinzel() = FontFamily(
    Font(Res.font.Cinzel_VariableFont_wght, FontWeight.Normal),
    Font(Res.font.Cinzel_VariableFont_wght, FontWeight.Bold),
    Font(Res.font.Cinzel_VariableFont_wght, FontWeight.Light),
    Font(Res.font.Cinzel_VariableFont_wght, FontWeight.Medium),
    Font(Res.font.Cinzel_VariableFont_wght, FontWeight.Thin)
)

@Composable
fun IMFellDoublePica() = FontFamily(
    Font(Res.font.IMFellDoublePica_Regular, FontWeight.Normal),
    Font(Res.font.IMFellDoublePica_Regular, FontWeight.Bold),
    Font(Res.font.IMFellDoublePica_Regular, FontWeight.Light)
)

@Composable
fun AppTypography() = Typography().run {
    val imFellDoublePicaFontFamily = IMFellDoublePica()
    val cinzelFontFamily = Cinzel()
    copy(
        displayLarge = baseline.displayLarge.copy(fontFamily = cinzelFontFamily),
        displayMedium = baseline.displayMedium.copy(fontFamily = cinzelFontFamily),
        displaySmall = baseline.displaySmall.copy(fontFamily = cinzelFontFamily),
        headlineLarge = baseline.headlineLarge.copy(fontFamily = cinzelFontFamily),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = cinzelFontFamily),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = cinzelFontFamily),
        titleLarge = baseline.titleLarge.copy(fontFamily = cinzelFontFamily),
        titleMedium = baseline.titleMedium.copy(fontFamily = cinzelFontFamily),
        titleSmall = baseline.titleSmall.copy(fontFamily = cinzelFontFamily),
        bodyLarge = baseline.bodyLarge.copy(fontFamily = imFellDoublePicaFontFamily),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = imFellDoublePicaFontFamily),
        bodySmall = baseline.bodySmall.copy(fontFamily = imFellDoublePicaFontFamily),
        labelLarge = baseline.labelLarge.copy(fontFamily = imFellDoublePicaFontFamily),
        labelMedium = baseline.labelMedium.copy(fontFamily = imFellDoublePicaFontFamily),
        labelSmall = baseline.labelSmall.copy(fontFamily = imFellDoublePicaFontFamily)
    )
}