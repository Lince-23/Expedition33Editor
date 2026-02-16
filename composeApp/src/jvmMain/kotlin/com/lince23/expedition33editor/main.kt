package com.lince23.expedition33editor

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Expedition33Editor",
    ) {
        App()
    }
}