package com.lince23.expedition33editor.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import expedition33editor.composeapp.generated.resources.Cinzel_VariableFont_wght
import expedition33editor.composeapp.generated.resources.IMFellDoublePica_Regular
import expedition33editor.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

val baseline = Typography()

@Composable
fun Cinzel() = FontFamily(
    Font(Res.font.Cinzel_VariableFont_wght)
)

@Composable
fun IMFellDoublePica() = FontFamily(
    Font(Res.font.IMFellDoublePica_Regular, FontWeight.Normal)
)

@Composable
fun AppTypography(): Typography {
    val imFellDoublePicaFontFamily = IMFellDoublePica()
    val cinzelFontFamily = Cinzel()
    return remember {
        Typography().run {
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
    }
}